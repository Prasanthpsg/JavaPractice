package Testing.TestJava;

import java.util.Iterator;

public class ImpBasicprogramms {

	public static void main(String[] args) {

		/* only print numeric values */
		
		String s ="Prasanth2023"; StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
			
		}
		
		System.out.println(sb); //2023
		
		/* print string reverse */
		String s1 = "I love java";
		
		for(int j=s1.length()-1;j>=0;j--) {
			System.out.print(s1.charAt(j)); //avaj evol I
		}
		
		String s2 ="I Love maths";
		String[] strarr = s2.split("\\s");
		
		for (int i = strarr.length-1; i >=0; i--) {
			System.out.print(strarr[i] +" "); //maths Love I
		}
		
		// take alternate numbers and print
		int[] k = new int[] {2,98,23,12,88,9};
		
		for(int z=0;z<k.length;z++) {
			
			if(!(z%2==0)) {
				System.out.println(k[z]); //98 12 9
			}
		}
		
		//Reverse each word in a sentence
		String str = "reverse each word in a string";
		StringBuffer sbf = new StringBuffer();
		String[] strarray = str.split("\\s");
		
		for(int z =0;z<strarray.length;z++) {
			
			for(int m =strarray[z].length()-1;m>=0;m--) {
				
				sbf =sbf.append(strarray[z].charAt(m));
			}
			sbf =sbf.append(" ");
		}
		
		System.out.println(sbf.toString().trim()); //esrever hcae drow ni a gnirts

		//map functional interface
		//   Integer arr[] = {2,6,1,99,23,12};
    String[] arr = {"xchris","test","bannana","zsds"};
       List<String> h = new ArrayList<>(Arrays.asList(arr));
      h.stream().sorted().map(String::toUpperCase).forEach(System.out::println); //make uppercase and print
		
	}

}
