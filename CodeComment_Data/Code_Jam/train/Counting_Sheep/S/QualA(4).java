package methodEmbedding.Counting_Sheep.S.LYD990;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vietph
 */
public class QualA {

	private static final String INPUT_FILENAME = "A-small-attempt1.in";
	private static final String OUTPUT_FILENAME = "A-small-attempt1.out";

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
				int n = Integer.parseInt(line);
				int x = 0;
				short flags = 0;
				for (int i=0; i<100 && flags != 0x03ff; i++) {
					x += n;
					int xx = x;
					do {
						flags |= (1 << (xx % 10));
						xx /= 10;
					} while (xx > 0);
				}
				bw.write("Case #" + caseNo + ": " + (flags!=0x3ff ? "INSOMNIA" : String.valueOf(x)));
				bw.newLine();
			}
		}
		bw.close();
	}

}
