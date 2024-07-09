package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class commonprefixstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"flower","flow","flight"}; boolean b = true;
		StringBuffer sb = new StringBuffer(); int counter=0;
		
		while(b) {
			
			Set<String> set = new HashSet<String>();
			for(int i=0;i<strs.length;i++) {
			//if(strs[i].length()>counter) {
				set.add(String.valueOf(strs[i].charAt(counter)));
				b =true;
//			}else {
//				b = false;
//				break;
//			}
			
			}
			
			if(b) {
			if(set.size()!=1) {
				b=false;
				break;
			}else {
				sb.append(new ArrayList<>(set).get(0));
				counter++;
				b =true;
			}}
			
		
		}
		
		System.out.println(sb.toString()); //op: fl

	}

}
