package Testing.TestJava;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatecharhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strdup1 = "Prasanthkandasamy";
		
		char[] c5= strdup1.toCharArray();
		
		Set<Character> linkedHashSet = new LinkedHashSet<>();
		
		for (char c : c5) {
			linkedHashSet.add(c);
		}
		
		for (Character character : linkedHashSet) {
			System.out.print(character); //output Prasnthkdmy
		}

	}

}
