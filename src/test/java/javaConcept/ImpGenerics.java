package javaConcept;

//Generics means parameterized types. 

public class ImpGenerics<T> {
	
	public void data(T[] i) {
		
		//System.out.println(i);
		
		for (T t : i) {
			System.out.println(t);
		}
	}
	
	public void showtype(T[] i) {
		System.out.println("Data type :"+i.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // only wrapper class. generics wont allow primitive data types like int, char.
		ImpGenerics<Integer> g = new ImpGenerics<Integer>();
		ImpGenerics<Character> g1 = new ImpGenerics<Character>();
		
		Integer[] i = {2,8,100,56,23};
		Character[] c = {'r','e','h','l'};
		
		g.data(i);
		g1.data(c);
		
		g.showtype(i);
		g1.showtype(c);
		
		

	}

}
