package utilityClasses;

public class UtilityOrWrapper {

	public static void main(String[] args) {


		String[] arr = {"777", "qwerty", "247", "098", "34", "12348909", "Another"};
		
		for(int i = 0; i < arr.length; i++) {
			
			try {
				
				int converter = Integer.parseInt(arr[i]);
				
				/**
				 *others include
				 *String s = Integer.toString(arg0);
				 *double d = Double.parseDouble(s);
				 *etc
				 */
			
				System.out.println(converter+" converted successfully");
			}catch(NumberFormatException e) {
				
				System.out.println("convertion failed "+ arr[i]+" is not an int");
			}
		}
		
		//This woudnt have worked
//		int i = 0;
//		try {
//		for(i = 0; i < arr.length; i++) {
//			
//			
//				
//				int converter = Integer.parseInt(arr[i]);
//				System.out.println(converter+" converted successfully");
//			}
//		}catch(NumberFormatException e) {
//			
//			System.out.println("convertion failed "+ arr[i]+" is not an int");
//		}
	}

}
