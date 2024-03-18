package varKeyword;

public class VarKeyword {

	public static void main(String[] args) {
		
		/*
		 * from java 10 upward, can use the var keyword
		 * Its not allowed at class level eg inside a class var str;
		 *  but rather in method level but not in arguments 
		 */


		int num1 = 4545;
		var num2 = 5654;
		var str1 = "Blah blah";
		var dbl = 56.09;
		
		System.out.println(num1+" "+ num2+ " "+ str1+" "+dbl);
	}

}
