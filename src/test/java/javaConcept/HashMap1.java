package javaConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		// Create an empty hash map by declaring object
        // of string and integer type
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Prasanth", 22);
		map.put("Prasanth1", 122);
		map.put("Prasanth2", 222);
		map.put("Prasanth3", 322);
		map.put(null, 00); // hash map allows only one null key
		map.put(null, 01); // if we get duplicate key in the entries, the new value will be overridden.
		map.put("TEST", null); // hash map allows multiple null values
		map.put("TEST2", null);
		map.put("TEST2", 66);
		
		System.out.println(map);
		
		//entrySet method will give all the entries
		//keySet method will give all the keys
		
		// not thread safe, if thread safe requires use concurrent hash map
		// unsynchronized
		// not follow the element insertion order

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			//System.out.println(key);
			//System.out.println(val);
		}
		
		Set<String> s = map.keySet();
		for (String key : s) {
			//System.out.println(key); // print all the keys
			if (key!=null && key.equals("TEST2")) {
				Integer value = map.get(key);
				System.out.println("Key: "+key +" : "+ "Value: "+ value);
			}
		}

	}

}
