package Testing.TestJava;

public class Extractonlynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "14ERT#12RR2";
		
		for (int i = 0; i < input.length(); i++) {
			
			if(Character.isDigit(input.charAt(i))) {
				System.out.print(input.charAt(i));
			}
		}
		
		System.out.println();
		
		String onlydigits = input.replaceAll("[^0-9]", ""); // o/p: 14122
		System.out.println(onlydigits);

	}

}
