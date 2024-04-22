package Testing.TestJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strinput = "Testing"; String strrev ="";
		
		// convert String to character array
        // by using toCharArray
		char[] c = strinput.toCharArray();
		
		for (int i = c.length-1; i >= 0; i--) {
			strrev = strrev + c[i];
		}
		
		System.out.println(strrev);
		
		
		//string builder method
		
		StringBuilder s = new StringBuilder();
		
		s.append(strinput);
		
		System.out.println(s.reverse());
		
		
		// conversion from String object to StringBuffer
		
		StringBuffer sb = new StringBuffer(strinput);
		System.out.println(sb.reverse());
	}

}
