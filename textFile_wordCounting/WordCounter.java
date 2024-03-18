package textFile_wordCounting;

import java.io.File;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) throws Exception{

		File file = new File ("/home/luther/Downloads/testing.txt");
		Scanner sc = new Scanner(file);
		int wordCount = 0;
		
		while(sc.hasNextLine()){
			
			String line = sc.nextLine();
			
			wordCount += line.split(" ").length;
		}
		
		System.out.println("There are "+ wordCount+" words in the selected text file");
	}

}
