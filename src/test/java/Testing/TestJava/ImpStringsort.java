package Testing.TestJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImpStringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is Rajat";
	//	String str = "prasanth";
		
		char[] c = str.toLowerCase().toCharArray();
		char[] cmap = str.toLowerCase().toCharArray();
		
		//sorting
		
		//Arrays.sort(c);
		
		//System.out.println(c);
		char temp;
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println();
		for(char x: c) {
			System.out.print(x);//aahnprst
		}
		
		//using hashmap
		HashMap<Character,Integer> hmap = new LinkedHashMap<Character,Integer>();
		
		for(char c1: cmap) {
		if(hmap.containsKey(c1)) {
			hmap.put(c1, hmap.get(c1)+1);
		}else {
			hmap.put(c1, 1);
		}
		}
		
		List<Character> list = new ArrayList<Character>(hmap.keySet());
		
		Collections.sort(list, (a,b) -> a.compareTo(b));
		
		System.out.println(list);//[a, h, n, p, r, s, t]
		StringBuffer sb = new StringBuffer();
		
		for(Character cm: list) {
			
			if(hmap.get(cm)>1) {
				
				for(int z=0;z<hmap.get(cm);z++) {
					
					sb.append(cm);
				}
			}else {
				sb.append(cm);
			}
		}
		
		System.out.println(sb.toString()); //aahnprst
		
	}

}
