package methodEmbedding.Magic_Trick.S.LYD1090;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int t = 1; t <= T; t++) {
			boolean[] can = new boolean[16];
			
			for (int k = 0; k < 16; k++) {
				can[k] = true;
			}
			
			int r = in.nextInt();
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					int k = in.nextInt();
					if (y + 1 != r) {
						can[k-1] = false;
					}
				}
			}
			
			r = in.nextInt();
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					int k = in.nextInt();
					if (y + 1 != r) {
						can[k-1] = false;
					}
				}
			}
			
			int c = 0;
			int k = -1;
			
			for (int p = 0; p < 16; p++) {
				if (can[p]) {
					k = p + 1;
					c++;
				}
			}
			
			String res;
			
			if (c == 1) {
				res = String.valueOf(k);
			} else if (c > 1) {
				res = "Bad magician!";
			} else {
				res = "Volunteer cheated!";
			}
			
			System.out.printf("Case #%d: %s\n", t, res);
		}
	}
}
