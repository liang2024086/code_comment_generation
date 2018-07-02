package methodEmbedding.Standing_Ovation.S.LYD2105;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;

/**
 * @author Admin
 * 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19 = 9699690
 */
public class Gcj1_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output1.txt"));

		int nrT = Integer.parseInt(br.readLine());
		for(int t = 1; t <= nrT; t++) {
			String[] vals = br.readLine().split(" ");
			
			int sMax = Integer.parseInt(vals[0]);
			int[] nrs = new int[sMax + 1];
			for(int i = 0; i < nrs.length; i++) {
	      nrs[i] = vals[1].charAt(i) - '0';
      }
			
			for(int res = 0; res <= sMax; res++) {
				int reserve = nrs[0] + res - 1;
				boolean ok = reserve >= 0;
				for(int j = 1; j <= sMax; j++) {
					reserve += nrs[j] - 1;
					if(reserve < 0) {
						ok = false;
						break;
					}
				}
				if(ok) {
					pw.println("Case #" + t + ": " + res);
					pw.flush();
					break;
				}
			}
		}
		
		br.close();
		pw.close();
		System.out.println("done!");
	}
}
