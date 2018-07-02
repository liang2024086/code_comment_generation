package methodEmbedding.Magic_Trick.S.LYD2120;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class Jam1 {

	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileWriter fstream = new FileWriter("out.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		
		int T = scan.nextInt();
		int[] fBoard = new int[4];
		int[] sBoard = new int[4];
		long max = 0;
		long min = Long.MAX_VALUE;
		for (int k = 0; k < T; k++) {
			int f = scan.nextInt();
			for (int i = 0; i < 4; i++) {
				if(i == f-1) {
					for (int j = 0; j < 4; j++) {
						fBoard[j] = scan.nextInt();
					}
				}
				else {
					for (int j = 0; j < 4; j++) {
						scan.nextInt();
					}
				}
			}
			int s = scan.nextInt();
			for (int i = 0; i < 4; i++) {
				if(i == s-1) {
					for (int j = 0; j < 4; j++) {
						sBoard[j] = scan.nextInt();
					}
				}
				else {
					for (int j = 0; j < 4; j++) {
						scan.nextInt();
					}
				}
			}
			int number = 0;
			int count = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if(fBoard[i] == sBoard[j]) {
						number = fBoard[i];
						count ++;
					}
				}
			}
			out.write("Case #" + (k+1) + ": ");
			if(count == 0) {
				out.write("Volunteer cheated!");
			}
			else if (count == 1) {
				out.write("" + number + "");
			}
			else {
				out.write("Bad magician!");
			}
			out.newLine();
		}
		out.close();

	}

}
