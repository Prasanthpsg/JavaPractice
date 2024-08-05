package stringconcepts;

import java.util.LinkedHashMap;
import java.util.Map;

public class Epamquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "the jack is dog and the dog is lazy";
		StringBuffer sb = new StringBuffer();
		String[] strinput = str.split(" ");
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for(String s: strinput){
		    
		    if(map.containsKey(s)){
		        map.put(s, map.get(s)+1);
		    }else{
		        map.put(s,1);
		    }
		}
		
		System.out.println("Map" +map);
		
		for(Map.Entry<String, Integer> eset: map.entrySet()){
		    if(eset.getValue()==1){
		        sb.append(eset.getKey()).append(" ");
		    }
		}
		
		System.out.println(sb.toString());
		
    }


}
