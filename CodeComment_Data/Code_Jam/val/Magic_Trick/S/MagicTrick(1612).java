package methodEmbedding.Magic_Trick.S.LYD812;

import java.util.*;
import java.io.*;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		int T = Integer.parseInt(scan.nextLine());
		for(int k = 1; k <= T; k++) {
			int R1, R2;
			int[] possible = new int[4];
			R1 = Integer.parseInt(scan.nextLine());
			String t = "";
			for(int i = 0; i < 4; i++) {
				String temp = scan.nextLine();
				if(i+1 == R1)
					t = temp;
			}
				
			//System.out.println(t);
			StringTokenizer st = new StringTokenizer(t);
			for(int i = 0; i < 4; i++)
				possible[i] = Integer.parseInt(st.nextToken());
			R2 = Integer.parseInt(scan.nextLine());

			for(int i = 0; i < 4; i++) {
				String temp = scan.nextLine();
				if(i+1 == R2)
					t = temp;
			}
			//System.out.println(t);
			st = new StringTokenizer(t);
			
			int count = 0;
			int val = -1;
			for(int i = 0; i < 4; i++) {
				int temp = Integer.parseInt(st.nextToken());
				for(int j = 0; j < 4; j++) 
					if(temp == possible[j]) {
						count++;
						val = temp;
					}
			}
			String out = "";
			//System.out.println(count);
			if(count == 0)
				out = "Volunteer cheated!";
			else if(count == 1)
				out = val + "";
			else
				out = "Bad magician!";
			System.out.println("Case #" + k + ": " + out);
		}
	}
}
