package methodEmbedding.Magic_Trick.S.LYD1776;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("a.txt"));
			PrintStream out = new PrintStream("out.txt");
			int n = in.nextInt();
			for (int i=0; i<n; i++) {
				int row1 = in.nextInt()-1;
				Set<Integer> set1 = new HashSet<Integer>();
				Set<Integer> set2 = new HashSet<Integer>();
				for (int j=0; j<16; j++) {
					int num = in.nextInt();
					if (j>=4*row1 && j<4*(row1+1)) {
						set1.add(num);
					}
				}
				//System.out.println("Set1" + set1);
				int row2 = in.nextInt()-1;
				for (int j=0; j<16; j++) {
					int num = in.nextInt();
					if (j>=4*row2 && j<4*(row2+1)) {
						set2.add(num);
					}
				}
				//System.out.println("Set2" + set2);
				int count = 0;
				int guess = 0;
				for (int number: set1) {
					if (set2.contains(number)) {
						count++;
						guess = number;
					}
				}
				out.print(String.format("Case #%s: ", i+1));
				if (count==1) out.println(guess);
				else if (count==0) out.println("Volunteer Cheated!");
				else out.println("Bad Magician!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
