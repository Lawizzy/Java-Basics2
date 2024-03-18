package superKeyword;

public class ClassB extends ClassA {
	
	int num1 = 500;
	
	public void sayHi() {
		
		System.out.println("Hi from Class B");
	}
	
	public void newMethod() {
		
		/*
		 * Super keyword invokes the parent class members
		 * Usually done when overriding parent class members
		 */
		
		super.sayHi();
		System.out.println("Hello from Class B with Class A method");
		System.out.println(num1+" from class B and "+super.num1+" from Class A");
	}

}
