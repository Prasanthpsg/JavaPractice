package Testing.TestJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Streamreverse {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strinput = "Testing";
		
		char[] ch = strinput.toCharArray();
		ArrayList<Character> l = new ArrayList<Character>();
		
		for(char c : ch) {
			l.add(c);
		}
		
		Collections.reverse(l);
		System.out.println(l);
		
		Iterator<Character> li = l.iterator();
		
		while(li.hasNext()) {
			System.out.print(li.next());
		}
		
		
		List<Integer> s = Arrays.asList(12,9,123,87);
		s.stream().sorted().collect(Collectors.toList());
		System.out.println(s);
		
		//using stack LIFO
		
		String strinput1 = "prasanth";
		char[] c1 = strinput1.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char ch1: c1) {
			stack.push(ch1);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

}
