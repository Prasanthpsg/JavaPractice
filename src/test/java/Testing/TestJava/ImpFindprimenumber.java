package Testing.TestJava;

public class ImpFindprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =3; int count =0;
		
		for (int i = 1; i <= a; i++) {
			//b = false;
			//System.out.println(i +" "+(a%i) );
			if(a%i ==0 ) { // give remainder
				count++;
		}}
		
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}

	}

}
