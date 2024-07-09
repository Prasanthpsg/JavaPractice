package Testing.TestJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Impfindlongestsubstringwithoutrepeatedchar {

	public static void main(String[] args) {
		
		String s ="JAVA";
		int i;
	    int n = s.length(); 
	    int st = 0, start=0,currlen=0 , maxlen =0;
	    
	    HashMap<Character, Integer> pos = new HashMap<Character,Integer>(); 
	    
	    pos.put(s.charAt(0), 0); 
	    
	    for( i=1;i<n;i++) {
	    	
	    	if (!pos.containsKey(s.charAt(i)))
	        {
	            pos.put(s.charAt(i), i);
	        }else {
	        	if (pos.get(s.charAt(i)) >= st) {
	        		 currlen = i - st;
	        		 if (maxlen < currlen) 
	                 { 
	                 maxlen = currlen; 
	                 start = st; 
	                 } 
	          
	                 st = pos.get(s.charAt(i)) + 1;
	        }
	        	
	        	pos.replace(s.charAt(i), i);
	        }
	    }
	    
	    if (maxlen < i - st) 
		{ 
			maxlen = i - st; 
			start = st; 
		} 
	    
		System.out.println(s.substring(start, 
				start + 
				maxlen).length()); 
		
	}

}
