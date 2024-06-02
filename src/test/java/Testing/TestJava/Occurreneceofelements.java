package Testing.TestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Occurreneceofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "PrasanthP";
		
		char[] c = s.toCharArray(); //infosys 1st round
		
		HashMap<Character, Integer> h = new LinkedHashMap<Character, Integer>();
		
		for (char d : c) {
			if(h.containsKey(d)) {
				h.put(d, h.get(d)+1);
			}else {
				h.put(d, 1);
			}
		}
		
		System.out.println(h);
		
		Set<Character> keyset1 = h.keySet();
		
		for (Character character : keyset1) {
			//System.out.println(character);
		}
		
		int maxcount = 0;
		Character maxchar = 0;
		
		for(Entry<Character, Integer> count : h.entrySet()) {
			
			//System.out.println(count.getValue());
			
			if(count.getValue()>maxcount) {
				
				maxcount = count.getValue();
				maxchar = count.getKey();
			}
		}
		
		System.out.println("KEY: "+maxchar +" - "+"VALUE: "+maxcount);
	}

}
