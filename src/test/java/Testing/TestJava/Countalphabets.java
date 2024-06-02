package Testing.TestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Countalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strinput  ="Prasanthertibfeo"; //accenture interview
		
		char[] c = strinput.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < c.length; i++) {
			
			if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'  ) {
				
				if(hmap.containsKey(c[i])) {
					hmap.put(c[i],hmap.get(c[i])+1);
				}else {
					hmap.put(c[i], 1);
				}
			}
		}
		
		System.out.println(hmap);

	}

}
