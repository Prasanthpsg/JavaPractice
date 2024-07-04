package Bankingepam;

public class Bank {

	public static void main(String[] args) {
		
//		imp a = () -> {System.out.println("Functional");};
//		a.UPItrans();
		
		context b = new context() {

			@Override
			void UPI() {
				System.out.println("abstract UPI");
				
			}};
			
		
		b.atmcard();
		b.deposit();
		b.withdraw();
		b.UPI();

	}

	

	
//	@Override
//	public void UPItrans() {
//		System.out.println("main class UPI");
//	}

}

abstract class context {
	
	public void deposit() {
		System.out.println("Deposit");
	}
	
	public void withdraw() {
		System.out.println("withdraw");
	}
	
	public void atmcard() {
		System.out.println("atmcard");
	}
	
	abstract void UPI();
	
}

class simple extends context{

	@Override
	void UPI() {
		// TODO Auto-generated method stub
		
	}
	
}
