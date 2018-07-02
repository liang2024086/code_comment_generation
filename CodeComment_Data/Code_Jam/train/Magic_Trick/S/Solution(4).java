package methodEmbedding.Magic_Trick.S.LYD1316;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public Solution() {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		for (int i = 0; i < T; i++) {
			int firstAnswer[] = new int[4];
			int secondAnswer[] = new int[4];

			for (int j = 0; j < 2; j++) {
				int rowSelected = in.nextInt();
				int nums[][] = new int[4][4];
				for (int k = 0; k < 4; k++) {
					for (int k2 = 0; k2 < 4; k2++) {
						nums[k][k2] = in.nextInt();
					}
					if (k + 1 == rowSelected)
						if (j == 0)
							firstAnswer = nums[k];
						else
							secondAnswer = nums[k];
				}
			}

			List<Integer> l1 = new ArrayList<Integer>();
			List<Integer> l2 = new ArrayList<Integer>();
			for (int j = 0; j < 4; j++) {
				l1.add(firstAnswer[j]);
				l2.add(secondAnswer[j]);
			}

			// System.out.println(l1);
			// System.out.println(l2);

			l1.retainAll(l2);
			if (l1.size() == 0) {
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			} else if (l1.size() == 1) {
				System.out.println("Case #" + (i + 1) + ": " + l1.get(0));
			} else {
				System.out.println("Case #" + (i + 1) + ": Bad magician!");
			}
		}

		in.close();
	}

	public static void main(String[] args) {
		new Solution();
	}
}
