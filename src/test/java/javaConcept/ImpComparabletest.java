package javaConcept;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
	
	private int rating;
	private String name;
	private int year;

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.rating - o.rating;
	}
	
//	public int compareTo1(Movie y) {
//		// TODO Auto-generated method stub
//		return this.rating - y.rating;
//	}
	
	Movie(int rating, String name, int year){
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	
	
	
}

public class ImpComparabletest {

	// sort based on the ratings
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> a = new ArrayList<Movie>();
		
		Movie m = new Movie(7, "TEST" , 1996);
		Movie m1 = new Movie(12, "Azae" , 1934);
		Movie m2 = new Movie(37, "MOM" , 2001);
		
		a.add(m);
		a.add(m1);
		a.add(m2);
		
		
		//sort based on the rating
		Collections.sort(a);
		
		for(Movie c: a) {
			System.out.println(c.getName() +" "+ c.getRating() +" "+c.getYear());
		}
		
		
	}

}
