package Testing.TestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Findwordoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strname = "i am Java developer i am proud of it";
		
		String[] strarr = strname.split(" ");
		
		HashMap<String, Integer> hmap = new LinkedHashMap<String, Integer>();
		
		for (String string : strarr) {
			if(hmap.containsKey(string)){
				hmap.put(string, hmap.get(string)+1);
			}else {
				hmap.put(string, 1);
			}
		}
		
		System.out.print(hmap);

	}

}
