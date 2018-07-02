package methodEmbedding.Speaking_in_Tongues.S.LYD1156;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KingXNewCurrency {

	public static void main(String[] args) throws IOException {
		char[] a = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
		BufferedReader br = new BufferedReader(new FileReader("input"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output"));
		String in = br.readLine();
		int n = Integer.parseInt(in);
		for (int j = 1; j <= n; j++) {
			in = br.readLine();
			StringBuilder res = new StringBuilder();
			for (int i = 0; i < in.length(); i++) {
				if (in.charAt(i) == ' ')
					res.append(' ');
				else
					res.append(a[in.charAt(i) - 'a']);
			}
			bw.write("Case #" + j + ": " + res);
			bw.newLine();
		}
		bw.close();
	}
}
