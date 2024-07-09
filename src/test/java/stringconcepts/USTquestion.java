package stringconcepts;

public class USTquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="hi hello";int counter =0;
		
		//ol lehih
		
		StringBuffer sb = new StringBuffer();
		
		String[] str = s.split(" ");
		for(int i=str[1].length()-1;i>=0;i--) {
			
			if(counter<=2) {
			sb.append(str[1].charAt(i));
			counter++;
			}
			
			if(counter==2) {
				break;
			}
		}
		
		System.out.println(sb.append(" "));
		
		 int len = str[1].length()-counter;
		 
		 for(int j=len-1;j>=0;j--) {
			 sb.append(str[1].charAt(j));
		 }
		 
		// System.out.println(sb.toString()); //ol leh
		 
		 for(int i=str[0].length()-1;i>=0;i--) {
			 sb.append(str[0].charAt(i));
		 }
		 
		 System.out.println(sb.toString()); //ol lehih

	}

}
