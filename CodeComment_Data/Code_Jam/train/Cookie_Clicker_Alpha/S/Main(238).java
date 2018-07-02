package methodEmbedding.Cookie_Clicker_Alpha.S.LYD703;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\prateek\\Desktop\\B-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\prateek\\Desktop\\file.out"));
		int testCase;
		final double rate = 2;
		try {
			testCase = Integer.parseInt(br.readLine());
			double C, F, X;
			for (int i = 0; i < testCase; i++) {
				String params[] = br.readLine().split("\\s");
				C = Double.parseDouble(params[0]);
				F = Double.parseDouble(params[1]);
				X = Double.parseDouble(params[2]);

				double localRate = rate;
				double currentTime = 0, lastTime = (X / 2.0), penalty = 0;
				while (true) {
					double farmTime = (C / localRate);
					localRate += F;
					currentTime = penalty + farmTime + (X / localRate);
					if (currentTime < lastTime) {
						lastTime = currentTime;
						penalty += farmTime;
					} else {
						break;
					}
				}
				DecimalFormat df = new DecimalFormat("#.0000000");
				bw.write("Case #" + (i + 1) + ": " + df.format(lastTime) + "\n");
			}

		} finally {
			br.close();
			bw.flush();
			bw.close();
		}

	}
}
