package Testing.TestJava;

public class Impfirstcharuppercasecapgemini {

	public static void main(String[] args) {
		
		 String strinput = "prasanth kandasamy test automation";
	      String[] strarray = strinput.split(" ");
	      StringBuffer sb = new StringBuffer();
	      
	      for(int i=0;i<strarray.length;i++){
	         // for(int j=0;j<strarray[i].length();j++){
	        
	    	  int j=0;
	         while(j<strarray[i].length()){
	              if(j==0){
	    sb.append(Character.toUpperCase(strarray[i].charAt(j)));
	    j++;
	              }else{
	                  sb.append(strarray[i].charAt(j));
	                   j++;
	              }
	          }
	          sb.append(" ");
	      }
	      
	      System.out.println(sb.toString().trim());
	    }


}
