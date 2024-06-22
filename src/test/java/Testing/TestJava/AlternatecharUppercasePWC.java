package Testing.TestJava;

public class AlternatecharUppercasePWC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "prasanthkandasamy";
		
		char[] c = str.toCharArray();
		
		for(int i=1;i<c.length+1;i++) {
			
			if(!(i%2==0)) {
				System.out.print(Character.toUpperCase(c[i-1]));
			}else {
				System.out.print(c[i-1]);
			}
		}
	}

}
