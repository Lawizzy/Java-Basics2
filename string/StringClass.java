package string;

public class StringClass {

	public static void main(String[] args) {


		/**
		 * As have known String is not a primitive type but reference type
		 * Which means falls under the object class
		 */
	
		//a and b both point to the same memory location (Short hand for String creation)
		//The short hands creation are within the String literal pool within the JVM

		String a = "Luxor";
		String b = "Luxor";
		
		//While c is a whole new different object with a new memory location (Formal way for String creation)
		//The formal creation are within the general memory of the JVM

		
		String c = new String("Luxor");
		
		//Also d is a whole new different object with a new memory location
		
		String d = new String("Luxor");
		
		System.out.println(a.equals(b));
		System.out.println(a == b);

		System.out.println(c.equals(d));
		System.out.println(c == d);


	}

}
