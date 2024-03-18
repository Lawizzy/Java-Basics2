package method_overloading;

public class MethodOverloading {
	
	/**
	 * Method overloading can be:
	 * Change of the data type
	 * Order of data types eg double then int or int then double
	 * Number of args
	 */
	
	
	public void addition(double num, double num1) {
	  
	  System.out.println(num + num1); 
	  
	}
	
	public void addition(int num, int num1) {
		
		System.out.println(num + num1);
	}
	
	public void addition(double num, int num1) {
		
		System.out.println(num + num1);
	}
	
	public void addition(int num, double num1) {
		
		System.out.println(num + num1);
	}
	
	public void addition(int num, int num1, int num2) {
		
		System.out.println(num + num1 + num2);
	}
	
}
