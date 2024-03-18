package mainMethodExploration;

import java.util.TreeSet;

public class MainMethod {

	public static void main(String[] args) {

		/*
		 * Main method: 
		 * Entry point to every java application
		 * If/when JVM can find main method it return a NoSuchMethodError
		 * Java Virtual Machine, allows java to be platform independent, hence can run anywhere regardless
		 * This because the normal code that you write is converted into byte code
		 */
		
		
		//Exploration 1
//		if(args.length == 0) {
//			
//			System.out.println("Enter a specific location");
//		}
//		
//		else {
//			
//			String location = args[0];
//			int temp = (int)(Math.random() * 100);
//			System.out.println("The temperature for "+location+" is "+temp+" degrece celcius");
//		}
		
		//Exploration 2
		
//		System.out.println("The arguments passed are: "+args.length);
//		
//		for (int i = 0; i < args.length; i++) {
//			
//			System.out.println("Argument number: "+i+" value: "+ args[i]);
//		}
		
		//Exploration 3 (my version)
//		String shortest = null;
//        String longest = null;
//        TreeSet<String> sortedWords = new TreeSet<>();
//        
//        if(args.length == 0) {
//        	System.out.println("Error: No arguments provided");
//        	//exit(0);
//        
//        for (int i = 0; i < args.length; i++){
//            
//            if(shortest == null || longest == null){
//                
//                shortest = args[0];
//                longest = args[0];
//                
//            }
//            else{
//                if(args.length < shortest.length()){
//                	shortest = args[i];
//                }
//                else if (args[i].length() > longest.length()){
//                    longest = args[i];
//                }
//            }
//            sortedWords.add(args[i]);
//        }
//        if(!sortedWords.isEmpty()) {
//        	System.out.println("Sorted words:");
//	        for (String each: sortedWords){
//	            System.out.println("\n" + each);
//	        }
//	        System.out.println("The longest word is: "+longest+" "+longest.length()+" with characters");
//	        System.out.println("The shortest word is: "+shortest+" "+shortest.length()+" with characters");
//        }
//       
//        }
		
		//Exploration 3
		
		if(args.length == 0) {
			
			System.out.println("Usage:  java AnalyzeWords [-sort] list_of_words");
			System.out.println("e.g.:   java AnalyzeWords -sort ZEBRA " +"ELEPHANT RAT MONKEY");
			
			System.exit(0);
		}
		boolean sort = false;
		TreeSet <String> sortedWords = new TreeSet<>();
		String shortest = null;
		String longest = null;
		
		for(int i = 0; i < args.length; i++) {
			
			if(args[i].equals("-sort")) {
				
				sort = true;
				continue;
			}
			
			if(shortest == null && !args[i].equals("-sort")) {
				
				shortest = args[i];
				longest = args[i];
			}
			else {
				if(args[i].length() < shortest.length()) {
					shortest = args[i];
				}
				if(args[i].length() > longest.length()) {
					longest = args[i];
				}
			}
			
			sortedWords.add(args[i]);
			
		}
		
		if(sort) {
			System.out.println("Sorted words: ");
			for(String each: sortedWords) {
				System.out.println("\t"+ each);
			}
		}
		System.out.println("Total word list: "+ sortedWords.size() +" words");
		System.out.println("The shortest word is: "+ shortest+" with "+shortest.length()+" characters");
		System.out.println("The longest word is: "+ longest+" with "+longest.length()+" characters");

	}

}
