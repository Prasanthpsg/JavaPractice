package javaConcept;

public class OOPStest implements Interfaceconcept {
	
	

	public static void main(String[] args) {
		
		//Interfaceconcept ic = new Interfaceconcept(); //Cannot instantiate the type Interfaceconcept -> cannot create object for interface
		Interfaceconcept ic = new OOPStest(); //Although we are not directly creating an object of the interface, we are achieving a similar effect by referencing the object through the interface type. 
		
		
		new OOPStest().imessage();
		Interfaceconcept.imessage2(); // static method
		new OOPStest().imessage3(); // default method
		//ic.imessage3();
		
		System.out.println(Interfaceconcept.i);

	}

	@Override
	public void imessage() {
		System.out.println("Interface implementation method");
	}

}
