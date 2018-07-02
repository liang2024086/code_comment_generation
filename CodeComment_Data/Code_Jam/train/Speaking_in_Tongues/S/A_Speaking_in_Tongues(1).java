package methodEmbedding.Speaking_in_Tongues.S.LYD675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Speaking_in_Tongues {

	private static char[] mapping = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x',
			'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j',
			'p', 'f', 'm', 'a', 'q' };

	public static void main(String[] args) {

		try {
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(System.in));

			String strNumLines = inputStream.readLine();
			int numLines = Integer.parseInt(strNumLines);

			for (int i = 0; i < numLines; i++) {
				String line = inputStream.readLine();

				String[] words = line.split(" ");
				String newLine = "";
				for (int j = 0; j < words.length; j++) {
					for (int k = 0; k < words[j].length(); k++) {
						newLine += mapping[words[j].charAt(k) - 'a'];
					}
					newLine += ' ';
				}

				System.out.println("Case #" + (i + 1) + ": " + newLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
