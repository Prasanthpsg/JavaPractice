package Testing.TestJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ImpSecondmostfrequentchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Publicis sapient and pwc question
		
		String s = "prjasanthvijaya"; 
		int lastposvalue=0;
		
		char[] c = s.toCharArray();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(char c1: c) {
			
			if(hmap.containsKey(c1)) {
				hmap.put(c1, hmap.get(c1)+1); // hmap.put(c1, hmap.getOrDefault(c1, 0)+1);
			}else {
				hmap.put(c1, 1);
			}
		}
		
		
		//before sorting
		System.out.println("Before sorting - map: "+hmap);
		
		//Collection<Integer> c0 = hmap.values(); // return all the values from the hash map
		
		// Creating an ArrayList of values 
       // ArrayList<Integer> listOfValues 
          //  = new ArrayList<>(c0);
        
       // Collections.sort(listOfValues); // ascending order
       // System.out.println(listOfValues);
        
    //    lastposvalue = listOfValues.get(listOfValues.size()-1);
       // System.out.println(lastposvalue);
        int temp =0;
        
//		for (int i = 0; i < listOfValues.size(); i++) {
//			
//			if(listOfValues.get(i)<lastposvalue) {
//				temp= listOfValues.get(i);
//			}
//		}
//		
//		System.out.println("Second most frequent character value in the list: " +temp);
		
		// entry set loop
//		for(Map.Entry<Character, Integer> cg : hmap.entrySet() ) {
//			
//			if(cg.getValue()==temp) {
//				System.out.println("Second most frequent character key in the list: " + cg.getKey() + " value: "+ cg.getValue());
//			}
//		}
		
		List<Map.Entry<Character, Integer> > m = new LinkedList<Map.Entry<Character,Integer>>(hmap.entrySet());
		Collections.sort(m, (a, b) -> b.getValue().compareTo(a.getValue())); //// Sort the entry sets in descending order
		
		
		//After sorting
		System.out.println("After sorting - list: "+m);
		
		//Second most frequent char
		System.out.println(m.get(1).getKey());
		
		m.remove(1);
		System.out.println("After remove - list: "+m);
		
		for(int x=0;x<m.size();x++) {
			System.out.print(m.get(x).getKey());
		}
		
		
	}

}
