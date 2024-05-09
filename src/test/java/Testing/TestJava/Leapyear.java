package Testing.TestJava;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 1700;
		
		boolean isleapyear = false;
		
		//century year validation
		
		if(year%100==0) {
			
			if(year%400==0) {
			
			isleapyear = true;
			
		}else {
			isleapyear = false;
		}
		}
		
		//4 year validation
		else {
			
			if(year%4==0) {
			isleapyear = true;
			}else {
				isleapyear = false;
			}
		}
		
		
		if(isleapyear == true) {
			System.out.println("leapyear");
		}else {
			System.out.println("not leap year");
		}

	}

}
