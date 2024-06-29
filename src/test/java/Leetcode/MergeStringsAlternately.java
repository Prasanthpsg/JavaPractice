package Leetcode;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "abc"; String word2 = "pqr";
		StringBuffer b = new StringBuffer();
		//Output: "apbqcr"
		
		for(int i=0;i<word1.length();i++) {
			b.append(word1.charAt(i)).append(word2.charAt(i));
		}
		
		System.out.println(b.toString());
		

	}

}
