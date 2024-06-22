package javaConcept;

class A{
	
	public void show() {
		System.out.println("A class show");
	}
}


//class B extends A {
//	public void show() {
//		System.out.println("B class show");
//	}
//}

public class ImpAnonymousclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// note: if we want to give implementation for abstract / interface methods only once we can use  Anonymous inner class
		A obj = new A() { //Anonymousclass
			
			public void show() {
			System.out.println("new class show");
			}
		};
		obj.show();

	}

}
