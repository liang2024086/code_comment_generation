package methodEmbedding.Speaking_in_Tongues.S.LYD269;

import java.util.HashMap;
import java.util.Scanner;


public class SpeakingTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//number of case tests
		int n;
		
		HashMap<Integer, Character> translateTable = new HashMap<Integer, Character>();
		translateTable.put((int)' ', ' ');
		translateTable.put((int)'a', 'y');
		translateTable.put((int)'b', 'h');
		translateTable.put((int)'c', 'e');
		translateTable.put((int)'d', 's');
		translateTable.put((int)'e', 'o');
		translateTable.put((int)'f', 'c');
		translateTable.put((int)'g', 'v');
		translateTable.put((int)'h', 'x');
		translateTable.put((int)'i', 'd');
		translateTable.put((int)'j', 'u');
		translateTable.put((int)'k', 'i');
		translateTable.put((int)'l', 'g');
		translateTable.put((int)'m', 'l');
		translateTable.put((int)'n', 'b');
		translateTable.put((int)'o', 'k');
		translateTable.put((int)'p', 'r');
		translateTable.put((int)'q', 'z');
		translateTable.put((int)'r', 't');
		translateTable.put((int)'s', 'n');
		translateTable.put((int)'t', 'w');
		translateTable.put((int)'u', 'j');
		translateTable.put((int)'v', 'p');
		translateTable.put((int)'w', 'f');
		translateTable.put((int)'x', 'm');
		translateTable.put((int)'y', 'a');
		translateTable.put((int)'z', 'q');
		
		
		String phrase;
		StringBuilder answerPhrase;
		
		n = s.nextInt();
		s.nextLine();
		
		for(int t=1; t<= n; t++){
			phrase = s.nextLine();
			char[] letters = phrase.toCharArray();
			answerPhrase = new StringBuilder();
			
			for (int i = 0; i < letters.length; i++) {
//				int a = letters[i];
//				System.out.println(letters[i]+ " \t " +a);
				answerPhrase.append(translateTable.get((int) letters[i]));
			}
			
			System.out.println("Case #" + t + ": " + answerPhrase.toString());
		}
	}
}
