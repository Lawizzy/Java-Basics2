package varargsMethods;

import java.util.ArrayList;

public class VarArgsClass {

	public static void main(String[] args) {


		stringExample("Luxor", "Luther");
		stringExample("La", "Le", "Lee", "Lii");
		
		intExample(12, 00, 98, 989, 564);
		intExample();
		
		Student student = new Student("Lex");
		Professor professor = new Professor("Dr Strange");
		personExample(student, professor);
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Hello");
		arrList.add("How are you??");
		arrList.add("Goodbye ...");

		objectExample(student, arrList);
		objectExample2(new Pineapple(), new Bicycle(), new Cloud());
		
	}
	
	/**
	 * Varargs methods
	 */
	
	private static void stringExample(String ... args) {
		
		System.out.println("In stringExample, there are "+args.length+" arguments");
		
		for(int i = 0; i < args.length; i++) {
			
			System.out.println(" "+args[i]+" is a "+ args[i].getClass().getName());
		}
		System.out.println();
	}
	
	private static void intExample(int ... args) {
		
		System.out.println("In intExample, there are "+args.length+" arguments");
		
		for(int i = 0; i < args.length; i++) {
			
			System.out.println(" "+args[i]+" is an integer");
		}
		System.out.println();
	}
	
	private static void personExample(Person ... args) {
		
		System.out.println("In personExample, there are "+args.length+" arguments");
		
		for(int i = 0; i < args.length; i++) {
			
			System.out.println(" "+args[i]+" is a "+ args[i].getClass().getName());
		}
		System.out.println();
	}
	
	private static void objectExample(Object ... args) {
		
		System.out.println("In objectExample, there are "+args.length+" arguments");
		
		for(int i = 0; i < args.length; i++) {
			
			System.out.println(" "+args[i]+" is a "+ args[i].getClass().getName());
		}
		System.out.println();
	}
	
	private static void objectExample2(Object ... args) {
		
		System.out.println("In objectExample, there are "+args.length+" arguments");
		
		for(int i = 0; i < args.length; i++) {
			
			if(args[i] instanceof Pineapple) {
				((Pineapple) args[i]).eat();
			}
			else if(args[i] instanceof Bicycle) {
				((Bicycle) args[i]).ride();
			}
			else if(args[i] instanceof Cloud) {
				((Cloud) args[i]).paint();
			}
		}
		System.out.println();
	}

}
