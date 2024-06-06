package javaConcept;

public interface Java8interface {
	
	// till java 7 method will be public and abstract
	
	default void show() {
		
		System.out.println("java 8 interface");
	}
	
	static void show1() {
		
		System.out.println("java 8 interface");
	}

}
