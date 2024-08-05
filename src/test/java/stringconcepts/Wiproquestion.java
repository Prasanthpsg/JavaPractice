package stringconcepts;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Wiproquestion {

	public static void main(String[] args) {
		
     //   int[] arr ={1,1,2,3,3,3,4,4,5,5,6,6,6,6,7,7};
        int[] arr = {10,10,20,30,50,20,100};
        boolean b = true;
        
//        for(int i=0;i<arr.length;i++){
//        	 b = true;
//            
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    b = false;
//                    break;
//                }else{
//                    b =true;
//                }
//            }
//            
//            if(b){
//                System.out.println(arr[i]);
//            }
//            
//        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
        	b = true;
        	
        if(!list.contains(arr[i])){
            for(int j=i+1;j<arr.length;j++){
              
                if(arr[i]!=arr[j]){
                    list.add(arr[i]);
                	b = true;
                    break;
                }
            }
            
            if(b==true) {
            	System.out.println(arr[i]);
            }
       } // end of if statement
            
        }
        
        
        //scenario 3
        int[] arr1 = {10,10,20,30,50,20,100};
        
	Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int s: arr1){
		    
		    if(map.containsKey(s)){
		        map.put(s, map.get(s)+1);
		    }else{
		        map.put(s,1);
		    }
		}
		
		System.out.println("Map" +map);
		
		for(Map.Entry<Integer, Integer> eset: map.entrySet()){
		    if(eset.getValue()>=1){
		        	System.out.println(eset.getKey());
		    }
		}
        
     }


}
