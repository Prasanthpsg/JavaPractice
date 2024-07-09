package stringconcepts;

public class Practice1 {

	public static void main(String[] args) {
		
		 String s1 = null;
	        System.out.println(s1); //line 2 null
	     //   System.out.println(s1.toString()); //line 3 null pointer exception
	        
	        String s11 = "abc";
	        StringBuffer s2 = new StringBuffer(s11);
	        System.out.println(s11.equals(s2)); //false  because s2 is not of type String. you will find a check using instanceof operator to check if the type of passed object is String? If not, then return false.
	        System.out.println(s11.contentEquals(s2)); //true
	        
	        String s12 = "Java"; //scp
	        String s22 = "Java"; //scp
	        StringBuilder sb1 = new StringBuilder();
	        sb1.append("Ja").append("va");
	        System.out.println(s12 == s22); //true
	        System.out.println(s12.equals(s22)); //true
	        System.out.println(sb1.toString() == s12); // new string false
	        System.out.println(sb1.toString().equals(s12)); //true 
	        
	        //equals will check instance of type and content
	        //tostring will create an object in heap memory
	        
	        String z ="test";
	        System.out.println(z.substring(0,7)); // string index out of bound exception

	}

}
