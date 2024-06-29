package Testing.TestJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findcommonelementsintwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {4, 2, 3, 1, 6};
		int[] arr2 = {6, 7, 8, 4};
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
		Integer[] arr22 = {4, 2, 3, 1, 6};
		Integer[] arr23 = {6, 7, 8, 4};
		
		// by using ArrayList with retainAll method
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr22));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr23));
		list1.retainAll(list2);
		System.out.println("Common Elements:" + list1);
		
		

	}

}
