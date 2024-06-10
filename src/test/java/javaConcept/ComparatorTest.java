package javaConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyownImplementaion1 implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName()) ;
	}

	
}

class MyownImplementaion implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o2.getYear() - o1.getYear();
	}

	
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> a = new ArrayList<Movie>();
		
//		Movie m = new Movie(7, "TEST" , 1996);
//		Movie m1 = new Movie(12, "Azae" , 1934);
//		Movie m2 = new Movie(37, "MOM" , 2001);
		
		a.add(new Movie(7, "TEST" , 1996));
		a.add( new Movie(12, "Azae" , 1934));
		a.add(new Movie(37, "MOM" , 2001));
		
		// sort based on the year descending order
		
		Collections.sort(a, new MyownImplementaion());

		System.out.println("Sort based on the year - descending order");
		
		for(Movie c: a) {
			System.out.println(c.getName() +" "+ c.getRating() +" "+c.getYear());
		}
		
		
		// *********************************** //
		
		//sort based on the name
		
		Collections.sort(a, new MyownImplementaion1() {
			
			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName()) ;
			}
			
		});
		
		System.out.println("Sort based on the name - descending order");
		
		for(Movie c: a) {
			System.out.println(c.getName() +" "+ c.getRating() +" "+c.getYear());
		}
		
	}

}
