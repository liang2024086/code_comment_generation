package methodEmbedding.Speaking_in_Tongues.S.LYD744;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class SpeakingInTongues {
	private static final boolean DEBUG = false;
	private static final String FILENAME = "speaking";

	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();

		if(DEBUG) {
			System.setIn(new BufferedInputStream(new FileInputStream(FILENAME + "_example.in")));
		} else {
			System.setIn(new BufferedInputStream(new FileInputStream(FILENAME + ".in")));
			System.setOut(new PrintStream(FILENAME + ".out"));
		}

		Scanner sc = new Scanner(System.in);
		
		String googlerese = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qee";
		String english =    "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zoo";
		
		char[] mapping = new char['z' - 'a' + 1];
		
		for(int i = 0; i < googlerese.length(); i++) {
			if(googlerese.charAt(i) != ' ') {
				mapping[googlerese.charAt(i) - 'a'] = english.charAt(i);
			}
		}
		
		mapping[mapping.length - 1] = 'q';
		
		/*for(int i = 0; i < mapping.length; i++) {
			System.out.println((char)('a' + i) + " = " + mapping[i]);
		}*/

		int numTestCases = sc.nextInt();
		sc.nextLine(); //Skip newline
		for(int caseNum = 1; caseNum <= numTestCases; caseNum++) {
			String translate = sc.nextLine();
			StringBuilder result = new StringBuilder();
			
			for(int i = 0; i < translate.length(); i++) {
				if(translate.charAt(i) == ' ') {
					result.append(" ");
				} else {
					result.append(mapping[translate.charAt(i) - 'a']);
				}
			}

			System.out.println("Case #" + caseNum + ": " + result);
		}

		if(DEBUG) System.out.println("Total time: " + ((System.nanoTime() - startTime) / 1000.0 / 1000.0 / 1000.0) + "s");
	}
}
