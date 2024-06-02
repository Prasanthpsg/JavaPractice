package Testing.TestJava;

import java.util.Arrays;

public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is Rajat";
		
		char[] c = str.toLowerCase().toCharArray();
		
		//sorting
		
		Arrays.sort(c);
		
		System.out.println(c);

	}

}
