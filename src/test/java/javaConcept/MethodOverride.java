package javaConcept;

public class MethodOverride extends Accessmodifier{ // Run time polymorphism
	
	@Override
	void eat() {
		//super.eat(); // super will refer the parent or base class
		System.out.println("eat method in the child class");
	}
	
	@Override
		public void protectedmethod1() { // protected method can be overridden by child class
			super.protectedmethod1();
		}
	
	//void protectedmethod(){ // we cannot override the static method which is in parent class . here method protectedmethod is static method.
		
	//}

	public static void main(String[] args) {
		
		MethodOverride mo = new MethodOverride();
		mo.eat(); // print child class value
		
		Accessmodifier am = new Accessmodifier();
		am.eat(); // print parent class value
		
		Accessmodifier a = new MethodOverride(); // Up casting approach - parent class is referring the child class 
		a.eat(); //print child class value
		
		MethodOverride mo1 = (MethodOverride) new Accessmodifier();
		mo1.eat();
	}

}
