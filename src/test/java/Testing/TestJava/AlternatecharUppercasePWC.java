package Testing.TestJava;

public class AlternatecharUppercasePWC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "prasanthkandasamy";
		
		char[] c = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		/*for(int i=1;i<c.length+1;i++) {
			
		if(!(i%2==0)) {
				System.out.print(Character.toUpperCase(c[i-1]));
			}else {
			System.out.print(c[i-1]);
		}
			
		}*/
		
		for (int i=1;i<c.length+1;i++) {
			
			sb= !(i%2==0)? sb.append(Character.toUpperCase(c[i-1])) : sb.append(c[i-1]);
		}
		
		System.out.println(sb.toString()); //PrAsAnThKaNdAsAmY
	}

}
