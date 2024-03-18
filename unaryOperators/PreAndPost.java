package unaryOperators;

public class PreAndPost {

	public static void main(String[] args) {


		int a = 2;
		int b = 4;
		
		int c = 0;
		c = a++ * b++;
		
		int x = 2;
		int y = 4;
		
		int z = 0;
		z = ++x * ++y;
		
		System.out.println("Postfix: should be 15 but is = "+ c);
		System.out.println("Prefix: should be 15 but is = "+ z);

	}

}
