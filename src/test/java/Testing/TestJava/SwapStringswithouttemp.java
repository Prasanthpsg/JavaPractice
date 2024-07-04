package Testing.TestJava;

public class SwapStringswithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str1 = "Good", str2 = "morning";    
         System.out.println("Strings before swapping: " + str1 + " " + str2);    
         
         str1 = str1 + str2; 
         str2 = str1.substring(0,(str1.length()-str2.length()));
         str1 = str1.substring(str2.length(),str1.length());
         
         System.out.println(str1);
         System.out.println(str2);
         
         
         // insert 2nd string - TCS interview
         String s1 = "prasanth kandasamy", s2 = "for";
         String[] strarray = s1.split(" ");
         
        System.out.println(String.join(" ", strarray[0], s2, strarray[1])); //prasanth for kandasamy 
        
        System.out.println(String.join(" ", strarray[0].substring(0,3), s2, s1.substring(3, s1.length())));  //pra for santh kandasamy

	}

}
