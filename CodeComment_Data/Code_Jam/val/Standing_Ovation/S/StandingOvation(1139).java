package methodEmbedding.Standing_Ovation.S.LYD627;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class StandingOvation {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			PrintWriter pw = new PrintWriter(new FileWriter("output.out"));
			
			int cases = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < cases; i++) {
				String[] in = br.readLine().split(" ");
				int maxShyness = Integer.parseInt(in[0]);
				String shyArray = in[1];
				int moreNeeded = 0;
				int currentStanding = 0;
				
				for(int j = 0; j < shyArray.length(); j++) {
					if(currentStanding >= j) {
						currentStanding += shyArray.charAt(j)-'0';
					} else {
						
						if(shyArray.charAt(j)-'0' > 0) {
							int diff = j-currentStanding;
							moreNeeded += diff;
							currentStanding += diff;
							currentStanding += shyArray.charAt(j)-'0';
						}
					}
				}
				pw.write("Case #" + (i+1) + ": "+moreNeeded + "\n");
			}
			br.close();
			pw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
