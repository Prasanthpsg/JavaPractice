/**
 * 
 */
package javaConcept;

/**
 * 
 */
public abstract class Abstractconcept { // extended by Abstracttest class
	
	int y =12; static int m;
	static final int z=9;
	
	Abstractconcept(int m){
		// can have constructor
		this.m =m;
	}
	
	void abmessage() {
		System.out.println("with method implementation "+m);
	}
	
	static void mess() {
		System.out.println("static method implementation "+m); //The reason for this is Static methods do not work on 
		//the instance of the class, they are directly associated with the class itself.
	}
	
//	default void mess1() { 
//		//Default methods are allowed only in interfaces. not in abstract.
	//Abstract classes, on the other hand, already had the ability to provide method implementations before Java 8, so there was no need 
	//to introduce default methods for abstract classes. Abstract classes are designed to be extended by subclasses, which can override the abstract
	//methods and customize the behavior as needed. Abstract classes can have concrete methods that provide a default implementation that subclasses can 
	//choose to override or use as-is.
//	}

	 public abstract void abmessage2(); // no implementation
}
