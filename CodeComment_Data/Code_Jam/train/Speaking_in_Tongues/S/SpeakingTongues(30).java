package methodEmbedding.Speaking_in_Tongues.S.LYD736;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SpeakingTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] input = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] output = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		try {
			FileWriter fstream = new FileWriter("SpeakingTongues.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			int noTestCases = Integer.parseInt(in.readLine());
			for (int i = 0; i < noTestCases; i++) {
				String inputLine = in.readLine();
				out.write("\nCase #" + (i + 1) + ": ");
				for (int j = 0; j < inputLine.length(); j++) {
					if (inputLine.charAt(j) == ' ') {
						out.write(" ");
						continue;
					}
					for (int k = 0; k < input.length; k++) {
						 if (inputLine.charAt(j) == input[k]) {
							out.write(Character.toString(output[k]));
							break;
						}
					}
				}
			}
			out.close();
		} catch (NumberFormatException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
	

	}

}
