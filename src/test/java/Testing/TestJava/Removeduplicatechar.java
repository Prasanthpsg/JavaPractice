package Testing.TestJava;

public class Removeduplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strdup = "Prasanthkandasamy";
		
		char[] c4= strdup.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean b = false;
		
		for (int i = 0; i < c4.length; i++) {
			b = false;
			for(int j=i+1; j<c4.length; j++) {
				if(c4[i]==c4[j]) {
					b = true;
					break;
				}
			}
			
			if(b==false) {
				sb.append(c4[i]);
			}
		}
		
		System.out.println(sb); //op: Prthkndsamy

	}

}
