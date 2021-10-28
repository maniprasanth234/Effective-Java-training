package in.conceptarchitect.finance;

public class BankAccount{
	int acc_no;
	String name,password;
	double balance;
	static double interest_rate = 10;
	
	public int getAccNo(){
		return acc_no;
	}
	
	protected void setAccNo(int accNo){
		acc_no = accNo;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	protected String getPassword(){
		return proper(this.password);
	}
	
	protected void setPassword(String pass){
		this.password = salt(pass);
	}
	
	public double getBalance(){
		return balance;
	}
	
	protected void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getInterestRate(){
		return interest_rate;
	}
	
	public void setInterestRate(double irate){
		this.interest_rate = irate;
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
}
