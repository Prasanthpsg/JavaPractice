package Testing.TestJava;

public class Duplicatelements {

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

	}

}
