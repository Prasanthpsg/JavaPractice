package javaConcept;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = new String("testng"); // create data in heap memory
		String k = "concept"; // string literal , string constant pool
		//s.concat(k);
		//System.out.println(s); // print testng
		
		String m = s.concat(k); // string literal , string constant pool
		System.out.println(m); //print testngconcept
		
		m = m.substring(0,3); // here after substring m will hold the new substring value. old value will be replaced by new value
		
		System.out.println(m); //tes
		

	}

}
