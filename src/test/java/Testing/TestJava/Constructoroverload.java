package Testing.TestJava;

public class Constructoroverload {
	
	int x;
	Constructoroverload(){
		x=5;
	}
	
	Constructoroverload(int val){
		x=val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructoroverload c = new Constructoroverload();
		Constructoroverload c1 = new Constructoroverload(12);
		
		System.out.println(c.x +" "+c1.x);// 5 12

	}

}
