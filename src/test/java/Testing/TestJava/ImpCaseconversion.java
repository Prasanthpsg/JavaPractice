package Testing.TestJava;

public class ImpCaseconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// asked in infosys 2nd round
		
		String strinput = "pRaSaNtH";
		
		char[] c = strinput.toCharArray();
		StringBuffer sb = new StringBuffer();
		
//		for (int i = 0; i < strinput.length(); i++) {
//			
//			if(strinput.charAt(i) >='a' && strinput.charAt(i) <='z') {
//				System.out.print(Character.toUpperCase(strinput.charAt(i)));
//			}else {
//				System.out.print(Character.toLowerCase(strinput.charAt(i)));
//			}
//		}
		
		
		for (int i = 0; i < c.length; i++) {
			
			if(c[i] >='a' && c[i] <= 'z') {
				//System.out.print(Character.toUpperCase(c[i]));
				sb.append(Character.toUpperCase(c[i]));
			}else {
				//System.out.print(Character.toLowerCase(c[i]));
				sb.append(Character.toLowerCase(c[i]));
			}
		}
		
		System.out.println(sb.toString()); // output: PrAsAnTh

	}

	

}
