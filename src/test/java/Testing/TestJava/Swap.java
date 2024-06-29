package Testing.TestJava;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=7, j=9;
		
		int temp ;
		
		temp =i;
		i=j;
		j=temp;
		
		System.out.println(i);
		System.out.println(j);
		
		int k=17, m=19;
		
		k =k+m;
		m =k-m;
		k = k-m;
		
		System.out.println(k);
		System.out.println(m);
		
		String x = "tomorrow";
		StringBuffer sb1 = new StringBuffer(); int count=0;
		
		for(int i1=0;i1<x.length();i1++) {
			if(x.charAt(i1)=='o') {
				count++;
				for(int b =0;b<count;b++) {
					sb1.append('&');
				}
			}else {
				sb1.append(x.charAt(i1));
			}
			
		}
		
		System.out.println(sb1.toString());

	}

}
