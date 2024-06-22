package Testing.TestJava;

public class ImpPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =525; 
		int sum1 =0;
		int temp =i;
		int rem =0;
		
		while (i>0) {
			 rem = i%10; //getting remainder  
			 sum1 = (sum1*10)+rem;
			 i = i/10;
		}
		//System.out.println(sum1);
		
		if (temp==sum1) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
