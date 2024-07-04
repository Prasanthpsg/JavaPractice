package Leetcode;

import java.util.Stack;

public class Stackcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		
		System.out.println(s);// [1, 2]
		
		System.out.println(s.peek()); // return 2
		
		
		
		while(!s.isEmpty()) {
			System.out.println(s.pop()); // remove the value from the stack
		}
		
		System.out.println(s.isEmpty()); //true

	}

}
