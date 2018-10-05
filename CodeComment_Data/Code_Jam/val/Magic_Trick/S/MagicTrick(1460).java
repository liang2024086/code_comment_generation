package methodEmbedding.Magic_Trick.S.LYD163;


import java.util.*;
import java.io.*;

public class MagicTrick {
	
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("A-small.in"));
		System.setOut(new PrintStream("A-small.out"));
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int t = 1; t <= T; ++t) {
			int[] cnt = new int[17];
			
			for (int k = 0; k < 2; ++k) {
				int ans = in.nextInt();
				
				for (int i = 1; i <= 4; ++i)
					for (int j = 1; j <= 4; ++j) {
						int card = in.nextInt();
						if (i == ans)
							++cnt[card];
					}
			}
			int possible = 0;
			int cntPossible = 0;
			for (int i = 1; i <= 16; ++i)
				if (cnt[i] == 2) {
					++cntPossible;
					possible = i;
				}
			
			System.out.println("Case #" + t + ": " + (cntPossible == 1 ? possible : cntPossible == 0 ? "Volunteer cheated!" : "Bad magician!"));
		}
		
		in.close();
		System.exit(0);
	}

}
