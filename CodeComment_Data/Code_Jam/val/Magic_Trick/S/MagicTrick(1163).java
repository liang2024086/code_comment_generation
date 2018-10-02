package methodEmbedding.Magic_Trick.S.LYD2148;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		System.setOut(new PrintStream(new File("A-small-attempt0.out")));
		int t = in.nextInt();
		int cases = 0;
		while(t-->0){
			cases++;
			int fq = in.nextInt()-1;
			int gridA[][] = new int[4][4];
			for(int i = 0; i<gridA.length;i++){
				for(int j = 0; j< gridA[i].length;j++)
					gridA[i][j] = in.nextInt();
			}
			int sq = in.nextInt()-1;
			int gridB[][] = new int [4][4];
			for(int i = 0; i<gridB.length;i++)
				for(int j = 0; j<gridB[i].length;j++)
					gridB[i][j] = in.nextInt();
			int cnt = 0;
			int res = 0;
			for(int i = 0;i<gridA[fq].length;i++){
				for(int j = 0;j<gridB[sq].length;j++){
					if(gridA[fq][i]==gridB[sq][j]){
						cnt++;
						res =gridA[fq][i];
					}
				}
			}
			if(cnt==1){
				System.out.println("Case #"+cases+": "+res);
			}
			else if(cnt>1){
				System.out.println("Case #"+cases+": Bad magician!");
			}
			else{
				System.out.println("Case #"+cases+": Volunteer cheated!");
			}
		}
		in.close();
	}

}
