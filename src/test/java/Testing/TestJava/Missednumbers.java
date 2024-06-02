package Testing.TestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Missednumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ip = {2,7,10};
		
		int temp = ip[0];
		
		// first identify the largest number
		
		for (int i = 0; i < ip.length; i++) {
			if(temp<ip[i]) {
				temp =ip[i];
			}
			
		}
		
		System.out.println("Largest number: "+temp);
		
		HashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
		HashMap<Integer, Integer> missed = new LinkedHashMap<Integer, Integer>();
		
		// store the existing values in hash map
		for (int i = 0; i < ip.length; i++) {
			h.put(ip[i], 1);
		}
		
		// identify the missed values and store it in the hash map
		for (int i = 0; i <= temp; i++) {
			
			if(h.containsKey(i)) {
				
			}else {
				missed.put(i, 1);
			}
			
		}
		
		System.out.println("Hash map: "+missed);
		
		missed.forEach((k,j) -> {System.out.println(k);});

	}

}
