package javaConcept;

@FunctionalInterface
interface i{
	
	public abstract void display();
}

//class B implements i{
//
//	@Override
//	public void display() {
//		System.out.println("implementing interface");
//		
//	}
	
	
//}

public class FunctionalInterfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//anonymous inner class
		i obj = new i() {
			public void display() {
				System.out.println("implementing anonymous interface");
					
			}
		};
		obj.display();
		
		i obj1 = ()-> {System.out.println("Practice anonymous with lambda expression");};
		obj1.display();

	}

}
