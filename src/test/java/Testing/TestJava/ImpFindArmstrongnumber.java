package Testing.TestJava;

import java.util.Scanner;

public class ImpFindArmstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int input = 153;
		
		try (
		Scanner sc = new Scanner(System.in)) {
			int input = sc.nextInt();
			int temp=input;
			int sum =0;
			
			while(input>0) {
				sum =sum+(input%10)*(input%10)*(input%10); // input%10 --> will give remainder (last digit of the input)
				input = input/10;
			}
			
			if(temp==sum) {
				System.out.println("Armstrong number");
			}else {
				System.out.println("Not an armstrong number");
			}
		}

	}

}
