package methodEmbedding.Speaking_in_Tongues.S.LYD1426;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sarjith
 *
 */
public class SpeakingInTongues {

	static char[] replacements = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p',
			'f','m','a','q'};
	
	/**
	 * @param args
	 */
		public static void main(String[] args) throws IOException {
			BufferedReader reader = new BufferedReader(new FileReader("/home/sarjith/Downloads/A-small-attempt1.in"));
			FileWriter writer = new FileWriter("/home/sarjith/Desktop/output.txt");
			int cases = Integer.valueOf(reader.readLine());
			for (int i = 0; i < cases; i++ ) {
				String line = reader.readLine();
				String output = "";
				for (int j = 0 ; j < line.length(); j++) {
					char c = line.charAt(j);
					if (c != ' ')
						c = replacements[c - 'a'];
					output += String.valueOf(c);
				}
				output = "Case #" + (i+1) + ": " + output;
				System.out.println(output);
				writer.write(output + "\n");
			}
			writer.close();
			reader.close();
		}

}
