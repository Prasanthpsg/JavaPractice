package Testing.TestJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class impDuplicatelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {12,2,99,04,12};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate element: "+a[i]);
				}
			}
		}
		
//		IntStream s = Arrays.stream(a);
//		s.distinct();
//		System.out.println(s.toString());

	}

}
