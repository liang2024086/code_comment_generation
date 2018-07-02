package methodEmbedding.Magic_Trick.S.LYD307;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class QualificationRoundA_MagicTrick {

	private static final String INPUT_FILE = "A-small-attempt0.in";
	private static final String OUTPUT_FILE = "A-small-attempt0.out";
	
	private static final String MULTI_CARD = "Bad magician!";
	private static final String NO_CARD = "Volunteer cheated!";
	
	public static void main(String[] args) throws Throwable {

		BufferedReader br = null;
		BufferedWriter bw = null;

		int nRows = 4;
		
		try {
			bw = new BufferedWriter(new FileWriter(OUTPUT_FILE));
			br = new BufferedReader(new FileReader(INPUT_FILE));
			
			int nCase = Integer.parseInt(br.readLine());
			
			StringBuilder sb = new StringBuilder();

			for (int i=0;i<nCase;i++) {
				int firstChosenLine = Integer.parseInt(br.readLine());
				String[] firstSq = null;
				
				for (int j=0;j<nRows;j++) {
					String line = br.readLine();
					if (j+1==firstChosenLine) {
						firstSq = line.split(" ");
					}
				}
				
				Set<String> numSet = new HashSet<String>();
				for (String num : firstSq) {
					numSet.add(num);
				}
				
				int secondChosenLine = Integer.parseInt(br.readLine());
				String[] secondSq = null;
				for (int j=0;j<nRows;j++) {
					String line = br.readLine();
					if (j+1==secondChosenLine) {
						secondSq = line.split(" ");
					}
				}

				int count = 0;
				String result = null;
				for (String num : secondSq) {
					if (numSet.contains(num)) {
						count++;
						result = num;
					}
				}
				sb.append("Case #");
				sb.append(i+1);
				sb.append(": ");
				if (count==0) {
					sb.append(NO_CARD);
				} else if (count==1) {
					sb.append(result);
				} else {
					sb.append(MULTI_CARD);
				}
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
