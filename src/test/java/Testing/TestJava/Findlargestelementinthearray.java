package Testing.TestJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Findlargestelementinthearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 7, num2 = 9, num3 = 10;
		if( num1 >= num2 && num1 >= num3)
		System.out.println(num1 + " is the largest number.");
		else if (num2 >= num1 && num2 >= num3)
		System.out.println(num2 + " is the largest number.");
		else
		System.out.println(num3 + " is the largest number.");
		
		ArrayList<Integer> x = new ArrayList<>();
		x.add(12);
		x.add(22);
		x.add(54);
		x.add(4);
		x.add(9);
		System.out.println(Collections.max(x)+ " is the largest number.");
		System.out.println(Collections.min(x)+ " is the smallest number.");
		//Collections.sort(x);
		//System.out.println(x);
		Collections.swap(x, 1, 3);
		System.out.println("After swap: "+x);
		
		//Sum of Digits
		
		int n = 987;
		int sum = 0;
		while(n>0) {
			sum =sum+n%10;
			n =n/10;
		}
		
		System.out.println(sum); //24
		
		//Count digits in an integer number
		int num = 29845315, count =0;
		while(num>0) {
			num = num/10;
			count++;
		}
		
		System.out.println(count); //8
		
		int num11 = 29845315;
		String ss = String.valueOf(num11);
		System.out.println(ss.length()); //8
		
		System.out.println(Integer.toString(num11).length()); //8
		
		System.out.println();
		
		// WAP find out sum of distinct elements
		
		int[] inparr = new int[] {5,1,8,4,9,1,5}; boolean distinct = true;
		List<Integer> list = new ArrayList<Integer>();
		int sum1 = 0;
		
		for(int m =0;m<inparr.length;m++) {
			distinct = true;
			
			if(!list.contains(inparr[m])) {
			for(int y=m+1;y<inparr.length;y++) {
			
			if(inparr[m]==inparr[y]) {
				distinct = false;
				list.add(inparr[m]);
				break;
			}
			
			}
			
			if(distinct==true) {
				System.out.println(inparr[m]);
				sum1 = sum1+inparr[m];
			}
			
			} //list check close
		}
		
		System.out.println(sum1);// 21
		
		
		int[] inparr2 = new int[] {5,1,8,4,9,1,5};
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int k: inparr2) {
			list2.add(k);
		}
		
		Optional<Integer> distinctsum =list2.stream().distinct().reduce( (a, b) -> a + b);
		System.out.println(distinctsum); //Optional[27]
		
		//WAP to sum the digits which is greater than 5
		 List<Integer> list3 = new ArrayList<Integer>();
		 
	        // add elements to the list
		 list3.add(1);
		 list3.add(5);
		 list3.add(6);
		 list3.add(7);
		 list3.add(8);
		 list3.add(9);
		 list3.add(10);
		 
		 System.out.println(list3.stream().filter(i -> i>5).reduce((a,b) -> a+b).orElse(null)); //40
		 
		 
	}

}
