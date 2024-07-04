package Testing.TestJava;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="Hello";
		String s2= "world"; //string literal - will be available in string constant pool
		String s3 = s1+s2;
		s3.intern();//scp
		String s4="Helloworld";
		System.out.println(s3==s4); //true
		System.out.println(s3.equals(s4)); //true
		
		String s5="Hello";
		String s6= "world"; //string literal - will be available in string constant pool
		String s7 = s5.concat(s6); // new sting, it will be stored in the heap memory
		//s3.intern();
		String s8="Helloworld";
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8)); //true
		
		
		
		
		

	}

}
