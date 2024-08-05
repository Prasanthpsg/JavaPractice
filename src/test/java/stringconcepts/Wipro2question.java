package stringconcepts;

import java.util.Arrays;

public class Wipro2question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {7,8,6,3,4,1,12,10,5};
		int temp=0;
		
		for (int i = 0; i < input.length; i++)
	    {
	        //If the value is 'even' continue with outer loop
	        if(input[i] % 2 == 0) {
	           continue; 
	           }

	        //Inner loop to compare array values
	        for(int j = (i + 1); j < input.length; j++)
	        {
	            //If this value is not even do comparison
	            if(input[j] % 2 != 0)
	            {
	                //If the left value is greater than the right value
	                //swap them
	                if(input[i] > input[j])
	                {
	                   temp = input[i];
	                   input[i] = input[j];
	                   input[j] = temp;
	                }
	            }
	        }
	       
	    }
		
		System.out.println(Arrays.toString(input));
		
		/*for (int i = 0; i < input.length; i++) {
			
			if(input[i]%2==0) 
				continue;
			
			for(int j=i+1;j<input.length;j++) {
				if(input[i]%2!=0) {
				if(input[i]>input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]= temp;
				}
			} //condition if
			}
			
		}
		
		
		System.out.println(Arrays.toString(input));*/
		
		

	}

}
