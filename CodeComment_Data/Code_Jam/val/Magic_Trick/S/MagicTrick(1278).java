package methodEmbedding.Magic_Trick.S.LYD649;

import java.io.File;
import java.util.Scanner;
public class MagicTrick {
	public static void main(String[] args) throws Exception {
		if(args.length < 1) {
			System.out.println("Usage : java MagicTrick <inputfile>");
			return;
		}
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);
		int count = sc.nextInt();
		for(int n=1;n<=count;n++) {
			int ret=0,tc=0;
			int[][] fA = new int[4][4];
			int[][] sA = new int[4][4];
			int fR = sc.nextInt()-1;
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					fA[i][j] = sc.nextInt();
				}
			}
			int sR = sc.nextInt()-1;
			for(int i=0;i<4;i++) {  
                                for(int j=0;j<4;j++) {
                                        sA[i][j] = sc.nextInt();
                                }
                        }
			for(int i=0;i<4;i++) {
				int fI = fA[fR][i];
				for(int j=0;j<4;j++) {
					if(sA[sR][j] == fI) {
						tc++;
						ret = fI;
					}
				}
			}
			System.out.print("Case #"+n+": ");
			if(tc == 0) System.out.println("Volunteer cheated!");
                	else if(tc == 1) System.out.println(ret);
			else System.out.println("Bad magician!");
		}
	}
}
