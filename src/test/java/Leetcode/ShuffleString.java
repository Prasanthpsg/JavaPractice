package Leetcode;

import java.util.Arrays;

public class ShuffleString {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String[] str = new String[s.length()] ;
		
		for(int i=0;i<s.length();i++) {
			str[(indices[i])] = String.valueOf(s.charAt(i));
		}
		
		System.out.println(Arrays.toString(str));
		
		for(String str1: str) {
			System.out.print(str1); //leetcode
		}

	}

}
