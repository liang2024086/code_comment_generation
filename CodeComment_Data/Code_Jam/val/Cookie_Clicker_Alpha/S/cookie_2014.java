package methodEmbedding.Cookie_Clicker_Alpha.S.LYD444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class cookie_2014 {
	public static void main(String args[]) {
		try {
			File file = new File("output.out");
			if (!file.exists()) {
				file.createNewFile();
			}
			String content = "";
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			FileInputStream fstream = new FileInputStream("B-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			int N, R = 0;

			N = Integer.parseInt(br.readLine());

			for (int i = 1; i <= N; i++) {

				String st1[] = new String[3];
				st1 = br.readLine().split(" ");
				double c = 0, x = 0, f = 0;
				// for (int j = 0; j < 2; j++) {
				c = Double.parseDouble(st1[0]);
				f = Double.parseDouble(st1[1]);
				x = Double.parseDouble(st1[2]);
				// }
				double total = 0;
				double total_min = x;
				for (int j = 0;; j++) {
					total = 0;
					if (j == 0) {
						total = x / 2;
					} else {
						for (int k = 1; k <= j; k++) {
							total = total + (c / (2 + f * (k - 1)));
						}
						total = total + x / (2 + f * (j));
					}
					if (total < total_min) {
						total_min = total;
					} else {
						break;
					}
				}
				content = "Case #" + i + ": " + total_min + "\n";
				bw.write(content);
				System.out.print(content);

			}

			// }
			in.close();
			bw.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
