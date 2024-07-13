package Testing.TestJava;

import java.util.Arrays;

public class Impmovetoleftwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 1, 1,1, 0, 0, 1, 1, 0, 1, 0, 1};
		 
		 int counter =0; 
		 
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]==0) {
//				 counter++;
//			 }
//		 }
//		 
//		 System.out.println(counter);
//		 
//		 int k = counter-1;
		 
//		 for(int i=0;i<counter;i++) {
//			 
//			 arr[k++]=0;
//		 }
		
	//	 {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==0) {
				 arr[counter++]=arr[i];
			 }
		 }
		 
		// System.out.println(k);
		// System.out.println(Arrays.toString(arr));
		 
		 while(counter<arr.length)
			 arr[counter++]=1;
		 
		 System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1]

	}

}
