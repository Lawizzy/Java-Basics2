package mathClass;

public class MathClass {

	public static void main(String[] args) {

		/*
		 * Math class: Provided by java.lang package 
		 * Major used methods: 
		 * Math.min,Math.max, Math.pow, Math.PI etc
		 * A static method, hence called/accessed directly
		 */

		int num1 = 110;
		int num2 = 245;

		System.out.println(Math.min(num1, num2));
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.PI);
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.E);
		System.out.println(Math.random()); //generates numbers between zero and 1,number > 0 but number < 1
		System.out.println((int)(Math.random() * 1000)); //can be tweaked
		System.out.println((int)(Math.random() * 1000) + 5000);
		System.out.println(Math.round(457.90));


	}

}
