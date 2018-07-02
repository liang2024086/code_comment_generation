package methodEmbedding.Magic_Trick.S.LYD688;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		for (int i = 0; i < T; ++i) {
			
			Set<Integer> one = new HashSet<Integer>();
			Set<Integer> two = new HashSet<Integer>();
			
			{
				Set<Integer> row1 = new HashSet<Integer>();
				Set<Integer> row2 = new HashSet<Integer>();
				Set<Integer> row3 = new HashSet<Integer>();
				Set<Integer> row4 = new HashSet<Integer>();
				Set<Integer>[] rows = new Set[]{row1, row2, row3, row4};
				
				int row = scanner.nextInt();
				for (int j = 0; j < 4; ++j) {
					for (int k = 0; k < 4; ++k) {
						int num = scanner.nextInt();
						rows[j].add(num);
					}
				}
				
				one = rows[row - 1];
			}
			
			{
				Set<Integer> row1 = new HashSet<Integer>();
				Set<Integer> row2 = new HashSet<Integer>();
				Set<Integer> row3 = new HashSet<Integer>();
				Set<Integer> row4 = new HashSet<Integer>();
				Set<Integer>[] rows = new Set[]{row1, row2, row3, row4};
				
				int row = scanner.nextInt();
				for (int j = 0; j < 4; ++j) {
					for (int k = 0; k < 4; ++k) {
						int num = scanner.nextInt();
						rows[j].add(num);
					}
				}
				
				two = rows[row - 1];
			}

			System.out.print("Case #" + (i + 1) + ": ");
			one.retainAll(two);
			if (one.isEmpty()) {
				System.out.println("Volunteer cheated!");
			}
			else if (one.size() == 1) {
				System.out.println(one.toArray()[0]);
			}
			else {
				System.out.println("Bad magician!");
			}
			
		}
	}
}
