package methodEmbedding.Speaking_in_Tongues.S.LYD197;

import java.util.HashMap;
import java.util.Scanner;


public class SpeakingInTongues {
	
	public static void main(String[] args) throws NumberFormatException {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		String[] trainCipher = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv", "y qeez"};
		String[] trainPlain = {"our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up", "a zooq"};
		for (int i = 0; i < trainCipher.length; i++) {
			if (trainCipher[i].length() != trainPlain[i].length()) {
				throw new NumberFormatException();
			}
			for (int j = 0; j < trainCipher[i].length(); j++) {
				map.put(trainCipher[i].charAt(j), trainPlain[i].charAt(j));
			}
		}
		
		for (char i = 'a'; i <= 'z'; i++) {
			if (!map.containsKey(i)) {
				System.out.printf("Missing %c\n", i);
			}
		}
		
		Scanner in = new Scanner(System.in);
		int nCases = in.nextInt();
		in.nextLine();
		for (int c = 0; c < nCases; c++) {
			char[] input = in.nextLine().toCharArray();
			char[] output = new char[input.length];
			for (int i = 0; i < input.length; i++) {
				output[i] = map.get(input[i]);
			}
			System.out.printf("Case #%d: %s\n", c+1, new String(output));
		}
	}
}
