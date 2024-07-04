package Testing.TestJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is my framework";
		
		String[] a = str.split(" ");
		//ArrayList<String> Al = new ArrayList<String>(Arrays.asList(a));
		ArrayList<String> Al = new ArrayList<String>(List.of(a));
		
//		for (String string : a) {
//			Al.add(string);
//		}
		
		System.out.println(Al);
		
		//Lambda  expression to identify the data in the arraylist
		Al.forEach((n) -> {System.out.println(n);});
		
		//Al.stream().forEach((m) -> {System.out.println(m);});
		//System.out.println(Al);

	}

}
