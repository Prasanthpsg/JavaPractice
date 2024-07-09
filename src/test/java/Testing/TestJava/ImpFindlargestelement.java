package Testing.TestJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ImpFindlargestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] {12,2,99,04,12,888};
		
		int temp = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>temp) {
				temp = a[i];
			}
		}
		
		System.out.println("largest element: "+temp);
		
		System.out.println(Arrays.stream(a).sorted().findFirst().orElse(0));
		
		Integer[] a1= new Integer[] {}; //no input
		
		List<Integer> list = new ArrayList<>(Arrays.asList(a1));
		
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).findFirst()); //Optional.empty

		
		
	}

}
