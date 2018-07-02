package methodEmbedding.Magic_Trick.S.LYD686;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numCases = s.nextInt();
		for (int z = 1; z <= numCases; z++) {
			int fChoice = s.nextInt() - 1;
			int[][] first = new int[4][4];
			for(int row = 0; row < 4; row++){
				for(int col = 0; col < 4; col++){
					first[row][col] = s.nextInt();
				}
			}
			int sChoice = s.nextInt() - 1;
			int[][] second = new int[4][4];
			for(int row = 0; row < 4; row++){
				for(int col = 0; col < 4; col++){
					second[row][col] = s.nextInt();
				}
			}
			
			int ans = 0;
			for(int a = 0; a < 4; a++){
				boolean works = false;
				for(int b = 0; b < 4; b++){
					if(first[fChoice][a] == second[sChoice][b]){
						works = true;
					}
				}
				if(works){
					if(ans == 0){
						ans = first[fChoice][a];
					} else {
						ans = -1; //multiple answers
					}
				}
			}
			if(ans == 0){
				System.out.println("Case #" + z + ": Volunteer cheated!");
			} else if(ans == -1){
				System.out.println("Case #" + z + ": Bad magician!");		
			} else {
				System.out.println("Case #" + z + ": " + ans);
			}
		
		}
	}
}
