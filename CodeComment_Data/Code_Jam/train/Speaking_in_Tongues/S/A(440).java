package methodEmbedding.Speaking_in_Tongues.S.LYD450;

import java.io.*;

public class A {
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(args[0])));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(args[1])));
		int T = Integer.parseInt(reader.readLine());

		char[] enc = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i',
				'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f',
				'm', 'a', 'q' };
		for (int j = 0; j < T; j++) {
			String hasil = "";
			String G = reader.readLine();
			for (int i = 0; i < G.length(); i++) {
				if (G.charAt(i) != ' ') {
					hasil += enc[(int) G.charAt(i) - 'a'];
				} else {
					hasil += " ";
				}
			}
			writer.write("Case #" + (j + 1) + ": " +hasil);
			writer.newLine();
		}
		writer.flush();
		writer.close();
	}
}
