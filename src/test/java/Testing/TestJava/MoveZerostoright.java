package Testing.TestJava;

public class MoveZerostoright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,9,0,12,99,0,0,223,0};
		
		int[] b = new int[arr.length];
		int k=0;
		
		for(int i =0;i<arr.length;i++) {
			
			if(!(arr[i]==0)) {
				b[k++]=arr[i];
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				b[k++]=arr[i];
			}
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}

	}

}
