package Testing.TestJava;

public class Basicsloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 0;
		while(j<=10) {
			
			System.out.println("Hi: "+j);
			j++;
		}
		
		int i=0;
		do { // do something before check the condition
			System.out.println("do while");
			i++;
		}while(i<=5);
		
		
		// break
		for (int k = 0; k < 10; k++) { //The break statement can also be used to jump out of a loop.
			  if (k == 4) {
			    break;
			  }
			  System.out.println(k +" :"+ "break");
			}
		
		//continue 
		//The continue statement breaks one iteration (in the loop), 
		//if a specified condition occurs, and continues with the next iteration in the loop.
		for (int m = 0; m < 10; m++) { //This example skips the value of 4:
			  if (m == 4) {
			    continue;
			  }
			  System.out.println(m);
			}

	}

}
