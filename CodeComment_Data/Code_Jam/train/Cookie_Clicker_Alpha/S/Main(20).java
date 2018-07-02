package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1327;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static BufferedReader br;
	private static BufferedWriter bw;

	public static void main(String args[]) throws IOException {
		br = new BufferedReader(new FileReader("C:\\B-small-attempt0.in"));
		File file = new File("D:\\B-small-attempt0-output.in");
		if (!file.exists())
			file.createNewFile();
		bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
		int n = Integer.parseInt(br.readLine());

		int cases = 1;
		while (n-- > 0) {
			double cookiepersecond = 2;
			double seconds = 0;
			String str[] = br.readLine().split(" ");
			double c = Double.parseDouble(str[0]);
			double f = Double.parseDouble(str[1]);
			double x = Double.parseDouble(str[2]);

			double tempsec = 10000000;
			if ((c / cookiepersecond) > (x / cookiepersecond)) {
				seconds = x / cookiepersecond;
				bw.write("Case #" + cases + ": " + seconds + "\n");
				cases++;
				continue;
			}
			while (true) {
				double tempvar = seconds + x / cookiepersecond;
				if (tempsec > tempvar)
					tempsec = tempvar;
				else
					break;
				seconds += c / cookiepersecond;
				cookiepersecond += f;
			}
			bw.write("Case #" + cases + ": " + tempsec + "\n");
			cases++;
		}
		br.close();
		bw.close();
	}
}
