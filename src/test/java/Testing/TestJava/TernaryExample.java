package Testing.TestJava;

public class TernaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // variable declaration
        int n1 = 15, n2 = 10, res;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Performing ternary operation
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        // Print the largest number
        System.out.println("Result = " + res);
        
        int x=10;
        		//true ? (1): -1;
        int y = (x<5) ? (x<20 ? 1:0): -1;
        System.out.println(y); 
        
        
        int y1 =5;
        System.out.println(y1>2?y1<4?10:-7:3);
        
	}

}
