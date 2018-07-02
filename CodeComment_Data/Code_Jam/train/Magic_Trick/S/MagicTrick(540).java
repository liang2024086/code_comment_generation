package methodEmbedding.Magic_Trick.S.LYD841;

import java.util.Scanner;
import java.util.HashSet;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int ans1;
		int ans2;
		int[][] arr1 = new int[4][4];
		int[][] arr2 = new int[4][4];
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < t; i++) {
			ans1 = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					arr1[j][k] = sc.nextInt();
				}
			}

			ans2 = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					arr2[j][k] = sc.nextInt();
				}
			}

			for (int k = 0; k < 4; k++) {
				set.add(arr1[ans1 - 1][k]);
			}
			int count = 0;
			int answer = 0;
			for (int k = 0; k < 4; k++) {
				if (set.contains(arr2[ans2 - 1][k])) {
					count++;
					answer = arr2[ans2 - 1][k];
				}
			}
			System.out.printf("Case #%d: ", i + 1);
			if (count > 1) {
				System.out.println("Bad magician!");
			} else if (count == 0) {
				System.out.println("Volunteer cheated!");
			} else {
				System.out.println(answer);
			}
			set.clear();
		}
	}
}
