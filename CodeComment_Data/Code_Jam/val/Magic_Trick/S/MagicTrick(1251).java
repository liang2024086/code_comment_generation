package methodEmbedding.Magic_Trick.S.LYD1176;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int answer1 = sc.nextInt() - 1;
			int[][] matrix1 = new int[4][4];
			for (int j = 0; j < matrix1.length; j++) {
				for (int j2 = 0; j2 < matrix1.length; j2++) {
					matrix1[j][j2] = sc.nextInt();
				}
			}

			List<Integer> list1 = new ArrayList<Integer>();

			for (int j = 0; j < matrix1.length; j++) {
				list1.add(matrix1[answer1][j]);
			}

			Set<Integer> set1 = new HashSet<Integer>(list1);

			int answer2 = sc.nextInt() - 1;
			int[][] matrix2 = new int[4][4];
			for (int j = 0; j < matrix2.length; j++) {
				for (int j2 = 0; j2 < matrix2.length; j2++) {
					matrix2[j][j2] = sc.nextInt();
				}
			}

			List<Integer> list2 = new ArrayList<Integer>();

			for (int j = 0; j < matrix2.length; j++) {
				list2.add(matrix2[answer2][j]);
			}

			Set<Integer> set2 = new HashSet<Integer>(list2);

			// System.out.println(set1);
			// System.out.println(set2);

			set1.retainAll(set2);

			String ans = "";

			if (set1.isEmpty()) {
				ans = "Volunteer cheated!";
			} else if (set1.size() > 1) {
				ans = "Bad magician!";
			} else {
				ans = set1.iterator().next().toString();
			}

			System.out.println("Case #" + (i + 1) + ": " + ans);

		}

	}


}
