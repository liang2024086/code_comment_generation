package methodEmbedding.Speaking_in_Tongues.S.LYD512;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpeakingInTongues {
	private static final File inFile = new File("input");
	private static final File outFile = new File("output");
	private static final String TRAINING_ENCODED = "ejp mysljylc kd kxveddknmc re " +
			"jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr" +
			" kd eoya kw aej tysr re ujdr lkgc jv yeq";
	private static final String TRAINING_DECODED = "our language is impossible to" +
			" understand there are twenty six factorial possibilities so it is okay" +
			" if you want to just give up aoz";
	private static final int ASCII_OFFSET = 97;
	
	private static char[] cipher = new char[26];
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(inFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
		int numTests = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < TRAINING_ENCODED.length(); i++) {
			char c = TRAINING_ENCODED.charAt(i);
			if (c != ' ')
				cipher[c-ASCII_OFFSET] = TRAINING_DECODED.charAt(i);
		}
		
		// Google has shorted us by one character, use process of elimination
		int sum = 0, expected = 0, missing = -1;
		for (int i = 0; i < cipher.length; i++) {
			expected += i+ASCII_OFFSET;
			if ((int)cipher[i] != 0)
				sum += cipher[i];
			else
				missing = i;
		}
		cipher[missing] = (char) (expected-sum);
		
		for (int i = 0; i < numTests; i++) {
			String G = in.readLine();
			StringBuilder output = new StringBuilder();
			for (char c : G.toCharArray())
				if (c != ' ')
					output.append(cipher[c-ASCII_OFFSET]);
				else
					output.append(c);
			out.write("Case #" + (i+1) + ": " + output.toString() + "\n");
		}
		out.flush();
		out.close();
	}
	
}
