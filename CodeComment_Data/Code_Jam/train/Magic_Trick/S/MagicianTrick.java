package methodEmbedding.Magic_Trick.S.LYD1380;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class MagicianTrick {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int noOfTestcases = Integer.parseInt(br.readLine());

		for(int i=0; i<noOfTestcases; i++) {

			
			int ans1 = Integer.parseInt(br.readLine());

			int[][] grid1 = new int[4][4];
			for (int rowNumber = 0; rowNumber < 4; rowNumber++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int colNumber = 0;
				while (st.hasMoreTokens()) {
					grid1[rowNumber][colNumber] = Integer.parseInt(st.nextToken());
					colNumber++;
				}
			}
			
			Set s1 = new HashSet<Integer>();
			for(int colNumber = 0; colNumber < 4; colNumber++) {
				s1.add(grid1[ans1-1][colNumber]);
			}
			
//			Answer 2

			int ans2 = Integer.parseInt(br.readLine());
			
			int[][] grid2 = new int[4][4];
			for (int rowNumber = 0; rowNumber < 4; rowNumber++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int colNumber = 0;
				while (st.hasMoreTokens()) {
					grid2[rowNumber][colNumber] = Integer.parseInt(st.nextToken());
					colNumber++;
				}
			}
						
			Set s2 = new HashSet<Integer>();
			for(int colNumber = 0; colNumber < 4; colNumber++) {
				s2.add(grid2[ans2-1][colNumber]);
			}
			
//			find intersection
			s1.retainAll(s2);
			
			if(s1.size() == 1) {
				System.out.println("Case #" + (i+1) + ": " + s1.iterator().next());
			} else if(s1.size() == 0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			} else {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
			
		}
	}

}
 
