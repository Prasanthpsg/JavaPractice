package Testing.TestJava;

public class Printsplcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "c=**sd1212^tr%";
		
		char[] c3= input.toCharArray();
		
		
		for (int i = 0; i < c3.length; i++) {
			if(!Character.isLetterOrDigit(c3[i])) {
				System.out.print(c3[i]);
			}
		}
	}

}
