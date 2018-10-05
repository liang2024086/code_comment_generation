package methodEmbedding.Magic_Trick.S.LYD2098;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(
				"infile/A-small-attempt2.in"));
		FileWriter fw = new FileWriter("infile/A-small-attempt2.out");

		int T = new Integer(in.readLine());
		for (int cases = 1; cases <= T; cases++) {
			String response = null;
			int firstChoiceRow = new Integer(in.readLine());
			String firstOptions = null;
			for (int i = 1; i < 5; i++) {

				if (firstChoiceRow == i)
					firstOptions = in.readLine();
				else
					in.readLine();
			}

			int secondChoiceRow = new Integer(in.readLine());
			String secondOptions = null;
			for (int i = 1; i < 5; i++) {

				if (secondChoiceRow == i)
					secondOptions = in.readLine();
				else
					in.readLine();
			}

			StringTokenizer st1 = new StringTokenizer(firstOptions);
			String tokens[] = secondOptions.split(" ");

			boolean found = false;
			while (st1.hasMoreElements()) {
				String token = st1.nextToken();
				for (int j = 0; j < tokens.length; j++) {
					if (tokens[j].equals(token)) {
						if (!found) {
							response = token;
							//System.out.println("token=" + token);
							found = true;
						} else {
							response = "Bad magician!";
							break;
						}
					}
				}

			}
			if (!found) {
				response = "Volunteer cheated!";
			}
			fw.write("case #" + cases + ": " + response + "\n");
		}

		in.close();

		fw.flush();
		fw.close();
	}

}
