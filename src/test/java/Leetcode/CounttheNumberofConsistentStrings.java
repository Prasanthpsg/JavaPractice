package Leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CounttheNumberofConsistentStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String allowed = "ab"; String[] words = {"ad","bd","aaab","baa","badab"};
		boolean entrycheck = false; int counter=0;
		
		for(String strinput: words) {
			Map<Character,Integer> map = new LinkedHashMap<>();
			
			for(int z=0;z<strinput.length();z++) {
				map.put(strinput.charAt(z), map.getOrDefault(strinput.charAt(z),0)+ 1);
//				if(map.containsKey(strinput.charAt(z))) {
//					map.put(strinput.charAt(z), map.get(strinput.charAt(z))+1);
//				}else {
//					map.put(strinput.charAt(z), 1);
//				}
			}
			
			
			for(Entry<Character,Integer> entry: map.entrySet()) {
				if(!(allowed.indexOf(entry.getKey())==-1)) {
					entrycheck = true;
				}else {
					entrycheck = false;
				}
			}
			
			
			if(entrycheck) {
				System.out.println(strinput);
				counter++;
			}
			
			
			//output
			//aaab
			//baa
			
		}
		
		System.out.println(counter);//2

	}

}
