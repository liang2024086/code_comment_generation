package methodEmbedding.Magic_Trick.S.LYD2166;

import java.util.HashSet;
import java.util.Scanner;

public class magicTrick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			int[][] fArr = new int[4][4];
			
			int fguess = in.nextInt();
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					fArr[j][k] = in.nextInt();
					//System.out.print(fArr[j][k]);
				}
				//System.out.println();
			}
			
			int sguess = in.nextInt();
			//System.out.println("fguess = " + fguess);
			//System.out.println("sguess = " + sguess);
			int[][] sArr = new int[4][4];
			
			HashSet<Integer> hs = new HashSet<Integer>();
			for(int a = 0; a < 4; a++) {
				//System.out.print(fArr[fguess - 1][a] + " ");
				hs.add(fArr[fguess - 1][a]);
			}
			
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					sArr[j][k] = in.nextInt();
					//System.out.print(sArr[j][k]);
				}
				//System.out.println();
			}
			
			boolean oneFound = false;
			boolean twoFound = false;
			int num = -1;
			
			for(int a = 0; a < 4; a++) {
			//	System.out.print(sArr[sguess - 1][a] + " ");
				if(hs.contains(sArr[sguess - 1][a]) && !oneFound) {
					oneFound = true;
					num = a;
				}
				else if(hs.contains(sArr[sguess - 1][a]) && oneFound) {
					twoFound = true;
				}
			}
			
			if(oneFound && !twoFound) {
				System.out.println("Case #" + (i + 1) + ": " + sArr[sguess - 1][num]);
			}
			else if(twoFound && oneFound) {
				System.out.println("Case #" + (i + 1) + ": Bad magician!");
			}
			else {
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			}
					
		}
		
		
	}

}
