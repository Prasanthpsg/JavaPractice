package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortthePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
	//	Mary 180
	//	Emma 170
	//	John 165
		
		Map<Integer,String> map = new TreeMap<Integer,String>();
		for(int k=0;k<names.length;k++) {
			map.put(heights[k], names[k]);
		}
		
		Arrays.sort(heights);
	
	for(int i=heights.length-1;i>=0;i--) {
		System.out.print(map.get(heights[i]) +" "+heights[i]);
		System.out.println();
	}
	
	//sorting descending based on the height using compare to method
	
	List<Integer> list = new ArrayList<Integer>(map.keySet());
	Collections.sort(list, (a,b) -> b.compareTo(a));
	
	for(Integer m: list) {
		
		System.out.println(map.get(m)+" "+m);
	}

	}

}
