package methodEmbedding.Magic_Trick.S.LYD1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class MagicShow {

	public static void main(String[] args) throws Exception {

		String inFileName = "/Users/kodali_sumanth/Downloads/A-small-attempt1.in.txt";
		String outFileName = "/Users/kodali_sumanth/Downloads/magic_small1.out.txt";
		BufferedReader br = new BufferedReader(new FileReader(inFileName));
		PrintWriter pw = new PrintWriter(new FileWriter(outFileName));
		int numTestCases = Integer.valueOf(br.readLine());
		System.out.println("Number of test cases = " + numTestCases);
		for (int idxTestCase = 1; idxTestCase <= numTestCases; idxTestCase++) {
			int idxRow1 = Integer.valueOf(br.readLine());
			String row1 = "";
			for (int loop = 1; loop <= 4; loop++) {
				if (loop == idxRow1) {
					row1 = br.readLine();
				} else {
					br.readLine();
				}
			}
			int idxRow2 = Integer.valueOf(br.readLine());
			String row2 = "";
			for (int loop = 1; loop <=4; loop++) {
				if (loop == idxRow2) {
					row2 = br.readLine();
				} else {
					br.readLine();
				}
			}
			String[] row1Vals = row1.split(" ");
			String[] row2Vals = row2.split(" ");
			
			List<String> matches = new ArrayList<String>();
			for (String value1 : row1Vals) {
				for (String value2 : row2Vals) {
					if (value1.equals(value2)) {
						matches.add(value1);
					}
				}
			}
			
			if (matches.size() == 0) {
				pw.println("Case #" + idxTestCase + ": Volunteer cheated!");
			} else if (matches.size() > 1) {
				pw.println("Case #" + idxTestCase + ": Bad magician!");
			} else {
				pw.println("Case #" + idxTestCase + ": " + matches.get(0));
			}
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
