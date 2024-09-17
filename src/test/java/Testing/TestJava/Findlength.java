package Testing.TestJava;

import java.util.Scanner;

public class Findlength {

	private  boolean numlock =true;
  	 static boolean caplock = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sapient interview 1st round
		
//		String s2 = "Testautomation";
//		Scanner s = new Scanner(System.in);
//		String s1 = s.nextLine();
//		System.out.println(s1.length());
//		
//		System.out.println(s2.substring(0, 3)); // Tes
//		System.out.println(s2.substring(5,9)); //utom
		
		String a = "newspaper"; //scp
		a=a.substring(5,7);
		char b = a.charAt(1);
		a =a+b;
		System.out.println(a); //app
		
	//	int ++a =100; Compiler displays error as ++a is not a valid identifier
		
		//System.out.println(++a);
		
		int i;
		
		for( i=1;i<6;i++) {
			if(i>3) {continue;}
		}
		System.out.println(i); //6
		
		int z;
		
		for( z=1;z<6;z++) {
			if(z>3) break;
		}
		System.out.println(z); //4
		
		
		String str = "Helow";
		System.out.println(str.indexOf('H')); //-1
		
		
		String s7 = "Automation testing"; //scp
		String s8 = new String ("Automation testing"); //heap memory -> allows duplicate
		
		System.out.println(s7==s8); //false
		
		System.out.println(s7.equals(s8)); //true
		
		// check global variable for this code
		 System.out.println(numlock+ " "+caplock); // does not compile because numlock is not declared as static
		
	}

}
