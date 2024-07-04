package Leetcode;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PercentageofLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "foobar";
		char letter = 'o'; int occur =0;
		
//		Map<Character,Integer> map = new HashMap<>();
//		for(Character str1: s.toCharArray()) {
//			map.put(str1, map.getOrDefault(str1,0)+1);
//		}
//		
//		for(Entry<Character, Integer> set1: map.entrySet()) {
//			if(String.valueOf(set1.getKey()).equals(letter)) {
//				occur = set1.getValue();
//				break;
//			}
//		}
		
		occur = (int)(s.chars().filter(i -> i==letter).count());
		
		int formula = (int) (((double)occur/(double)s.length())*100);
		System.out.println(formula);
		
	}


}
