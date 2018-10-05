package methodEmbedding.Magic_Trick.S.LYD1409;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MagicTrick {

	static {
		try {
			String input = "A-small-attempt0.in";
			String output = input.substring(0, input.lastIndexOf('.')) + ".out";
			System.setIn(new FileInputStream(input));
			System.setOut(new PrintStream(new FileOutputStream(output), true));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v[] = new int[4], m, n, op;
		for (int T = input.nextInt(), t = 1; t <= T; t++) {
			op = -1;
			m = input.nextInt();
			for (int r = 1; r <= 4; r++)
				for (int c = 0; c < 4; c++) {
					n = input.nextInt();
					if (r == m)
						v[c] = n;
				}
			m = input.nextInt();
			for (int r = 1; r <= 4; r++) {
				for (int c = 0; c < 4; c++) {
					n = input.nextInt();
					if (r != m)
						continue;
					for (int i = 0; i < 4; i++) {
						if (n == v[i]) {
							if (op == -1)
								op = n;
							else if (op != -1)
								op = Integer.MAX_VALUE;
						}
					}
				}
			}
			if (op != -1) {
				if (op != Integer.MAX_VALUE) {
					System.out.printf("Case #%d: %d\n", t, op);
				} else {
					System.out.printf("Case #%d: Bad magician!\n", t);
				}
			} else {
				System.out.printf("Case #%d: Volunteer cheated!\n", t);
			}
		}
		input.close();
	}

}
