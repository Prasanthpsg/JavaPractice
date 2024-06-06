package Testing.TestJava;

public class VariableExample {
	
	static int staticvar = 10;
	int instancevar=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableExample v = new VariableExample();
		System.out.println(v.staticvar++);
		System.out.println(v.instancevar++);
		
		VariableExample v2 = new VariableExample();
		System.out.println(v2.staticvar++);
		System.out.println(v2.instancevar++);
		
		//Prefix Increment Operator
		int a = 5;
		int b = ++a;
		System.out.println("a: " + a + ", b: " + b); // a: 6, b: 6
		
		//Postfix Increment Operator
		int a1 = 5;
		int b1 = a1++;
		System.out.println("a1: " + a1 + ", b1: " + b1); //a: 6, b: 5
		
		//Prefix Decrement Operator
		int a2 = 5;
		int b2 = --a2;
		System.out.println("a2: " + a2 + ", b2: " + b2);//a: 4, b: 4
		
		//Postfix Decrement Operator
		int a3 = 5;
		int b3 = a3--;
		System.out.println("a3: " + a3 + ", b3: " + b3); //a: 4, b: 5
		

	}

}
