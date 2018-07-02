package methodEmbedding.Magic_Trick.S.LYD864;

import java.util.*;

public class A {
	public static void main(String[] args) {
		new A();
	}

	public A() {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for (int n = 0; n < cases; n++) {
			int a = input.nextInt() - 1;
			int[][] grid1 = new int[4][4];
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					grid1[y][x] = input.nextInt();
				}
			}
			int b = input.nextInt() - 1;
			int[][] grid2 = new int[4][4];
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					grid2[y][x] = input.nextInt();
				}
			}
			Set<Integer> set1 = new TreeSet<Integer>();
			for (int x = 0; x < 4; x++) {
				set1.add(grid1[a][x]);
			}
			Set<Integer> set2 = new TreeSet<Integer>();
			for (int x = 0; x < 4; x++) {
				if (set1.contains(grid2[b][x])) {
					set2.add(grid2[b][x]);
				}
			}
			if (set2.size() == 0) {
				System.out.println("Case #" + (n+1) + ": Volunteer cheated!");
			} else if (set2.size() == 1) {
				Iterator<Integer> iter = set2.iterator();
				System.out.println("Case #" + (n+1) + ": " + iter.next());
			} else {
				System.out.println("Case #" + (n+1) + ": Bad magician!");
			}
		}
	}
}
