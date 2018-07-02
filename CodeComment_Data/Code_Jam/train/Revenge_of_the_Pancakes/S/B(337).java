package methodEmbedding.Revenge_of_the_Pancakes.S.LYD284;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class B {
	public static void main(String[] args) {
		Path pathIn = Paths.get("src/resources/B.in");
		Path pathOut = Paths.get("src/resources/B.out");
		try (Stream<String> lines = Files.lines(pathIn); BufferedWriter writer = Files.newBufferedWriter(pathOut)) {
			Iterator<String> iterator = lines.iterator();

			int T = Integer.parseInt(iterator.next());
			int flips;
			boolean change;
			char[] pattern;
			char c;

			for (int t = 1; t <= T; t++) {
				flips = 0;
				change = false;
				pattern = iterator.next().toCharArray();

				for (int pos = pattern.length - 1; pos >= 0; pos--) {
					c = pattern[pos];

					if ((c == '-' && !change) || (c == '+' && change)) {
						change = !change;
						flips++;
					}
				}

				writer.write("Case #" + t + ": " + flips);
				writer.newLine();
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
