package movie_Guessing_Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class GameMain {

	public static void main(String[] args) throws Exception{
		
		Random rand = new Random();
		
		File file = new File("/home/luther/Downloads/movies.txt");
		Scanner scanner = new Scanner(file);
		
		ArrayList <String> Array1 = new ArrayList<String>();
		
		String movie = null;
		String dashedMovie = null;
		
		
		
		while(scanner.hasNextLine()) {
			
			String line = scanner.nextLine();
			
            
            Array1.add(line);
            
						
			//System.out.println(Array1);
			
			if(Array1.size() == 25) {
				
	            int randomIndex = rand.nextInt(line.length());

	            System.out.println("Random index: "+randomIndex);

	            movie = Array1.get(randomIndex);
	            
	            System.out.println("Random Movie to guess: "+movie);
	            
	    		dashedMovie = movie.replaceAll(".", " _ ");

 
	            System.out.println("Random Movie to guess: "+dashedMovie.replace(".", "_"));
			}

			
		}


		System.out.println("Guess the movie below");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 10; i > 0; i--) {
			
			System.out.println("You now have " + i + " guess(es) left:");

			
			String guess = sc.next();
			System.out.println("Your guess is: "+guess);
			
			if (movie.contains(guess)) {
								
//				for(int x = 0; x < movie.length(); x++) {
//				
//					System.out.println("new: " +movie.charAt(x) == guess);
//				
//				}
				int index = movie.indexOf(guess);

				System.out.println(index);
				dashedMovie.replace(dashedMovie, guess);
				System.out.println(dashedMovie);

			}
			
			else {
				System.out.println(false);
			}
		}
		
		
	}

}
