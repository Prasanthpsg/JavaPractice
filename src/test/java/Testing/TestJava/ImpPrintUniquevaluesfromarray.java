package Testing.TestJava;

import java.util.ArrayList;
import java.util.List;

public class ImpPrintUniquevaluesfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{12,34,1,2,12,1,99,34,8};
		boolean b = false;
		List<Integer> li = new ArrayList<Integer>();
		
		
		for(int i=0;i<arr.length;i++) {
			b = false;
			
			if(!li.contains(arr[i])) {
			for(int j =i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					li.add(arr[i]);
					b = true;
					break;
				}else {
					b = false;
				}
			}
			
			if(b == false) {
				System.out.println(arr[i]); // o/p: 2 99 8
			}
				}
		}
		
	}

}
