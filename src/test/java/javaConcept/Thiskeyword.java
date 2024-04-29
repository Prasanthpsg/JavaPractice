package javaConcept;

public class Thiskeyword {
	
	 int i =12;
	 
	 void verify() {
		 System.out.println(this.i);
	 }

	public static void main(String[] args) {
		Thiskeyword t = new Thiskeyword();
		t.verify();

	}

}
