package Testing.TestJava;

import java.util.Arrays;
import java.util.Scanner;

public class ImpRotatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int rotate = s.nextInt();
		
		int[] a = {2,4,5,13,10,12};
		
		int d =rotate; int z=0;
		int[] temp = new int[d];
		int[] temp2 = new int[a.length];
		
		for(int i=0;i<d;i++) {
			temp[i] = a[i];
		}
		//System.out.println(Arrays.toString(temp));
		for(int j=d;j<a.length;j++) {
			temp2[z++] = a[j];
		}
		//System.out.println(Arrays.toString(temp2));
		
		for(int k=0;k<temp.length;k++) {
			temp2[z++] = temp[k];
		}
		System.out.println(Arrays.toString(temp2));
		
	}

}
