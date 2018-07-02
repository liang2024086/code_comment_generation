package methodEmbedding.Magic_Trick.S.LYD714;

import java.util.Scanner;


public class A {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		StringBuilder p = new StringBuilder();
		int index = 1;
		while(T>0){
			p.append("Case #" + index++ + ": ");
			int[][] grid = new int[4][4];
			int answer = in.nextInt()-1;
			for(int i = 0; i < 4; i++)
				for (int t = 0; t< 4; t++)
					grid[i][t] = in.nextInt();
			int[][] grid2 = new int[4][4];
			int answer2 = in.nextInt()-1;
			for(int i = 0; i < 4; i++)
				for (int t = 0; t< 4; t++)
					grid2[i][t] = in.nextInt();
			int condition = 0;
			int guess = 0;
			for(int i = 0; i < 4; i++)
				for (int t = 0; t< 4; t++){
					if(grid[answer][i] == grid2[answer2][t]){
						guess = grid[answer][i];
						condition++;
						break;
					}
				}
			if (condition == 0) p.append("Volunteer cheated!\n");
			else if (condition == 1) p.append(guess+"\n");
			else p.append("Bad magician!\n");
			T--;
		}
		System.out.print(p);
		in.close();

	}

}
