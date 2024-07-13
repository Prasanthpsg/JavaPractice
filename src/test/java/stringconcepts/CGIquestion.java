package stringconcepts;

import java.util.HashSet;
import java.util.Set;

public class CGIquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="test java test selenium cucumber";
		
		String[] str= s.split(" ");
		StringBuilder sb = new StringBuilder(); boolean b =true;
		
		for(int i=0;i<str.length;i++) {
			b =true;
			
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					b =false;
					break;
				}else {
					 b =true;
				}
				
			}
			
			if(b) {
				sb.append(str[i]).append(" ");
			}
		}
		
		System.out.println(sb.toString().trim());
		
		
		// scenario 2
		String s1 ="test java test selenium cucumber";
		
		Set<String> set = new HashSet<>();
		String[] str1= s1.split(" ");
		
		for(String in:str1) {
			set.add(in);
		}
		
		System.out.println(set);
		
		for(String x: set) {
			System.out.print(x.concat(" "));
		}
	}

}
