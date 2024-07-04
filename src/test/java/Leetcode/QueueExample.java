package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Queue<String> queue = new LinkedList<>();
		 
	        // add elements to the queue
	        queue.add("apple");
	        queue.add("banana");
	        queue.add("cherry");
	       
	        
	        System.out.println(queue.isEmpty()); //false
	        
	        System.out.println(queue.peek()); //apple - return the element at the front of the queue but it wont remove
	        
	        while(!queue.isEmpty()) {
	        	System.out.println(queue.poll()); // remove the value from the queue
	        }
	        
	        System.out.println(queue.isEmpty()); // true
	        
	    //    System.out.println(queue.remove()); //if queue is empty, we will get java.util.NoSuchElementException
	        
	        System.out.println(queue.poll()); //if queue is empty, we will get null

	}

}
