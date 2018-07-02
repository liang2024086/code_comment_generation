package methodEmbedding.Magic_Trick.S.LYD851;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class A {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String infile = "test.txt";
		String outfile = "out.txt";
		BufferedReader reader = new BufferedReader(new FileReader(infile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outfile));

		int t = Integer.parseInt(reader.readLine());
		for (int cas = 1; cas <= t; cas++) {
			int first = Integer.parseInt(reader.readLine());
			String fr[] = null;
			for (int i = 0; i < 4; i++)
				if (i + 1 == first)

					fr = reader.readLine().split(" ");
				else
					reader.readLine();
			int second = Integer.parseInt(reader.readLine());
			String sr[] = null;
			for (int i = 0; i < 4; i++)
				if (i + 1 == second)
					sr = reader.readLine().split(" ");
				else
					reader.readLine();
			int count = 0;
			int index = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (fr[i].equals(sr[j])) {
						count++;
						index = i;
					}
				}
			}
			writer.write("Case #" + cas + ": ");
			if (count == 0) {
				writer.write("Volunteer cheated!");
				writer.newLine();
			} else if (count == 1) {
				writer.write(fr[index]);
				writer.newLine();
			} else {
				writer.write("Bad magician!");
				writer.newLine();
			}

		}
		reader.close();
		writer.close();
	}
}
