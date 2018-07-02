package methodEmbedding.Speaking_in_Tongues.S.LYD1569;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class doMain {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		char[] googlerese = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u',
				'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p',
				'f', 'm', 'a', 'q' };
		File fFile = new File("/home/soloikos/Downloads/A-small-attempt1.in");
		File aFile = new File("/home/soloikos/Downloads/A-small_atempt-out.in");
		FileWriter output = new FileWriter(aFile, true);
		Scanner in = new Scanner(new FileReader(fFile));
		String delimiter = " ";
		char temp;

		int Cases = in.nextInt();
		in.nextLine();
		System.out.println(Cases + " Test Cases");
		for (int zz = 1; zz <= Cases; zz++) {
			String text = "Case #" + zz + ": ";
			output.write(text);
			String n = in.nextLine();
			String[] words = n.split(delimiter);
			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				for (int j = 0; j < word.length(); j++) {
					int ascii = (int) word.charAt(j);
					temp = googlerese[ascii - 97];
					output.write(temp);
				}
				output.write(" ");
			}
			output.write("\n");
		}
		output.close();
	}

}
