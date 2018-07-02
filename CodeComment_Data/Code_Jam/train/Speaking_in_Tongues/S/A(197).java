package methodEmbedding.Speaking_in_Tongues.S.LYD642;

import java.util.*;
import static java.lang.Math.*;

public class A {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//````````````````````````````````````````````````````````````````````
		// Read in how many cases there will be, and print a new line
		int T = input.nextInt();
		input.skip("\n");
		System.out.println();

		//````````````````````````````````````````````````````````````````````
		// Create two keys for translation from Googlerese to English
		String[] googleKey = {"a","b","c","d","e","f","g","h","i","j","k","l",
			"m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] englishKey = {"y","h","e","s","o","c","v","x","d","u","i","g",
			"l","b","k","r","z","t","n","w","j","p","f","m","a","q"};

		//```````````````````````````````````````````````````````````````````
		// For each line translate from Googlerese to English
		for(int caseNumber = 1; caseNumber <= T; caseNumber++){
			String outputString = "";

			// Read in next line and store in inputString
			String inputString = input.nextLine();
			int len = inputString.length();

			// Translate inputString and store in outputString
			for(int i = 0; i < len; i++){
				// Find location of Googlerese letter
				int index = Arrays.binarySearch(googleKey, ("" + inputString.charAt(i)));	
				if(index == -1){
					outputString += " ";
				} else{
					outputString += englishKey[index];
				}

			}

			// Print translated line
			System.out.format("Case #%d: %s\n", caseNumber, outputString);
		}
	}
}
