package methodEmbedding.Standing_Ovation.S.LYD314;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {

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
		try (Scanner input = new Scanner(System.in)) {
			int T = input.nextInt();
			for (int t = 1; t <= T; t++) {
				int max = input.nextInt();
				char audbuf[] = input.next().toCharArray();
				assert audbuf.length == max + 1;
				int fri = 0;
				int up = 0;
				for (int shy = 0; shy < audbuf.length; shy++) {
					int num = audbuf[shy] - '0';
					if (up < shy) {
						int inv = shy - up;
						fri += inv;
						up += inv;
					}
					up += num;
				}
				System.out.printf("Case #%d: %d", t, fri);
				System.out.println();
			}
		}
	}

}
