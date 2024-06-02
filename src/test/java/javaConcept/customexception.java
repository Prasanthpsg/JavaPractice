package javaConcept;

class customs extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	customs(String ste){
		super(ste);
	}
}

public class customexception {
	
	// method to check the age  
    static void validate (int age) throws customs{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        //throw new customs("age is not valid to vote");   
    	   System.out.println("not to vote");
    }  
       else {   
        System.out.println("welcome to vote");   
        }
       
    }
	

	public static void main(String[] args) throws customs {
		// TODO Auto-generated method stub
		
		
		validate(12);

	}

}
