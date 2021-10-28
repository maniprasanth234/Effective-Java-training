package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.ATM;
import in.conceptarchitect.finance.Bank;
import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String args[]){
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		@SuppressWarnings("unused")
		BankAccount ba1 = new BankAccount();
		ATM atm = new ATM();
		
		
		while(true){
			System.out.println("1. Deposit\n2. Withdrawn\n3. Credit Interest\n4. Options \n5. Close Account \n0. Exit\nEnter your choice");
			switch(read.nextInt()){
				case 1:
					
					if(atm.depositAmount(10000, ba)) {
						System.out.println("Amount Deposited...");
					}
					else {
						System.out.println("Amount can't able to deposite...");
					}
					break;
				case 2:
					if(ATM.withdrawAmount(2000, "1234", ba)) {
						System.out.println("Please Collect your Cash before Leave...");
					}
					else {
						System.out.println("Can't able to dispense Amount...");
					}
					break;
				case 3:
					atm.creditInterest(ba);
					break;
				case 4:
					options(ba, atm);
					break;
				case 5:
					Bank.closeAccount(ba);
					break;
				case 0:
					return;
			}
		}
	}

	static void options(BankAccount ba, ATM atm){
	System.out.println("1. View Account Number \n2. View Interest Rate \n3. Change Interest Rate");
	System.out.println("4. View Account Holder Name \n5. Change Account Holder Name");
	System.out.println("6. View Balance \n7. Change Password \n 8. Close Account\n0. Exit");
	switch(atm.read.nextInt()){
		case 1:
			System.out.println("Account Number : " + ba.getAccNo());
			break;
		case 2:
			System.out.println("Interest Rate : " + ba.getInterestRate());
			break;
		case 3:
			System.out.print("Enter Interest Rate : ");
			ba.setInterestRate(atm.read.nextDouble());
			System.out.println("Changed Interest Rate : " + ba.getInterestRate());
			break;
		case 4:
			System.out.println("Account Holder Name : " + ba.getName());
			break;
		case 5:
			System.out.println("Enter changing Account Holder Name : ");
			ba.setName(atm.read.nextLine());
			break;
		case 6:
			System.out.println("Account Balance : " + ba.getBalance());
			break;
		case 7:
			atm.changePassword("Enter#1", "DO#1", "Enter#1", ba);
			break;
		case 0:
			return;
	}
}

}
