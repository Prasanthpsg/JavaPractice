package javaConcept;

public class OOPStest implements Interfaceconcept {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OOPStest().imessage();
		Interfaceconcept.imessage2();

	}

	@Override
	public void imessage() {
		System.out.println("Interface implementation method");
	}

}
