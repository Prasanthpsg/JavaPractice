package Testing.TestJava;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In Fibonacci series, next number is the sum of previous two numbers
		
		int num1 =0, num2 =1, last =10;
		
		for(int i=0;i<=last;i++) {
			
			System.out.print(num1 +" ");
			int num3 = num2+num1;
			num1 = num2;
			num2 = num3;
		}

	}

}
