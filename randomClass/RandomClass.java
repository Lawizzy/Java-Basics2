package randomClass;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {


		Random rand = new Random();
		
		for(int i = 1; i <= 10; i++) {
			//System.out.println(rand.nextInt(100)); //random numbers >=0 and < 100
			System.out.println(rand.nextInt(100) + 1000); //random numbers >=0 and < 100 then adds 1000

		}
	}

}
