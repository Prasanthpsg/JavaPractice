package Leetcode;

import java.util.Arrays;
import java.util.*;

public class SortingSentencebasedonposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "is2 sentence4 This1 a3";
		//Output: "This is a sentence"
		
		String[] strarr = s.split(" ");
		String[] output = new String[strarr.length];
		StringBuffer sb = new StringBuffer();
		
		for(int i =0;i<strarr.length;i++) {
			int pos =Character.getNumericValue(strarr[i].charAt(strarr[i].length()-1));
			output[pos-1] = strarr[i].substring(0,strarr[i].length()-1);
		}
		
		System.out.println(Arrays.toString(output));
		
//		for(String o: output) {
//			sb.append(o).append(" ");
//		}
//		
//		System.out.println(sb.toString().strip());
		
		System.out.println(String.join(" ", output)); //This is a sentence
		
		//using array list
		String s1 = "is2 sentence4 This1 a3";
		
		String[] strarr1 = s1.split(" ");
		
		List<String> strlist = new ArrayList<>(List.of(strarr1));
		for(String word: strarr1) {
			int pos =Character.getNumericValue(word.charAt(word.length()-1));
			strlist.set(pos-1, word.substring(0,word.length()-1));
		}
		
		System.out.println(String.join(" ", strlist)); //This is a sentence
		

	}

}
