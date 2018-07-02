package methodEmbedding.Speaking_in_Tongues.S.LYD412;

import java.io.InputStreamReader;
import java.util.Scanner;

public class LanguageCode {

	public static void main(String[] args) {
		Scanner inputFile = new Scanner(new InputStreamReader(System.in));
		char[] encodeCharacters = new char[]{'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j','p', 'f', 'm', 'a', 'q'};
		String inputLine = null;
		int count = 0;
		int testCaseCount = 1;
		StringBuilder decodeString = new StringBuilder();
		char baseChar = 'a';
		char readChar; 
		
		while (inputFile.hasNextLine()) {
			inputLine = inputFile.nextLine();
			if(count == 0) {
				//testCaseCount = Integer.parseInt(inputLine);
			} else {
				for (int i = 0; i < inputLine.length(); i++) {
					readChar = inputLine.charAt(i);
					if(readChar == ' ') {
						decodeString.append(' ');
					} else {
						decodeString.append(encodeCharacters[readChar - baseChar]);
					}
				}
				System.out.println("Case #" + testCaseCount++ + ": " + decodeString.toString());
				decodeString.delete(0, decodeString.length());
			}
			count++;
		}
	}
}
