package methodEmbedding.Speaking_in_Tongues.S.LYD909;

import java.util.Scanner;
import java.io.*;

public class SpeakingInTongue {
	private static Scanner inFile;
	private static PrintWriter outFile;
	private static final String FILE_NAME = "A-small-attempt0";
	
	private static final char[] ALPHA = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
	GOOGLERESE = {'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u', 'o', 'm', 'x',
		's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g', 't', 'h', 'a', 'q'};
	private static int numCases, charIndex;
	private static String sentence, answer;
	private static boolean found;
	
	public static void main(String[] args) throws IOException {
		inFile = new Scanner(new File(FILE_NAME + ".in"));
		outFile = new PrintWriter(FILE_NAME + ".out");
		
		numCases = Integer.parseInt(inFile.nextLine());
		
		for (int caseNum = 0; caseNum < numCases; caseNum++) {
			sentence = inFile.nextLine();
			answer = "";
			
			for (int senLetter = 0; senLetter < sentence.length(); senLetter++) {
				found = false;
				
				for (int charLetter = 0; charLetter < 26 && !found; charLetter++) {
					if (sentence.charAt(senLetter) == GOOGLERESE[charLetter] && sentence.charAt(senLetter) != ' ') {
						charIndex = charLetter;
						found = true;
					}
					else if (sentence.charAt(senLetter) == ' ') {
						charIndex = -1;
						found = true;
					}
				}
				
				if (charIndex != -1) {
					answer += ALPHA[charIndex];
				}
				else {
					answer += ' ';
				}
			}
			
			outFile.printf("Case #%d: %s\n", caseNum + 1, answer);
		}
		
		inFile.close();
		outFile.close();
		System.out.println("Succesfully written to " + FILE_NAME + ".out.");
	}
}
