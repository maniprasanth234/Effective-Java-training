import java.util.*;

class Name{

	Scanner sc = new Scanner(System.in);
	
	public void setName(String name){

	while(true){

	System.out.println("1 name details");

	System.out.println("2 ReEnter name");
	
	int i=sc.nextInt();

	switch(i)
	{
	case 1:

	System.out.println("your name is:"+name);

	break;

	case 2:

	System.out.println("Enter Name");

	String rename=sc.next();

	name=rename;

	System.out.println("Your name is:"+name);
	

	break;

	case 0:
	
	System.exit(1);

	break;	
}

return;
}
}
}