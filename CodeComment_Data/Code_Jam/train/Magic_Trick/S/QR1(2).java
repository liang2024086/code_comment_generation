package methodEmbedding.Magic_Trick.S.LYD552;

import java.io.BufferedReader;
import java.io.FileReader;


public class QR1 {
	public static void main(String[] args) throws Exception {
//		String inputfilename = args[0];
		String inputfilename = "/Users/stone75/Downloads/A-small-attempt1.in";
		BufferedReader br = new BufferedReader(new FileReader(inputfilename));
		int totalcase = 0;
		
		totalcase = Integer.parseInt(br.readLine());
		for (int i=0; i<totalcase; i++) {
			int firstselectrow, secondselectrow;
			String[] firstselectnums = new String[4];
			String[] secondselectnums = new String[4];
			int match = 0;
			String matchnum = null;
			
			firstselectrow = Integer.parseInt(br.readLine());
			for (int k=0; k<4; k++) {
				String line = br.readLine();
				if (firstselectrow == (k+1)) {
					firstselectnums = line.split(" ");
				}
			}
			
			secondselectrow = Integer.parseInt(br.readLine());
			for (int k=0; k<4; k++) {
				String line = br.readLine();
				if (secondselectrow == (k+1)) {
					secondselectnums = line.split(" ");
				}
			}
			
			for (int k=0; k<4; k++) {
				for (int p=0; p<4; p++) {
					if (firstselectnums[k].equalsIgnoreCase(secondselectnums[p])) {
						match ++;
						matchnum = firstselectnums[k];
					}
				}
			}
			
			if (match == 1) {
				System.out.println(String.format("Case #%d: %s", (i+1), matchnum));
			} else if (match == 0) {
				System.out.println(String.format("Case #%d: Volunteer cheated!", (i+1)));
			} else if (match > 1) {
				System.out.println(String.format("Case #%d: Bad magician!", (i+1)));
			}
		}
		br.close();
	}
}
