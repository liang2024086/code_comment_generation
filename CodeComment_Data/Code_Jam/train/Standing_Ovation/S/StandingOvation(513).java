package methodEmbedding.Standing_Ovation.S.LYD529;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		
		int T = Integer.parseInt(br.readLine());

		int sMax, total, friends;
		String line[];
		
		for(int i=1; i<=T; i++) {
			
			friends = 0;
			
			line = br.readLine().split(" ");
			
			sMax = Integer.parseInt(line[0]);
			
			if(sMax==0) {
				pw.println("Case #" + i +": " + 0);	
				continue;
			}
			
			total = Character.getNumericValue(line[1].charAt(0));
			
			int p;
			
			for(int j=1; j<=sMax; j++) {
				
				p = Character.getNumericValue(line[1].charAt(j));
				
				if(p>0 && total<j) {
					int diference = j - total;
					total += p + diference;
					friends += diference;
				}
				else {
					total += p;	
				}
				
			}
			
			pw.println("Case #" + i +": " + friends);
		}
		
		pw.flush();
		pw.close();
		br.close();
	}
}
