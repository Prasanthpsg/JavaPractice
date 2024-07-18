package Testing.TestJava;

public class Impstringpwcquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strname ="prasanth"; String strrev ="";
		//hnasartp
		
		for(int i=strname.length()-1;i>=0;i--) {
			if(i!=strname.length()-2) {
			strrev = strrev+strname.charAt(i);
			}else {
				strrev = strrev+" ";
			}
		}
		
		//System.out.println(strrev.replaceFirst(" ", strname.charAt(strname.length()-2)));
		strrev = strrev.replace(" ", "t");
		System.out.println(strrev);

	}

}
