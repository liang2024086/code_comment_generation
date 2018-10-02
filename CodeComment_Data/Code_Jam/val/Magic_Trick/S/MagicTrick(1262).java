package methodEmbedding.Magic_Trick.S.LYD958;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Pat Wanjau
 * 
 */
public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 1) {
			throw new RuntimeException("Input of file expected");
		}
		String outputFile = args[0].replaceAll("\\.\\w+$", ".out");
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		try {
			Integer tests = Integer.parseInt(br.readLine());
			int[][][][] datasets = new int[tests][2][4][4];
			int[][] answers = new int[tests][2];
			int count = 0, rowNumber;
			String a = null;
			while ((a = br.readLine()) != null) {
				rowNumber = count % 5 - 1;
				if (count % 5 == 0) {
					answers[count / 10][(count / 5) % 2] = Integer.parseInt(a);
				} else {
					int x = 0;
					for (String b : a.split("\\s+")) {
						datasets[count / 10][count / 5 % 2][rowNumber][x++] = Integer
								.parseInt(b);
					}
				}
				count++;
			}

			PrintWriter wr = new PrintWriter(outputFile);
			for (int test = 0; test < tests; test++) {
				int read1 = answers[test][0];
				int[] check1 = datasets[test][0][read1 - 1];
				int read2 = answers[test][1];
				int[] check2 = datasets[test][1][read2 - 1];

				int elements = 0;
				int answer = 0;
				for (int c : check1) {
					for (int d : check2) {
						if (c == d) {
							answer = c;
							elements++;
						}
					}
					if (elements > 1) {
						break;
					}
				}
				if (elements == 1 && answer != 0) {
					wr.println(String.format("Case #%d: %d", test + 1, answer));
				} else if (elements > 1) {
					wr.println(String.format("Case #%d: Bad magician!",
							test + 1));
				} else {
					wr.println(String.format("Case #%d: Volunteer cheated!",
							test + 1));
				}
			}
			wr.flush();
			wr.close();

		} catch (IOException ioe) {
			System.err.println("Message: " + ioe.getLocalizedMessage());
		}
	}
}
