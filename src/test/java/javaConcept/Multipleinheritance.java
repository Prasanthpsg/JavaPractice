package javaConcept;

public class Multipleinheritance implements AB,BC{
	
	
	
	public static void main(String[] args) {
		Multipleinheritance m = new Multipleinheritance();
		m.hai();
		
	}

	@Override
	public void hai() {
		System.out.println("implementation added");
	}


	

}

interface AB{
	void hai();
}

interface BC{
	void hai();
}
