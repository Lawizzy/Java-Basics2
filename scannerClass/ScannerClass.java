package scannerClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter your name: ");
//		
//		String userInput = sc.nextLine();
//		//int userInput = sc.nextInt(); for int and etc
//		
//		System.out.println("Hi, how are you "+userInput+ "??");
//		
//		StringBuilder sb = new StringBuilder(userInput); 
//		
//		System.out.println("Your name in reverse is: "+sb.reverse());
		
		try {
			
			System.out.println("Enter your full name(s): ");
			String name = sc.next();
			
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			
			System.out.println("Enter your GPA: ");
			double gpa = sc.nextDouble();
			
			System.out.println("\nYour name is "+ name+", who is "+age+" years old, with GPA of "+gpa);
		}catch(InputMismatchException e) {
			
			System.out.println("\nError: "+e+"\n"+"Did not enter the corrent input");
		}

	}

}
