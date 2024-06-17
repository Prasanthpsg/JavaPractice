package Testing.TestJava;

public class Checkonlylowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sfhdvcD"; // check the given string has only lower case
		
		char[] c = str.toCharArray(); boolean b = false;
		
		
		for(int i=0;i<c.length;i++) { // A to Z 65 - 91 // a to z 97 - 112
			
			if(c[i] >=97 && c[i]<=122) {  //(c[i] >='a' && c[i]<='z')
				b = true;
			}else {
				b = false;
				System.out.println(c[i]);
				break;
			}
		}
		
		if(b==false) {
			System.out.println("The string has upper case");
		}else {
			System.out.println("The string has only lowercase");
		}
		
		
		// check the given string has only upper case
		
		String str1 = "sfhdvcD";
		
		char[] c1 = str1.toCharArray(); boolean b1 = false;
		
		
		for(int i=0;i<c1.length;i++) { // A to Z 65 - 91 // a to z 97 - 112
			
			if(c1[i] >=65 && c1[i]<=91) { //(c[i] >='A' && c[i]<='Z')
				b1 = true;
			}else {
				b1 = false;
				System.out.println(c[i]);
				break;
			}
		}
		
		if(b1==false) {
			System.out.println("The string has lower case");
		}else {
			System.out.println("The string has only upper case");
		}

	}

}
