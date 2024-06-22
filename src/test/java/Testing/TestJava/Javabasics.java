package Testing.TestJava;

public class Javabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi";
		str = null;
		
		System.out.println(str); //null
		
		String[] strname = {"meow","hi","hello"}; // store in scp
		String str1 = "meow"; //scp
		
		//System.out.println(strname[0]==str1); //true --> will check memory/address
		//System.out.println(strname[0].equals(str1)); //true
		
		
		String[] strname1 = {"meow","hi","hello"}; // store in scp
		String str2 = new String("meow"); //heap memory
		
		System.out.println(strname1[0]==str2); //false
		System.out.println(strname1[0].equals(str2)); //true
		
		int x =5;
		int y =2;
		
		System.out.println(x/y*y);
		
		
		String input = "Test autaomation hi";
		System.out.println(input.indexOf('s')); //2
		System.out.println(input.indexOf("hi")); //17 string
		System.out.println(input.indexOf('a')); //5
		System.out.println(input.indexOf('a',6)); //5
		
		
		System.out.println(input.lastIndexOf('n')); //15 //returns the position of the last occurrence of specified character(s)
		System.out.println(input.lastIndexOf('a',6)); //5 here 6 will be the last position
		
		

	}

}
