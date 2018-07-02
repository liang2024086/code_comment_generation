package methodEmbedding.Standing_Ovation.S.LYD258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		String line = in.readLine();

		final int T = Integer.parseInt(line);

		for (int t = 1; t <= T; t++) {
			line = in.readLine();
			String[] ins = line.split(" ");
			int sm = Integer.parseInt(ins[0]);
			String si = ins[1];
			int cnt = 0;
			int friends = 0;
			for (int i = 0; i <= sm; i++) {
				int pi = Integer.parseInt("" + si.charAt(i));
				if (pi == 0) {
					continue;
				}
				if (cnt >= i) {
					cnt += pi;
				} else {
					friends += i - cnt;
					cnt += friends + pi;
				}
			}

			System.out.println("Case #" + t + ": " + friends);
		}
	}

}
