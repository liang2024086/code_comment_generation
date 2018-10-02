package methodEmbedding.Magic_Trick.S.LYD794;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class MagicTrick {
	public static void main(String[]args) throws Exception{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new FileWriter("MagicTrick.out"));
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			int r1 = in.nextInt()-1, r2;
			int[][] cards = new int[4][4];
			int[][] cards2 = new int[4][4];
			
			for(int j = 0; j < 4; j++)
				for(int k = 0; k < 4; k++)
					cards[j][k] = in.nextInt();
			
			r2 = in.nextInt()-1;
			
			for(int j = 0; j < 4; j++)
				for(int k = 0; k < 4; k++)
					cards2[j][k] = in.nextInt();
			
			HashSet<Integer> nums1 = new HashSet<Integer>();
			int count = 0, card = -1;
			
			for(int j = 0; j < 4; j++)
				nums1.add(cards[r1][j]);
			for(int j = 0; j < 4; j++) {
				if(nums1.contains(cards2[r2][j])) {
					card = cards2[r2][j];
					count++;
				}
			}
			
			if(count > 1)
				out.println("Case #" + (i+1) + ": Bad Magician!");
			else if(count == 0)
				out.println("Case #" + (i+1) + ": Volunteer cheated!");
			else
				out.println("Case #" + (i+1) + ": " + card);
		}
		
		in.close();
		out.close();
	}
}
