package methodEmbedding.Standing_Ovation.S.LYD1975;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ProblemA {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("C:/Users/Ryan/workspace/GoogleCodeJam2015/src/qualification_round/A-small-practice.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/Ryan/workspace/GoogleCodeJam2015/src/qualification_round/small_output.txt"));
		int t = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < t; i++) {
			String[] line = in.readLine().split(" ");
			int smax = Integer.parseInt(line[0]);
			int total = 0;
			int friends = 0;
			
			for (int j = 0; j < smax + 1; j++) {
				int aud = line[1].charAt(j) - '0';
				
				if (total >= j) {
					total += aud;
				} else {
					int diff = j - total;
					friends += diff;
					total += (diff + aud);
				}
			}
			
			out.write("Case #" + (i + 1) + ": " + friends + "\n");
		}
		
		in.close();
		out.close();
	}	
	
	
}
