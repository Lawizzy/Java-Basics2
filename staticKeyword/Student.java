package staticKeyword;

public class Student {
	
	/*
	 * Static:
	 * Static members don't belong to the object but to the class (hence accessing it directly from the class not object instantiated)
	 * Changes to that static member is available to all the objects (latest change is kept)
	 * Used when you want to share a member across multiple objects
	 */

	static String name;
	byte age;
	String grade;
	
	public void displayStudent() {
		
		System.out.println(name+ " is a Student aged "+age+" year old, who is in "+grade +" grade");
	}
	
	public static void staticMethod() {
		System.out.println("Im a static method, im accessed without an object creation");
	}
	
}
