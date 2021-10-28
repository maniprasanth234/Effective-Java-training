package in.conceptarchitect.finance;

import java.util.Scanner;

public class ATM {

	BankAccount baccount = new BankAccount();
	public Bank bank = new Bank();
	public Scanner read = new Scanner(System.in);
	
	public ATM(){
		System.out.println("Your Account Number is : " + Bank.createAccount("abc", "DO#1", 20000));
		System.out.println("Your Account Number is : " + Bank.createAccount("thor", "THe@2", 30000));
	}

	public boolean depositAmount(int amt, BankAccount ba) {
		if(amt < 1){
			return false;
		}
		else{
			Bank.depositAmount(amt, ba);
			return true;
		}
	}

	public static boolean withdrawAmount(double amt, String pass, BankAccount ba) {
		if(amt < 1 && pass != ba.getPassword()){
			return false;
		}
		else{
			Bank.withdrawAmount(amt, ba);
			return true;
		}
	}

	public void creditInterest(BankAccount ba) {
		Bank.creditInterest(ba);
	}

	public void changePassword(String newpass, String oldpass, String retypepass, BankAccount ba) {
		bank.changePassword(newpass, oldpass, retypepass, ba);
	}
	
	
}
