package javaConcept;

public class MethodOverloading { // compile time polymorphism

	public void VerifyDSM() {
		System.out.println("In method without arguments");
	}
	
	public void VerifyDSM(int i) {
		System.out.println("In method with arguments "+i);
	}
	
	public void VerifyDSM(int i, String s) {
		System.out.println("In method with arguments "+i +s);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.VerifyDSM();
		m.VerifyDSM(23);
	}
}
