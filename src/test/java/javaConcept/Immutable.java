package javaConcept;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = new String("testng");
		String k = "concept";
		//s.concat(k);
		//System.out.println(s); // print testng
		
		String m = s.concat(k);
		System.out.println(m); //print testngconcept
		

	}

}
