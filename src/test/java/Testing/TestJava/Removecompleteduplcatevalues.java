package Testing.TestJava;

import java.util.ArrayList;
import java.util.List;

public class Removecompleteduplcatevalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// EPAM systems 1st round
		
		String str = "the jack is dog and the dog is lazy";
		StringBuffer sb = new StringBuffer(); boolean b = false; 
		List<String> strlist = new ArrayList<String>();
		
		String[] strarr = str.split(" ");
		
		for (int i = 0; i < strarr.length; i++) {
			b = false;
			
			if(!strlist.contains(strarr[i])) { // condition to check the input is already present in the duplicate list
			
		//	strlist.stream().forEach(n -> n.equals(strarr));{
			for (int j = i+1; j < strarr.length; j++) {
		
			if(strarr[i].equals(strarr[j])) {
				b = true;
				strlist.add(strarr[i]); // list to store duplicate values
				break;
			}
		
		} // inner loop
			if(b==false) {
				sb.append(strarr[i]+" ");
			}
			}
		} // outer loop
		
		System.out.println(sb.toString().trim());

	}

}
