class BankAccount{
	private long balance;

	public void setData(long amt) {
		if(amt >= 0) {
			balance = amt;
		}
		else {
			System.out.println("Invalid Amount");
			System.exit(0);
		}
	}

	public long getData(){
		return balance;
	}
}

public class EncapsulationBA {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
//		ba.balance = -100000;
//		System.out.println(ba.balance);
		ba.setData(10000000);
		System.out.println(ba.getData());
	
	
	
	
	
	
	}

}
