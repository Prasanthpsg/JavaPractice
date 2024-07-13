package javaConcept;

public class AccessBNPquestion extends Accessmodifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessBNPquestion a = new AccessBNPquestion();
		a.defaultmethod();
		a.protectedmethod1();
		
		//No, we cannot override private methods . just like static and final methods, private methods in Java use static 
		//binding that is done at compile time.

	}

}
