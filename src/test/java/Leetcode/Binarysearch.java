package Leetcode;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,5,8,10,22};
		int target  = 8;
		
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right) {
			
			int mid = (left+right)/2;
			
			if(nums[mid] == target) {
				System.out.println(mid);
				break;
			}else if(nums[mid] < target) {
				left = mid+1;
				right = nums.length-1;
			}else {
				left = 0;
				right = mid-1;
			}
		}

	}

}
