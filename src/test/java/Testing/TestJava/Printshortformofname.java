package Testing.TestJava;

public class Printshortformofname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Japneet Singh Sachdeva";
		
		String[] strsplit = str.split(" ");
		
		String name = strsplit[0].charAt(0)+"."+strsplit[1].charAt(0)+". "+strsplit[2];
		
		System.out.println(name);

	}

}
