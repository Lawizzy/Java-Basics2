package stringBuffer;

public class StringBufferTesting {

	public static void main(String[] args) {


		//Not a good approach as for every entry a new String object is created
//		String a = "";
//		
//		for(int i = 0; i <= 10; i++) {
//			a = a + i;
//		}
//		
//		System.out.println(a);
		
		//Instead use
		StringBuffer a = new StringBuffer();
		
		for(int i = 0; i <= 10; i++) {
			
			a.append(i + " ");
		}
		
		String results = a.toString();
		
		System.out.println(results);
		
	}

}
