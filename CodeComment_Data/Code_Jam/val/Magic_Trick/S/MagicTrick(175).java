package methodEmbedding.Magic_Trick.S.LYD1080;

import java.util.*;
import java.io.*;
public class MagicTrick {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("src\\A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("src\\A-smaall.out"));
		int T = scan.nextInt();
		for(int c=0; c<T;c++) {
			int[][] arrange1 = new int[4][4];
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					arrange1[i][j] = 0;
			int ans1 = scan.nextInt();
			for(int i=0; i<4;i++) {
				for(int j=0; j<4; j++) {
					arrange1[i][j] = scan.nextInt();
				}
			}
			int ans2= scan.nextInt();
			int[][] arrange2 = new int[4][4];
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					arrange2[i][j] = 0;
			for(int i=0; i<4;i++) {
				for(int j=0; j<4; j++) {
					arrange2[i][j] = scan.nextInt();
				}
			}
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for(int k=0;k<4;k++) {
				for(int m=0;m<4;m++) {
					if(arrange1[ans1-1][k]==arrange2[ans2-1][m])
						ans.add(arrange2[ans2-1][m]);
				}
			}
			if(ans.size()==1)
				pw.println("Case #" + (c+1) +": "+ans.get(0));
			else if(ans.size()==0)
				pw.println("Case #" + (c+1) +": "+"Volunteer cheated!");
			else
				pw.println("Case #" + (c+1) +": "+"Bad magician!");
			ans.clear();
		}
		pw.close();
		scan.close();
	}
}
