package methodEmbedding.Speaking_in_Tongues.S.LYD1317;

import java.util.HashMap;
import java.util.Scanner;

public class MessageDecoder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Character, Character> decodeMapping = new HashMap<Character, Character>();
		// Mapping given in problem statement
		decodeMapping.put('y', 'a');
		decodeMapping.put('e', 'o');
		decodeMapping.put('q', 'z');

		// Derive mappings from samples given in problem statement
		String encodedMessages[] = {
				"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv" };

		String decodedMessages[] = {
				"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up" };

		for (int i = 0; i < encodedMessages.length; i++) {
			for (int j = 0; j < encodedMessages[i].length(); j++) {
				/*
				 * if(decodeMapping.get(encodedMessages[i].charAt(j)) != null &&
				 * decodeMapping.get(encodedMessages[i].charAt(j)) !=
				 * decodedMessages[i].charAt(j))
				 * System.err.println("Mapping error");
				 */
				decodeMapping.put(encodedMessages[i].charAt(j),
						decodedMessages[i].charAt(j));
			}
		}

		// Add missing mapping
		decodeMapping.put('z', 'q');

		// Form decode array
		Character[] decodeArray = new Character[128];
		for (Character character : decodeMapping.keySet()) {
			decodeArray[character] = decodeMapping.get(character);
		}

		int T = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= T; i++) {
			String encodedMessage = in.nextLine();
			System.out.format("Case #%d: ", i);
			for(int j = 0; j < encodedMessage.length(); j++)
				System.out.print(decodeArray[encodedMessage.charAt(j)]);
			System.out.println();
		}
	}
}
