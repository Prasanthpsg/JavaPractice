package Testing.TestJava;

public class Countalphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ccsd1212^tr%";
		
		int alpha = 0, num =0, spl =0;
		
		char[] c2 = input.toCharArray();
		
		for (int i = 0; i < c2.length; i++) {
			
			if(c2[i] > 'a' &&  c2[i] < 'z' || c2[i] > 'A' &&  c2[i] < 'Z' ) {
				alpha++;
			}else if(c2[i] > '0' &&  c2[i] < '9') {
				num ++;
			}else {
				spl++;
			}
		}
		
		System.out.println("Alphabets: "+alpha);
		System.out.println("numeric: "+num);
		System.out.println("special char: "+spl);

	}

}
