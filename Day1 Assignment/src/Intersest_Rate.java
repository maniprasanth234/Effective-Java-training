import java.util.*;

class Intersest_Rate{
 
	Scanner sc=new Scanner(System.in);

	public void Interset(Double Balance){
		
		Double rate=0.60;

		System.out.println("Your Interest Rate:"+rate);

		System.out.println("Your balance:"+Balance);

	   	Balance+=(Balance*rate/1200);
	
		System.out.println("Your interest to balance for this month is:"+Balance);
}
} 