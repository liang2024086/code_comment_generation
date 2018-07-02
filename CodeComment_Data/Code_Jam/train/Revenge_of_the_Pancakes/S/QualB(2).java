package methodEmbedding.Revenge_of_the_Pancakes.S.LYD122;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vietph
 */
public class QualB {

	private static final String INPUT_FILENAME = "B-small-attempt0.in";
	private static final String OUTPUT_FILENAME = "B-small-attempt0.out";

	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedWriter bw;
		try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILENAME))) {
			bw = new BufferedWriter(new FileWriter(OUTPUT_FILENAME));
			String line;
			line = br.readLine();
			int count = Integer.parseInt(line);
			for(int caseNo=1; caseNo<=count; caseNo++) {
				line = br.readLine();
				int step = 0;
				int i = line.length() - 1;
				while (i>=0 && line.charAt(i)=='+') {
					i--;
				}
				char prev = '+';
				for (;i>=0; i--) {
					char c = line.charAt(i);
					if (c != prev) {
						step++;
						prev = c;
					}
				}
				bw.write("Case #" + caseNo + ": " + String.valueOf(step));
				bw.newLine();
			}
		}
		bw.close();
	}

}
