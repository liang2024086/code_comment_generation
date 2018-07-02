package methodEmbedding.Magic_Trick.S.LYD408;

import java.io.*;
import java.util.*;
import java.lang.*;


public class magictrick {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader (new FileReader ("A-small-attempt0.in"));
		PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("magicktrick.out")));
		int n = Integer.parseInt(input.readLine());
		for(int i = 0; i < n;i++) {
			int row1 = Integer.parseInt(input.readLine());
			int[] row_i = new int[4];
			int[][] init_board = new int[4][4];
			for(int j = 0; j<4;j++) {
				String[] temp = input.readLine().split(" ");
				int[] t = new int[4];
				for(int k = 0; k<4;k++) {
					t[k] = Integer.parseInt(temp[k]);
				}
				init_board[j] = t;
				if(j == row1-1) {row_i = t;}
			}
			int row2 = Integer.parseInt(input.readLine());
			int[] row_f = new int[4];
			int[][] end_board = new int[4][4];
			for(int j = 0; j<4;j++) {
				String[] temp = input.readLine().split(" ");
				int[] t = new int[4];
				for(int k = 0; k<4;k++) {
					t[k] = Integer.parseInt(temp[k]);
				}
				end_board[j] = t;
				if(j == row2-1) {row_f = t;}
			}
			//input done
			//use row_i and row_f
			int count = 0;
			int card = 0;
			for(int j = 0;j<4;j++) {
				int cur = row_i[j];
				for(int k = 0;k<4;k++) {
					if(cur == row_f[k]) {
						count++;
						card = cur;
					}
				}
			}
			if(count==0) {output.println("Case #" + (i+1) + ": Volunteer cheated!");}
			else if (count >1) {output.println("Case #" + (i+1) + ": Bad magician!");}
			else {output.println("Case #" + (i+1) + ": " + card);}


		}
		output.close();
		input.close();
	}
}
