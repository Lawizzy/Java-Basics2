package mini_Exercises;

public class StarPyramid {

	public static void main(String[] args) {


		for (int x = 1; x < 10; x++) {
			
			System.out.print(x+": ");
			
			for (int y = 0; y < 1 * x; y++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
