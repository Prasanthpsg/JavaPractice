package Testing.TestJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Linkedinquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a =10/0;
			System.out.println("this will not be printed");
		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}finally {
			System.out.println("finally block");
		}
		
		// scenario 2
		int b =5;
		int c = 10;
		if((b=3)==c) {
			System.out.println(b);
		}else {
			System.out.println(b+c); //13
		}
		
		// scenario 3
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); //0.0
		
		//scenario 4
		int z=0;
		System.out.println(z++ + ++z); //2
		
		String s1 = new String("xyz"); //heap
		String s2 = "xyz"; //scp
		
		//System.out.println(s1.intern());//Returns a canonical representation for the string object.
		//System.out.println(s1.intern()==s2); //address check true
		
		System.out.println(s1==(s2)); //without intern() same scenario will return false
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.set(1, "C"); //Replaces the element at the specified position in this list with the specified element 
		list.add("D");
		System.out.println(list); //[A, C, D]
		
		System.out.println(list.get(0)); //A
		
	}

}
