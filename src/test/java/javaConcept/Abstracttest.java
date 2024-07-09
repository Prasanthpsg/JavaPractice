package javaConcept;

public class Abstracttest extends Abstractconcept{



	Abstracttest(int m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Abstracttest(10).abmessage();
		new Abstracttest(7).abmessage2();
		Abstracttest.mess();
	//	z=10; not possible because z is declared as a final variable

	}

	@Override
	public void abmessage2() {
		System.out.println("implementation in the child class");
	}
	
	@Override
	public void abmessage() {
		System.out.println("in the child class - abmessage implementation");
	}

}
