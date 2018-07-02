package methodEmbedding.Magic_Trick.S.LYD1959;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.BitSet;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new FileReader("in"));
		int nt = reader.nextInt();
		for(int t = 1; t <= nt; t++) {
			System.out.print("Case #" + t + ": ");
			int row1 = reader.nextInt() - 1;
			int[][] c1 = new int[4][4];
			for(int i= 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					c1[i][j] = reader.nextInt();
				}
			}
			int row2 = reader.nextInt() - 1;
			int[][] c2 = new int[4][4];
			for(int i= 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					c2[i][j] = reader.nextInt();
				}
			}
			BitSet b1 = new BitSet();
			for(int j = 0; j < 4; j++) {
				b1.set(c1[row1][j]);
			}
			BitSet b2 = new BitSet();
			for(int j = 0; j < 4; j++) {
				b2.set(c2[row2][j]);
			}
			b1.and(b2);
			if(b1.cardinality() == 1) {
				String s = b1.toString();
				System.out.println(s.substring(1, s.length() - 1));
			} else if(b1.cardinality() == 0) {
				System.out.println("Volunteer cheated!");
			} else {
				System.out.println("Bad magician!");
			}
		}
		
	}
	
}
