package methodEmbedding.Magic_Trick.S.LYD1504;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "magictricksmall";
		Scanner in = new Scanner(new File(filename + ".in"));
		PrintWriter pw = new PrintWriter(new File(filename + ".out"));
		
		int t = in.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int fans = in.nextInt()-1;
			int [][] farr = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					farr[j][k] = in.nextInt();
				}
			}
			int sans = in.nextInt()-1;
			int [][] sarr = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					sarr[j][k] = in.nextInt();
				}
			}
			
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				set.add(farr[fans][j]);
			}
			int matches = 0;
			int res = -1;
			for (int j = 0; j < 4; j++) {
				if(set.contains(sarr[sans][j])){
					matches++;
					res = sarr[sans][j];
				}
			}
			
			pw.print("Case #"+i+": ");
			if(matches == 0){
				pw.println("Volunteer cheated!");
			}
			else if(matches == 1){
				pw.println(res);
			}
			else{
				pw.println("Bad magician!");
			}
		}
		
		
		
		
		
		pw.close();
	}

}
