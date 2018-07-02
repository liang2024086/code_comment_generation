package methodEmbedding.Magic_Trick.S.LYD104;

import java.util.HashSet;
import java.util.Scanner;


public class P1 {

	public static void main(String[] args){
		String badMagician = "Bad magician!";
		String cheating = "Volunteer cheated!";
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[][] matrix1, matrix2 ;
		for (int t=0; t<T; t++){
			int ans1 = scan.nextInt(); ans1--;
			matrix1 = new int[4][4];
			matrix2 = new int[4][4];
			for (int i=0; i<4; i++){
				for (int j=0; j<4; j++){
					matrix1[i][j]= scan.nextInt();
				}
			}
			int ans2 = scan.nextInt(); ans2--;
			for (int i=0; i<4; i++){
				for (int j=0; j<4; j++){
					matrix2[i][j]= scan.nextInt();
				}
			}
			int res = -1;// initialized to not found
			for (int i=0; i<4; i++){
				int c1 = matrix1[ans1][i];
				for (int j=0; j<4; j++){
					int c2 = matrix2[ans2][j];
					if (c1==c2) 
						if (res==-1) res = c1;
						else res = 0;// bad magician...
				}
			}
			if (res==-1) System.out.println("Case #"+ (t+1)+ ": " + cheating);
			else if (res==0) System.out.println("Case #"+ (t+1)+ ": " +badMagician);
			else System.out.println("Case #"+ (t+1)+ ": " +res);
		}
	}
}
