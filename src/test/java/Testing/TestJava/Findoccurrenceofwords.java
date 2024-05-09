package Testing.TestJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Findoccurrenceofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Alice is girl and Bob is boy";
		 
        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split(" ");
        
        for (String w : words) {
			if(hashMap.containsKey(w)) {
				hashMap.put(w, hashMap.get(w)+1);
			}else {
				hashMap.put(w, 1);
			}
		} 
        
        Set<String> s = hashMap.keySet();
        
        // print words without repetition
        for(String s1: s) {
        	System.out.println(s1);
        }
       
        // print occurrence of words
       for( Entry<String, Integer> m: hashMap.entrySet()) {
    	   if(m.getValue()>1) {
    		   System.out.println(m.getKey() +":" +m.getValue());
    	   }
       }

	}

}
