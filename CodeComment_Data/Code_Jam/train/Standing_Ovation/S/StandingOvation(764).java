package methodEmbedding.Standing_Ovation.S.LYD1010;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("/Users/popeye/workspaces/interviews/Algorithms/data/A-small-attempt1.in"));
			PrintWriter writer = new PrintWriter("/Users/popeye/workspaces/interviews/Algorithms/data/A-small-attempt1.out", "UTF-8");
			
			int T = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < T; i++) { //going through test case
				int l = sc.nextInt();
				String audience = sc.next();
				int needed = 0;
				int currentStanding = 0;
				for(int n = 0; n < audience.length(); n++) {
					int current = Integer.parseInt(audience.charAt(n) + "");
					if(n == 0) {
						if(current == 0) {
							needed++;
							currentStanding++;
						} else {
							currentStanding += current;
						}
					} else {
						if(currentStanding >= n) 
							currentStanding+=current;
						else {
							needed += n - currentStanding;
							currentStanding+= (n-currentStanding) + current;
						}
					}
				}
			writer.println("Case #" + (i + 1) + ": " + needed);
			}
			
			writer.close();
			sc.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
