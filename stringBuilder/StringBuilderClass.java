package stringBuilder;

public class StringBuilderClass {

	public static void main(String[] args) {


		/*
		 * A string is immutable
		 * Once created it can't be changed or modified
		 * StringBuilder class helps the issue of new string creation when concatenating string
		 * StringBuillder methods:
		 * append, insert, replace, delete, reverse
		 */
		
		String str1 = "I";
		str1 = str1 + " practice";
		str1 = str1 + " Java";
		
		System.out.println(str1);
		
		/*
		 * This is how the string objects are created
		 * I
		 * practice
		 * I practice
		 * Java
		 * I practice Java
		 * Making it 5 string objects created in memory
		 */
		
		StringBuilder sb = new StringBuilder("I");
		
		sb.append(" practice");
		sb.append(" Java");
		
		System.out.println(sb);
		System.out.println(sb.insert(1, " love to"));
		System.out.println(sb.replace(10, 18, "learn"));
		System.out.println(sb.delete(7, 16));
		System.out.println(sb.reverse());


	}

}
