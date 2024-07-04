package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UncommonWordsfromTwoSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "this apple is sweet", s2 = "this apple is sour";
		
		String[] s1arr = s1.split(" ");
	//	String[] s2arr = s2.split(" ");
		String s3 = s1+" "+s2;
		Map<String,Integer> m = new HashMap<String,Integer>();
		Map<String,Integer> uncommonmap = new HashMap<String,Integer>();
		List<String> list = new ArrayList<String>();
		boolean nonrep = true;
		
		for(String str: s1arr) {
			
			if(m.containsKey(str)) {
				m.put(str, m.get(str)+1);
				nonrep = false;
				break;
			}else {
				m.put(str, 1);
				nonrep = true;
			}
		}//no use
		
		//System.out.println(m);
		
		if(nonrep) {
			
			for(String str3: s3.split(" ")) {
//				if(uncommonmap.containsKey(str3)) {
//					uncommonmap.put(str3, uncommonmap.get(str3)+1);
//				}else {
//					uncommonmap.put(str3, 1);
//				}
				
				uncommonmap.put(str3, uncommonmap.getOrDefault(str3,0)+1);
			}
			
			
				for(Entry<String, Integer> finalresult: uncommonmap.entrySet()) {
					if(finalresult.getValue()==1) {
						list.add(finalresult.getKey());
					}
				}
			}
		
		System.out.println(list);
		
		 // Converting List<String> to String[]
        String[] resultArray = new String[list.size()];
        resultArray = list.toArray(resultArray);
        System.out.println(Arrays.toString(resultArray));

	}

}
