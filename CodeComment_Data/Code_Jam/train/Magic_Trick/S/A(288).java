package methodEmbedding.Magic_Trick.S.LYD176;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		int ocurr[] = new int[16];
		int ans;
		boolean err;

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for (int t = 1; t <= T; t++) {
			for (int i = 0; i < 16; i++)
				ocurr[i] = 0;
			for (int i = 0; i < 2; i++) {
				ans = input.nextInt();
				for (int line = 0; line < 4; line++) {
					for (int col = 0; col < 4; col++) {
						if (line + 1 == ans) {
							ocurr[input.nextInt() - 1]++;
						} else {
							input.nextInt();
						}
					}
				}
			}
			ans = 0;
			err = false;
			for (int i = 0; i < 16; i++) {
				if (ocurr[i] > 1) {
					if (ans > 0)
						err = true;
					ans = i + 1;
				}
			}
			if (err) {
				System.out.format("Case #%d: Bad magician!\n", t);
			} else if (ans == 0) {
				System.out.format("Case #%d: Volunteer cheated!\n", t);
			} else {
				System.out.format("Case #%d: %d\n", t, ans);
			}
		}
		input.close();
	}
}
