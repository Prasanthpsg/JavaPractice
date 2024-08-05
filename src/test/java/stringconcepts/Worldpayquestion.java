package stringconcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Worldpayquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "testautomationes";
		char[] c = str.toCharArray(); boolean b = false;
		
//		for(int i=0;i<c.length;i++) {
//			b = false;
//			
//			for(int j=i+1;j<c.length;j++) {
//				if(c[i]==c[j]) {
//					b = false;
//					break;
//				}else {
//					b = true;
//				}
//			}
//			
//			if(b) {
//				System.out.println(c[i]);
//				break;
//			}
//		}
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<c.length;i++) {
			if(map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i])+1);
			}else {
				map.put(c[i], 1);
			}
		}
		
		for(Map.Entry<Character,Integer> m: map.entrySet()) {
			if(m.getValue()==1) {
				System.out.println(m.getKey() +" "+m.getValue());
				break;
			}
		}

	}

}
