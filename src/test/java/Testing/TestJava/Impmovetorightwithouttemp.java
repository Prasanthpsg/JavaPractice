package Testing.TestJava;

import java.util.Arrays;

public class Impmovetorightwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		 
		 int k=0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>0)
			 arr[k++] = arr[i];
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
		 System.out.println("len: "+arr.length);
		 
		 
		 while (k < arr.length) {
	            arr[k++] = 0;
		 }
		 
		 System.out.println(Arrays.toString(arr));

	}

}
