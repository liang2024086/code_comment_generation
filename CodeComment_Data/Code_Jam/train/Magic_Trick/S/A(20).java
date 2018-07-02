package methodEmbedding.Magic_Trick.S.LYD295;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author: Ahmed Medhat Othman
 * @codeJame: AMedOs
 * @email :amedhat.cs@gmail.com
 * */
public class A {

	public static void main(String[] args) throws Exception  {
		
		int T;
		int tc = 0;
		
		// Input file
		String in = "A-small-attempt0.in";
		FileInputStream fin = new FileInputStream(in);
		Scanner scn = new Scanner(fin);
		
		// Output file
		String out = "A.out";
		FileOutputStream fout = new FileOutputStream (out);
		PrintStream ps = new PrintStream(fout);
		
		 
		T = scn.nextInt();
		
		String bad = "Bad magician!";
		String cheat= "Volunteer cheated!";
		
		int [][] rows1 = new int[4][4];
		int [][] rows2 = new int[4][4];
		int q1;
		int q2;
		
		for (tc=1 ; tc <= T ; tc++) {
			q1 = scn.nextInt();
			for (int i=0; i < 4; i++) {
				for (int j=0; j < 4; j++) {
					rows1[i][j] = scn.nextInt();
				}
			}
			q2 = scn.nextInt();
			for (int i=0; i < 4; i++) {
				for (int j=0; j < 4; j++) {
					rows2[i][j] = scn.nextInt();
				}
			}
			
			int f = 0;
			int res = -1;
			for (int i =0 ; i < 4; i++) {
				boolean fg = false;
				for (int j =0 ; j < 4; j++) {
					if (rows1[q1-1][i] == rows2[q2-1][j]) {
						res = rows1[q1-1][i];
						fg = true;
						break;
					}
				}
				if (fg) {
					f +=1;
				}
			}
			if (f == 1) {
				ps.println("Case #" + tc + ": " + res);
			} else if(f > 1) {
				ps.println("Case #" + tc + ": " + bad);
			} else if (f < 1) {
				ps.println("Case #" + tc + ": " + cheat);
			} else {
				System.out.println("errorrrrrrrrrrrrrrrrrrrrrs");
			}
			System.out.println("-----=-=-=-=-=-=--=");
		}
		
		fout.close();
		scn.close();
		fin.close();
		System.out.println("Done:.......");
		System.exit(0);
	}
}
