package Testing.TestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ImpFindwordoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pwc 1st round
		
		String strname = "i am Java developer i am proud of it";
		
		String[] strarr = strname.split(" ");
		
		HashMap<String, Integer> hmap = new LinkedHashMap<String, Integer>();
		
		for (String string : strarr) {
			if(hmap.containsKey(string)){
				hmap.put(string, hmap.get(string)+1);
			}else {
				hmap.put(string, 1);
			}
		}
		
		System.out.print(hmap);
		
		System.out.println();
		
		String strname1 = "prasanthkandasamy";
		
		char[] strarr1 = strname1.toCharArray();
		
		HashMap<Character, Integer> hmap1 = new LinkedHashMap<Character, Integer>();
		
		for(char c: strarr1) {
			
			if(hmap1.containsKey(c)) {
				hmap1.put(c, hmap1.get(c)+1);
			}else {
				hmap1.put(c, 1);
			}
		}
		System.out.print(hmap1);

	}

}
