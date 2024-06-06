package stringconcepts;

public class Stringbasic {
	
	static int j ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = new String("hai"); // heap memory
		String s2 = new String("hai"); // heap memory
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		String s3 = "literal"; // string literal
		String s4 = "literal"; // string literal
		
		System.out.println(s3==s4); //true
		System.out.println(s3.equals(s3)); //true
		
		int z = 0; j =100;
		
		System.out.println("j: "+j);
		System.out.println("z: "+z);
		
		
				

	}

}
