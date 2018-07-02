package methodEmbedding.Speaking_in_Tongues.S.LYD1001;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		final String english    = " abcdefghijklmnopqrstuvwxyz";
		final String googlerese = " ynficwlbkuomxsevzpdrjgthaq";
		BufferedReader inf;
		try {
			inf = new BufferedReader(new FileReader("C:\\Users\\Coltin\\Downloads\\A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		int nLines = Integer.parseInt(inf.readLine());
		System.out.println(nLines);
		for (int i = 0; i < nLines; i++) {
			//char[] curLine = inf.readLine().toCharArray();
			String newLine = "";
			//for (int j = 0; j < curLine.length(); j++) {
			for (char c : inf.readLine().toCharArray()) {
				newLine += english.charAt(googlerese.indexOf(c));
			}
			System.out.println("Case #" + (i+1) + ": " + newLine);
		}

	}

}
