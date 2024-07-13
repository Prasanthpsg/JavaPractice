package javaConcept;

class upcast{
	
	
	public void show() {
		
		System.out.println("in parent class");
	}
	
	public void display() {
		System.out.println("display");
	}
}

class child extends upcast{
	
	@Override
	public void show() {
		
		System.out.println("in child class");
	}
	
	public void show(int i) {
		
		System.out.println("in overloaded show method in child class");
	}
	
	public void csk() {
		System.out.println("csk child");
	}
	
}

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		upcast c = new upcast();
		c.show(); //in parent class
		
		child c1 = new child();
		c1.show(); //in child class
		c1.show(2);//in overloaded show method in child class
		c1.csk(); //csk only visible in child class
		
		//up cast
		upcast u1 = new child(); //typecasting a child object to a parent object
		u1.show(); //in child class bcoz show method is overridden
		u1.display(); //display -parent class
		//u1.csk //csk not visible during up casting

	}

}
