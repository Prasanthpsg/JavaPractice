package Testing.TestJava;

public class Splitalphanumericdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome234To567Java89Programming0@#!!";
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new
		StringBuffer();
		
		for(int i =0;i<=str.length()-1;i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			}else if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}else {
				special.append(str.charAt(i));
			}
		}
		
		System.out.println("Alphabet "+alpha);
		System.out.println("Digit "+num);
		System.out.println("Special "+special);

	}

}
