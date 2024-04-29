package Testing.TestJava;

public class Averageprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int finalnum = 100,count =0,sum=0,avg =0;
		
		for (int i = 1; i <= finalnum; i++) {
			count =0;
			for (int j = 1; j <=i; j++) {
				if(i%j ==0 ) { // give remainder
					count++;
			}
			}
			if(count==2) {
				//System.out.print(i +" ");
				avg++;
				sum = sum+i;
			}
		}
		
		System.out.println(sum);
		System.out.println(avg);
		
		int average = sum/avg;
		System.out.println("Average: "+average);
		
		

	}

}
