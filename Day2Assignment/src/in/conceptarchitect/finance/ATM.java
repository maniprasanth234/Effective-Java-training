package in.conceptarchitect.finance;

import java.util.Scanner;

public class ATM {
	
	public static void main(String args[]) {
	
		BankAccount BA=new BankAccount(976,"Mani Prasanth","mani@",25000,10);
		
		Scanner sc=new Scanner(System.in);
		while(true){

			System.out.println("1 Account Details");
		 
			System.out.println("2 Withdraw");

			System.out.println("3 Deposit");

			System.out.println("4 password");
			
			System.out.println("5 interest rate");
			
			System.out.println("6 name");
			
			int i=sc.nextInt();

		      switch(i)

		      {

			 case 1:

			BA.show();

			break;

			 case 2:
			
			BA.withdraw(5000, "mani@");

			break;
			
			 case 3:
				 
				 BA.deposit(5000);
				break;
				
			 case 4:
				 BA.setPassword("****");
				 
				 break;
				 
			 case 5:
				 BA.setInterestRate(000);
				 break;
				 
			 case 6:
				 BA.setName("*****");
				 break;
				 
	 

			case 0:
		        
		         System.exit(0);

			break;
		      }

		   }
	}
	
	
	

}
