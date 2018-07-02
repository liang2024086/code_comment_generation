package methodEmbedding.Standing_Ovation.S.LYD479;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String... args) throws IOException {
		String name1 = "A-small-attempt0.in";
		String name2 = "A-small-attempt0.out";

		try (BufferedReader in = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream(name1)));
		     BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(name2))))) {
			for (int i = 0, total = Integer.parseInt(in.readLine()); i < total; i++) {
				String[] parts = in.readLine().split(" ");
				int max = Integer.parseInt(parts[0]);
				int sum = 0;
				int res = 0;
				char[] chs = parts[1].toCharArray();

				for (int j = 0; j <= max; j++) {
					int val = Integer.parseInt(Character.toString(chs[j]));

					if (j != 0 && val != 0) {
						int friends = Math.max(0, j - sum);
						res += friends;
						sum += friends;
					}

					sum += val;
				}

				if (i != 0)
					out.newLine();
				out.append(String.format("Case #%d: %d", i + 1, res));
				System.out.println(String.format("Case #%d: %d", i + 1, res));
			}
		}
	}
}
