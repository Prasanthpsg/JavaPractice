package Testing.TestJava;

import java.util.Arrays;
import java.util.Iterator;

public class ImpSorting {

		// known as Bubble Sort
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {3,60,35,2,45,320,5};
		int temp =0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Print sorted Array "+Arrays.toString(a));
		
		System.out.println("Lowest/First number "+a[0]);

		System.out.print("Largest/Last number "+a[a.length-1]);
	}

}
