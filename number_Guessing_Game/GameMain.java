package number_Guessing_Game;

import java.util.Scanner;


public class GameMain {

	public static void main(String[] args) {

		int randomNumber = (int) (Math.random() * 100) + 1;
		//System.out.println(randomNumber);
		boolean status = false;
		System.out.println("I picked a number 1 to 100\nTry guess the number");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 10; i > 0; i--) {
			
			System.out.println("You now have " + i + " guess(es) left:");
			
			int guess = sc.nextInt();
			System.out.println("Your guess: "+guess);
			
			if (randomNumber == guess) {
				System.out.println("***************************************************************");
				System.out.println("Correct, you have guessed the number");
				status = true;
				break;
			}
			
			else if(guess > randomNumber){
				System.out.println("Your guess is larger than the number");
			}
			
			else if(guess < randomNumber){
				System.out.println("Your guess is less than the number");
			}
//			else {
//				System.out.println("What you have entered is beyond the scope or not a number");
//			}

		}
		
		if (status) {
			System.out.println("YOU WIN!!!!!!");
		}
		else {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("You ran out of attempts, the number was: "+randomNumber);
		System.out.println("YOU LOSE!!!!!!");
		}
	}

}
