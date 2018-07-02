package methodEmbedding.Speaking_in_Tongues.S.LYD1345;


import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Speaking_in_Tongues {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String outputFile = System.getenv("USERPROFILE")
				+ "\\Documents\\B-large.out";
		String inputFile = System.getenv("USERPROFILE")
				+ "\\Documents\\B-large.in";

		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		DataInputStream reader = new DataInputStream(new FileInputStream(
				inputFile));

		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		String googlereseAlphabet = "yhesocvxduiglbkrztnrjpfmaq ";
		char oldChar = ' ';
		char newChar = ' ';
		int index = 0;
		int T = Integer.valueOf(reader.readLine());
		for (int j = 0; j < T; j++) {

			String G = reader.readLine();

			String newG = "";
			for (int i = 0; i < G.length(); i++) {
				oldChar = G.charAt(i);
				index = alphabet.indexOf(oldChar);
				newChar = googlereseAlphabet.charAt(index);
				newG = newG + newChar;
			}
			int k = j + 1;
			writer.write("Case #"+ k+": "+newG);
			writer.newLine();
		}
		writer.close();
	}
}
