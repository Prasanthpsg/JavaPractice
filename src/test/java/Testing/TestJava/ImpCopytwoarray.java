package Testing.TestJava;

import java.util.Arrays;

public class ImpCopytwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first array
        int a[] = { 30, 25, 40 };
        // second array
        int b[] = { 45, 50, 55, 60, 65 };
        
        int[] c = new int[a.length+b.length];
        
        //System.arraycopy(b, 0, c, 0, a.length+b.length);
        
     // Loop to store the elements of first
        // array into resultant array
        for(int i=0;i<a.length;i++) {
        	c[i] = a[i];
        }
        
     // Loop to concat the elements of second 
        // array into resultant array
        for(int j=0;j<b.length;j++) {
        	c[a.length +j]=b[j];
        }
        
        // prints the resultant array
        System.out.println(Arrays.toString(c));
        
     // Loop to print the elements of 
        // resultant array after merging
        for (int i = 0; i < c.length; i = i + 1) {
            
            // print the element
            System.out.println(c[i]);
        }

	}

}
