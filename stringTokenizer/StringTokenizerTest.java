package stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {


		String test = "This is a string here";
		String date = "17/04/1995";
		
		StringTokenizer st = new StringTokenizer(test);
		StringTokenizer st2 = new StringTokenizer(date, "/");
		
		/**
		 * The above works also on new line basis (\n), tabs (\t) etc
		 */
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
		
		System.out.println("***********************************");
		
		while(st2.hasMoreTokens()) {
			
			System.out.println(st2.nextToken());
		}
	}

}
