package javaConcept;

@FunctionalInterface
interface t{
	
	public void high();
}

public class LambdawithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t obj = () -> {System.out.println("interface");};
		
		obj.high();

	}

}
