package Testing.TestJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Secondmostfrequentchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geeksforgeekks";
		
		char[] c = s.toCharArray();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(char c1: c) {
			
			if(hmap.containsKey(c1)) {
				hmap.put(c1, hmap.get(c1)+1);
			}else {
				hmap.put(c1, 1);
			}
		}
		
		//before sorting
		System.out.println("Before sorting - map: "+hmap);
		
		//Set<Character> cset = hmap.keySet();
		
		//System.out.println(hmap.entrySet());
		
		List<Map.Entry<Character, Integer> > m = new ArrayList<Map.Entry<Character,Integer>>(hmap.entrySet());
		Collections.sort(m, (a, b) -> b.getValue().compareTo(a.getValue())); //// Sort the frequencies in descending order
		
		
		//After sorting
		System.out.println("After sorting - List: "+m);
		
		//Second most frequent char
		System.out.println(m.get(1).getKey());
		
		
		//Collections.sort(cset);

	}

}
