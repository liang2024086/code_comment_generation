package methodEmbedding.Magic_Trick.S.LYD1703;

import java.util.*;

class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 1; i <= t; i++) {
			int r = in.nextInt();
			int[] list = new int[4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					int l = in.nextInt();
					if (j == r) {
						list[k] = l;
					}
				}
			}

			int rr = in.nextInt();
			int count = 0;
			int num = -1;
			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < 4; n++) {
					int e = in.nextInt();
					if (m == rr) {
						for (int q : list) {
							if (q == e) {
								num = q;
								count++;
							}
						}
					}
				}
			}

			if (count == 1) {
				System.out.printf("Case #%d: %d\n", i, num);
			} else if (count == 0) {
				System.out.printf("Case #%d: Volunteer cheated!\n", i);
			} else {
				System.out.printf("Case #%d: Bad magician!\n", i);
			}
		}
	}
}
