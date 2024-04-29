package javaConcept;

public class Accessmodifier2 {

	public static void main(String[] args) {
		
		// Try to access private method
		
		Accessmodifier am = new Accessmodifier();
		//am. 
		// privatemethod is not accessible.
		
		am.defaultmethod(); // default access modifier method can be accessed by the other classes with in the package
	}
	
	
	// Private 
	  // cannot have private class 
	  // if method is private, we cannot access from other class
	  // core to the concept of encapsulation
	  // All data will be hidden from the outside world:


	
	// Protected
	  // cannot have Protected class
	  // which ever class extending this protected class, can be accessed this property (regardless of packages)
	
	
	

}
