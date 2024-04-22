package Testing.TestJava;

public class Findlargestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] {12,2,99,04,12,888};
		
		int temp = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>temp) {
				temp = a[i];
			}
		}
		
		System.out.println("largest element: "+temp);
	}

}
