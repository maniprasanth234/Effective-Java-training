import java.util.*;

public class main {

   public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Account No: ");

        int Account=sc.nextInt();

	System.out.print("Enter Name");

        String name=sc.next();

      System.out.print("Enter Balance");

       Double Balance=sc.nextDouble(); 

      System.out.print("Enter Password:");

      String Password=sc.next();
	
	Name N=new Name();

	Balance B=new Balance();

	Intersest_Rate I=new Intersest_Rate();

      while(true){

	System.out.println("1 Account No");
 
	System.out.println("2 Name");

	System.out.println("3 Balance");

	System.out.println("4 Interest rate");
	
	int i=sc.nextInt();

      switch(i)

      {

	 case 1:

	System.out.println("your Account Number is:" +Account);

	break;

	 case 2:
	
	System.out.println("your name is:"+name);

	N.setName(name);

	break;

	 case 3:

      System.out.println("your Balance is:"+Balance);

	while(true){
	
	System.out.println("1 Deposit");

	System.out.println("2 Withdraw");
	int j=sc.nextInt();
	switch(j){
	case 1:

	B.Deposit(Balance);
	
	break;
	
	case 2:
	
	B.Withdraw(Balance,Password);

	break;

	default:

	   return;



}
//return;
}



	 case 4:

           I.Interset(Balance);

	

	break;

	 default:

	   System.out.println("Out of Order ");

	break;

	case 0:
        
         System.exit(0);

	break;
      }

   }

   }
}