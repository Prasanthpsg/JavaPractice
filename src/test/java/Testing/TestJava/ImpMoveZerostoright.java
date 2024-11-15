package Testing.TestJava;

public class ImpMoveZerostoright {

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

		// sapient answer
		  int[] arr = {2,0,12,23,12,0,44,98,0,122,-223};
       //shift to right without temp array
       int t=0;
       
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               arr[t++]=arr[i];
           }
       }
       
       while(arr.length>t){
            arr[t++]=0;
       }
       
       System.out.println(Arrays.toString(arr));

	}

}
