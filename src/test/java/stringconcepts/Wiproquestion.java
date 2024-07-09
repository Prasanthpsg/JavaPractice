package stringconcepts;

public class Wiproquestion {

	public static void main(String[] args) {
		
        int[] arr ={1,1,2,3,3,3,4,4,5,5,6,6,6,6,7,7};
        boolean b = true;
        
        for(int i=0;i<arr.length;i++){
        	 b = true;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    b = false;
                    break;
                }else{
                    b =true;
                }
            }
            
            if(b){
                System.out.println(arr[i]);
            }
            
        }
    }

	

}
