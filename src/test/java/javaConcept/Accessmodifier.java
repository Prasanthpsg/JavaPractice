package javaConcept;

import org.testng.annotations.Test;

//parent/base class
public class Accessmodifier {
	

	@Test
	private static void privatemethod() { // cannot access by other classes
		
		int inti = 10;
		System.out.println("var: "+inti);
	}
	
	@SuppressWarnings("unused")
	private void test1() {
		Accessmodifier.privatemethod(); // private method can be accessed by same class methods
	}
	
	@Test
	void defaultmethod() { // default method can be accessed by same package classes
		int defaultvar1 =12;
		System.out.println("Default method - variable :" +defaultvar1);
	}
	
	protected static void protectedmethod() {
		int j = 123;
		System.out.println("Protected method - variable :" +j); // protected method can be accessed by child class (regardless of packages)
	}
	
	protected  void protectedmethod1() {
		int p = 1234;
		System.out.println("Protected method - variable :" +p); // protected method can be accessed by child class (regardless of packages)
	}
	
	void eat(){ // used to check method overriding
		System.out.println("Eat method in the parent/base class");
	}

}
