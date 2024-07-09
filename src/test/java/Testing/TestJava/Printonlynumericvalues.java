package Testing.TestJava;

import com.google.common.base.CharMatcher;

public class Printonlynumericvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Test122";
		
		String otherthandigits = str.replaceAll("[0-9]", ""); // o/p: Test
		System.out.println(otherthandigits);
		
		String onlydigits = str.replaceAll("[^0-9]", ""); // o/p: 122
		System.out.println(onlydigits);
		
		System.out.println(str.replaceAll("[^a-zA-Z]","")); // o/p: Test
		
		
		String onlydigits1 =str.replaceAll("\\D+",""); // o/p: 122
		System.out.println(onlydigits1);
		
		String onlychar1 =str.replaceAll("\\P{L}+",""); // o/p: Test
		System.out.println(onlychar1);
		
		String theDigits = CharMatcher.inRange('0', '9').retainFrom(str);  // o/p: 122
		
		System.out.println(theDigits);
		
		String str1 = "Test122";
		
		int v = Integer.parseInt(str1.replaceAll("[^0-9]", ""));//122
		int sum=0;
		
		while(v>0) {
			 sum = sum+v%10;
			 v =v/10;
		}
		
		System.out.println(sum); //5
	}

}
