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

// print the repeated characters count a3b3acfw3dv2s
class Main {
    public static void main(String[] args) {
      String str = "aaabbbacfwwwdvvs";
      char[] c = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		int count =1;int j=0;
		
		for(int i=0;i<c.length;i++){
		     count =1;
		    for( j=i+1;j<c.length;j++){
		        if(c[i]==c[j]){
		            count++;
		        }else{
		            i=j-1;
		            break;
		        }
		    }
		    if(count>1 ){
		        sb.append(c[i]).append(count);
		    }else{
		        sb.append(c[i]);
		    }
		    
		    if(j==c.length){
		         System.out.println(c.length);
		        break;
		    }
		    }
		    
		    System.out.println(sb.toString().trim());//a3b3acfw3dv2s
		}
		
		
}

// reverse the characters alone in the given string

public class Check {

    public static void main(String[] args) {
        String str = "33prasanth23kayal5pd";
        char[] c = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for(int i=0;i<c.length-1;i++){
            if(Character.isDigit(c[i])){
                sb.append(c[i]);
            }else{
                for(int j=i;j<c.length;j++){
                    if(Character.isAlphabetic(c[j])){
                        sb1.append(c[j]);
                    }else{
                        i=j-1;
                        break;
                    }
                }
                sb1.reverse();
            }

            sb2.append(sb).append(sb1);
            sb.delete(0, sb.length()); // sb.setLength(0);
            sb1.delete(0, sb1.length());
        }

        System.out.println(sb2.toString().trim()); //33htnasarp23layak5dp
    }
}
