package methodEmbedding.Magic_Trick.S.LYD1314;

import java.util.*;
import java.io.*;
import java.lang.*;


public class MagicTrick {
	
	public static void main(String args[]) throws FileNotFoundException {
		int T;
		int count = 1;
		File f = new File("Output.txt");
		PrintWriter pw = new PrintWriter(f);
		Scanner in = new Scanner(System.in);	
		T = in.nextInt();
		if(T > 0 && T < 101) {
		while(T > 0) {
			int ans1, ans2, ans3, chk;
			boolean c;
			chk = 0;
			ans3 = 0;
			Integer[][] i1 = new Integer[4][4];
			Integer[][] i2 = new Integer[4][4];
			ans1 = in.nextInt();
			ans1--;
			for(int i = 0; i < 4; i++) {
				for(int k = 0; k < 4; k++) {
					i1[i][k] = in.nextInt();
				}
			}
			ans2 = in.nextInt();
			ans2--;
			for(int i = 0; i<4; i++) {
				for (int k = 0; k<4; k++) {
					i2[i][k] = in.nextInt();
				}
			}
			for(int i = 0; i<4; i++) {
				for (int k = 0; k<4; k++) {
					if(i1[ans1][i].equals(i2[ans2][k])) {
						ans3 = i1[ans1][i];
						chk++;
					}
				}
			}
			if(chk == 1){
				pw.println("Case #" + count + ": " + ans3 + "\n");
			}
			if(chk > 1) {
				pw.print("Case #" + count + ": " + "Bad magician!" + "\n");
			}
			if(chk == 0) {
				pw.print("Case #" + count + ": " + "Volunteer Cheated!" + "\n");
			}
			count++;
			T--;
		}
	}
	pw.flush();
	pw.close();
	}
}
