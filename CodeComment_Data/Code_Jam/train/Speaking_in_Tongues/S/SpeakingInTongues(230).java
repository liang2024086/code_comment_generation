package methodEmbedding.Speaking_in_Tongues.S.LYD1332;


import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * @author Jwalin Pandya
 */
public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String inputFilename = System.getProperty("user.dir")
					+ System.getProperty("file.separator") + "A-small-attempt0.in";

			String outputFilename = System.getProperty("user.dir")
					+ System.getProperty("file.separator") + "A-small-attempt0.out";

			ArrayList<String> input = new ArrayList<String>();

			FileInputStream fstream = new FileInputStream(inputFilename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = "";

			while ((strLine = br.readLine()) != null) {
				input.add(strLine);
			}
			in.close();

			System.out.println("Input:");
			for (int i = 0; i < input.size(); i++)
				System.out.println(input.get(i));

			System.out
					.println("\n------------------------------------------\n");

			Hashtable<String, String> googlerese = new Hashtable<String, String>();

			googlerese.put("a", "y");
			googlerese.put("b", "h");
			googlerese.put("c", "e");
			googlerese.put("d", "s");
			googlerese.put("e", "o");
			googlerese.put("f", "c");
			googlerese.put("g", "v");
			googlerese.put("h", "x");
			googlerese.put("i", "d");
			googlerese.put("j", "u");
			googlerese.put("k", "i");
			googlerese.put("l", "g");
			googlerese.put("m", "l");
			googlerese.put("n", "b");
			googlerese.put("o", "k");
			googlerese.put("p", "r");
			googlerese.put("q", "z");
			googlerese.put("r", "t");
			googlerese.put("s", "n");
			googlerese.put("t", "w");
			googlerese.put("u", "j");
			googlerese.put("v", "p");
			googlerese.put("w", "f");
			googlerese.put("x", "m");
			googlerese.put("y", "a");
			googlerese.put("z", "q");
			googlerese.put(" ", " ");

			FileWriter fwriter = new FileWriter(outputFilename);
			BufferedWriter bwriter = new BufferedWriter(fwriter);

			System.out.println("Output");
			for (int i = 1; i < input.size(); i++) {
				System.out.print("Case #" + i + ": ");
				bwriter.write("Case #" + i + ": ");
				
				for (int j = 0; j < input.get(i).length(); j++) {
					System.out.print(googlerese
							.get(input.get(i).charAt(j) + ""));
					bwriter.write(googlerese.get(input.get(i).charAt(j) + ""));
				}
				
				System.out.println();
				bwriter.newLine();
			}
			bwriter.close();
			System.out.println("Check output file..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
