package methodEmbedding.Speaking_in_Tongues.S.LYD1235;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SpeakingInTongues3 {
	public static void main(String[] args) {
		/* Get Dictionary */
		HashMap<Character, Character> letters = new HashMap<Character, Character>();;
		
		try {
			Scanner dict = new Scanner(new File("C:\\Users\\Mark\\Desktop\\CODE\\Google Code Jam\\SpeakingInTongues\\dictionary.txt"));
			String words1 = dict.nextLine();
			String words2 = dict.nextLine();

			for(int i = 0; i < words1.length(); i++) {
				char current = words1.charAt(i);
				if(!letters.containsKey(current)){
					letters.put(current, words2.charAt(i));
				}
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		/* Print out Answers */

		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for(int t = 0; t < T; t++) {
			System.out.print("Case #" + (t+1) + ": ");
			
			String input = sc.nextLine();
			StringBuilder output = new StringBuilder();
			
			for(int i = 0; i < input.length(); i++) {
				output.append(letters.get(input.charAt(i)));
			}
			
			System.out.println(output);
		}
		
	    
		
	}

}
