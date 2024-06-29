package javaConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImpSortbasedonfrequency {

	public static void main(String[] args) {
		
		
		String s = "Aabbc";
		
		char[] c = s.toCharArray();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		
//		for(char ch: c) {
//			
//			if(hmap.containsKey(ch)) {
//				hmap.put(ch,  hmap.get(ch)+1);
//			}else {
//				hmap.put(ch, 1);
//			}
//				
//		}
		
		for(char ch: c) {
			
			hmap.merge(ch, 1, Integer::sum);
		}
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(hmap.entrySet());
		
		Collections.sort(list, (a,b) -> b.getValue().compareTo(a.getValue()));
		
		System.out.println(list); //[b=2, a=1, A=1, c=1] this is different behaviour
		
		StringBuffer sb = new StringBuffer();
		
		List<Character> list1 = new ArrayList<Character>(hmap.keySet());
		
		// descending based on the value/frequency -important line
		Collections.sort(list1, (a,b) -> hmap.get(b) - hmap.get(a)); // o/p: [b, a, A, c]
		
		//Collections.sort(list1, (a, b) -> b.compareTo(a)); //// Sort the character in descending order -> this is incorrect output -> [c, b, a, A] ->will sort based on character ASCII value
		
		// ascending based on the value/frequency
		//Collections.sort(list1, (a,b) -> hmap.get(a) - hmap.get(b)); // o/p: Aacbb
		
		System.out.println(list1); //[b, a, A, c]
		
		for(Character cm: list1) {
			
			if(hmap.get(cm)>1) {
				
				for(int z=0;z<hmap.get(cm);z++) {
					
					sb.append(cm);
				}
			}else {
				sb.append(cm);
			}
		}
		
		System.out.println(sb.toString());
	}}


