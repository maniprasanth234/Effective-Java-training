package in.conceptarchitect.finance;

public class Bank {

	static int accNumber = 1204568;
	static int count = 0;
	
	public static int createAccount(String name, String password, double amt) {
		
		BankAccount ba = new BankAccount();
		
		ba.setAccNo(accNumber++);
		ba.setName(name);
		ba.setPassword(password);
		depositAmount(amt, ba);
		count++;
		
		return accNumber;
	}
	
	public static void depositAmount(double amt, BankAccount ba){
			ba.setBalance(ba.balance + amt);
	}
	
	public static void withdrawAmount(double amt, BankAccount ba){
		ba.setBalance(ba.getBalance() - amt);
	}
	
	public static void creditInterest(BankAccount ba){
		ba.setBalance( ba.getBalance() + (ba.getBalance() * ba.getInterestRate() / 1200) );
	}
	
	public boolean changePassword(String newpass, String oldpass, String retypepass, BankAccount ba) {
		
		if(oldpass.equals(ba.getPassword()) && newpass.equals(retypepass)) {
				ba.setPassword(newpass);
				return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transferTo(BankAccount src, BankAccount dest, double amt, String pass) {
		if(amt < 1 && src.getPassword() != pass) {
			return false;
		}
		else {
			depositAmount(amt, dest);
			ATM.withdrawAmount(amt, pass, src);
			return true;
		}
	}
	
	public static void closeAccount(BankAccount ba) {
		ba = null;
	}
	
}