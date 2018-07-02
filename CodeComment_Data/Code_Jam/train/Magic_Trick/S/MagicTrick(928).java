package methodEmbedding.Magic_Trick.S.LYD2071;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[][] base = new int[4][4];
		Set<Integer> first = new HashSet<Integer>();
		Set<Integer> second = new HashSet<Integer>();
		for (int i = 0; i < T; i++) {
			first.clear();
			second.clear();
			int row = scan.nextInt();
			for (int j = 0; j < base.length; j++) {
				for (int j2 = 0; j2 < base[j].length; j2++) {
					base[j][j2] = scan.nextInt();
				}
			}
			for (int j = 0; j < base[row - 1].length; j++) {
				first.add(base[row - 1][j]);
			}
			row = scan.nextInt();
			for (int j = 0; j < base.length; j++) {
				for (int j2 = 0; j2 < base[j].length; j2++) {
					base[j][j2] = scan.nextInt();
				}
			}
			int ret= 0;
			for (int j = 0; j < base[row - 1].length; j++) {
				if (first.contains(base[row - 1][j])) {
					ret = base[row - 1][j];
					second.add(base[row - 1][j]);
				}
			}
			System.out.print("Case #" + (i+1) + ": ");
			if (second.size() > 1) {
				System.out.println("Bad magician!");
			} else if (second.size() < 1) {
				System.out.println("Volunteer cheated!");
			} else {
				System.out.println(ret);
			}
			
		}
		
		scan.close();

	}

}
