package methodEmbedding.Standing_Ovation.S.LYD987;

/**
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author grawat
 * 
 */
public class StandingOvationEngine {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File file = new File(
				"C:\\Users\\grawat\\Desktop\\googlecodejam\\A-small-attempt0.in");
		File outFile = new File(
				"C:\\Users\\grawat\\Desktop\\googlecodejam\\A-small-attempt0.out");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		int noOfTestCases = Integer.parseInt(br.readLine());
		if (noOfTestCases > 100) {
			br.close();
			bw.close();
			throw new IllegalArgumentException(
					"Test cases should be less than equal to 100");
		}
		for (int i = 1; i <= noOfTestCases; i++) {
			int ppl = 0;
			int frnds = 0;
			String input = br.readLine();
			int s_max = Integer.parseInt(input.substring(0, 1));
			if (input.length() > (s_max + 3)) {
				br.close();
				bw.close();
				throw new IllegalArgumentException("Input Format Incorrcet");
			}
			String data = input.substring(2, s_max + 3);
			for (int j = 0; j < s_max + 1; j++) {
				// ppl = Integer.parseInt(in.next());
				if (ppl < (j)) {
					frnds++;
					ppl++;
				}
				ppl = ppl + Integer.parseInt(data.substring(j, j + 1));
			}
			bw.write("Case #"+ i +": "+ frnds+"\n");
		}
		br.close();
		bw.close();
	}

}
