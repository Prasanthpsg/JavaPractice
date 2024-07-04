package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JewelsandStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jewels = "aA", stones = "aAAbbbb"; //3
		//String jewels = "z", stones = "ZZ"; //0
		
		boolean entrycheck = false; int counter=0;
		
		for(Character strinput: stones.toCharArray()) {
			Map<Character,Integer> map = new LinkedHashMap<>();
			
			for(int z=0;z<strinput;z++) {
				map.put(strinput, map.getOrDefault(strinput,0)+ 1);
			}
			
			
			for(Entry<Character,Integer> entry: map.entrySet()) {
				if(!(jewels.indexOf(entry.getKey())==-1)) {
					entrycheck = true;
					counter++;
				}else {
					entrycheck = false;
				}
			}
		}
		
		System.out.println(counter);

	}

}
