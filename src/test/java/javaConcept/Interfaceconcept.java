package javaConcept;

public interface Interfaceconcept { // implemented by OOPStest class please refer
	
//	Interfaceconcept(){ //Interfaces cannot have constructors
//		
//	}
//	
	public static final int i = 12; // always static final
	int j =13; // always static final
	
	//naturally public and abstract
	void imessage(); //no need to mention public access modifier
	
	
	public static void imessage2() { // explicitly public access modifier is mentioned
		System.out.println("static method implementation in interface method");
	}
	
	default void imessage3() {
		System.out.println("Default method implementation in interface method");
		//Default methods were introduced to provide backward compatibility for old interfaces so that they can have new methods without affecting existing code.
	}
	
	default void t2() {
		
		// if we have default method, no need to implement this method logic to the already implemented class. so we are avoiding rework
	}

}
