package in.conceptarchitect.finance;

import java.util.Scanner;

public class BankAccount {
	
	int accountNumber;
	String name;
	String password;
	double balance;
	double interestRate;
	private String salted;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	//account number can't be changed
	//public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

	//should there be a getPassword and setPassword

	public String getPassword() {
		System.out.println(password);
		return password;
	}

	public void setPassword(String password) {
		
		this.password = salt(password);
	}

	

private String salt(String password) {
		
		String salted="";
		
		for(int i=0;i<password.length();i++) {
			int ch= (int) password.charAt(i);
			salted+=Integer.toHexString(ch);
		}
		
		return salted;
	}
	
		private String proper(String salted){
			
			String proper = "";
			
			char[] charArray = salted.toCharArray();
			for(int i=0;i<charArray.length;i=i+2) {
				String st =""+charArray[i]+""+charArray[i+1];
				char ch = (char)Integer.parseInt(st,16);
				proper+=ch;
			}
			
			return proper;			
		}


	public BankAccount(int accountNumber, String name, String password, double amount,double interestRate) {
		
		balance=amount; //this is optional here as there is a single balance in the context	
		this.name=name;
		setPassword(password);
		this.interestRate=interestRate;
		this.accountNumber=accountNumber;
		
	}
	
	public void show() {
		System.out.println("account number\t"+accountNumber);
		System.out.println("name         \t"+name);
		System.out.println("password     \t"+password);
		System.out.println("balance      \t"+balance);
		System.out.println("interest rate\t"+interestRate);
		System.out.println("password proper\t"+proper(password));
		
	}

	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance+=amount;
			return false;
		} else {
			return true;
		}
	}

	public boolean withdraw(double amount, String password) {
		// TODO Auto-generated method stub
		if(amount <=0) {
			return false;
		}
		if (amount>balance) {
			return false;
		} 
		if (!this.password.equals(password))
			return false;
		else {
			
			balance-=amount;
			return true;
		}
	}
	
	public void creditInterest() {
		balance+=(balance*interestRate/1200);
	}


}
