package methodEmbedding.Speaking_in_Tongues.S.LYD335;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tongues {

	private static BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(System.in));

	private static final char[] charmap = new char[] { 'y', 'h', 'e', 's', 'o',
			'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't',
			'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };

	public static void main(String[] args) throws IOException {
		String line = bufferedReader.readLine();
		int cases = Integer.parseInt(line);

		for (int i = 1; i <= cases; i++) {
			line = bufferedReader.readLine();
			char[] chars = line.toCharArray();

			StringBuffer stringBuffer = new StringBuffer();

			for (int j = 0; j < chars.length; j++) {
				if (chars[j] == ' ') {
					stringBuffer.append(" ");
				} else {
					stringBuffer.append(charmap[chars[j] - 'a']);
				}
			}

			System.out.println("Case #" + i + ": " + stringBuffer);
		}
	}
}
