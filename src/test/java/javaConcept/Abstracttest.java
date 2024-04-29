package javaConcept;

public class Abstracttest extends Abstractconcept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Abstracttest().abmessage();
		new Abstracttest().abmessage2();

	}

	@Override
	void abmessage2() {
		System.out.println("implementation in the child class");
	}

}
