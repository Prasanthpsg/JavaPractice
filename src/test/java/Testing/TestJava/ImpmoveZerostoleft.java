package Testing.TestJava;

public class ImpmoveZerostoleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {2,9,0,12,99,0,0,223,0};
		
		int[] b = new int[arr.length];
		int k=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==0) {
				b[k++]=arr[i];
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			
			if(!(arr[j]==0)) {
				b[k++]=arr[j];
			}
		}
		
		
		for (int z = 0; z < b.length; z++) {
			System.out.print(b[z] + " "); //0 0 0 0 2 9 12 99 223 
		}

	}

}
