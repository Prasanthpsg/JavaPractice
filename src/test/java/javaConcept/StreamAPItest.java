package javaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPItest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = Arrays.asList(2,7,9,10,12,67,2,9);
		//li.si
		
		//find the number which is divisible by 2 and multiple by 2
		
		li.stream().forEach(n -> {System.out.println(n);});
		
		//Stream<Integer> s = li.stream().filter(l ->l%2==0).map(l -> l*2);
		//s.forEach((s1) -> {System.out.println(s1);});
		
		//find the number which is distinct
		//Stream<Integer> s3 = li.stream().distinct();
		//s3.forEach((s4) -> {System.out.println(s4);});
		
		

	}

}
