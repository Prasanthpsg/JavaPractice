package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffletheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  nums = {1,2,3,4,4,3,2,1};
		int n = 4;
		int[] num1 = new int[n];
		int[] num2 = new int[n];
		int k=0,j=0;
		List<Integer> list = new ArrayList<>();
				
		//Output: [2,3,5,4,1,7] 
		for(int i=0;i<n;i++) {
			num1[k++] = nums[i];
		}
		
		for(int i=n;i<nums.length;i++) {
			num2[j++] = nums[i];
		}
		
		for(int i=0;i<num1.length;i++) {
			
			for(int m=i;m<=i;m++) {
				list.add(num1[i]);
				list.add(num2[m]);
			}
		}
		
		System.out.println(list); //[2, 3, 5, 4, 1, 7]
		//[1, 4, 2, 3, 3, 2, 4, 1]

	}

}
