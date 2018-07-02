package methodEmbedding.Cookie_Clicker_Alpha.S.LYD827;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class QualificationRoundB_CookieClickerAlpha {

	private static final String INPUT_FILE = "B-small-attempt0.in";
	private static final String OUTPUT_FILE = "B-small-attempt0.out";
	
	public static void main(String[] args) throws Throwable {

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(OUTPUT_FILE));
			br = new BufferedReader(new FileReader(INPUT_FILE));
			
			int nCase = Integer.parseInt(br.readLine());
			
			StringBuilder sb = new StringBuilder();
			for (int i=0;i<nCase;i++) {
				
				String[] line = br.readLine().split(" ");
				double C = Double.parseDouble(line[0]);
				double F = Double.parseDouble(line[1]);
				double X = Double.parseDouble(line[2]);

				int n=0;
				double prev = X/2.0;
				double next = X/(2.0+F) + C/2.0;
				n = 2;
				while (next < prev) {
					prev = next;
					next = next + C/(2.0+F*(n-1)) + X * (1.0/(2.0+F*n)-1.0/(2.0+F*(n-1)));
					n++;
				}

				sb.append("Case #");
				sb.append(i+1);
				sb.append(": ");
				sb.append(prev);
				sb.append("\n");
			}
			
			bw.write(sb.toString());
		
		} catch (Throwable t) {
			throw t;
		} finally {
			if (br != null) {
				br.close();
			}
			if (bw != null) {
				bw.close();
			}
		}
	}

}
