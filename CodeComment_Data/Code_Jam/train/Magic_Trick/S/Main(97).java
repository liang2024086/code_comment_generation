package methodEmbedding.Magic_Trick.S.LYD1628;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("A-small-attempt1.in"));
		PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
		int n = sc.nextInt();
		for (int test = 0; test<n ;test++) {
			Integer[] row1 = new Integer[4];
			Integer[] row2 = new Integer[4];
			Set<Integer> sames = new HashSet<Integer>();
			int linenumber1 = sc.nextInt();
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if(i+1==linenumber1) {
						row1[j] = sc.nextInt();
					}
					else {
						sc.nextInt();
					}
				}
			}
			
			int linenumber2 = sc.nextInt();
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if(i+1==linenumber2) {
						row2[j] = sc.nextInt();
					}
					else {
						sc.nextInt();
					}
				}
			}
			
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if (row1[i] == row2[j]) {
						sames.add(row1[i]);
					}
				}
			}
			
			
			if (sames.size() == 0) {
				pw.println("Case #"+(test+1)+": Volunteer cheated!");
			} else if (sames.size() >= 2) {
				pw.println("Case #"+(test+1)+": Bad magician!");
			} else {
				Integer result = null;
				for (Integer i: sames) {
					result = i;
					break;
				}
				pw.println("Case #"+(test+1)+": "+ result);
			}
		}
		
		pw.close();
		sc.close();
 	}

}
