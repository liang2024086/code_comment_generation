package methodEmbedding.Cookie_Clicker_Alpha.S.LYD792;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {

		try {

			FileInputStream fstream = new FileInputStream("Input.txt");

			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			FileOutputStream foutstream = new FileOutputStream("Output.txt");
			PrintStream out = new PrintStream(foutstream);

			int cases = Integer.parseInt(br.readLine());

			for (int i = 0; i < cases; i++) {

				String[] parts = br.readLine().split(" ");
				double c = Float.parseFloat(parts[0]);
				double f = Float.parseFloat(parts[1]);
				double x = Float.parseFloat(parts[2]);
				double totalTime = 0;
				double cookies = 0;
				double currentRate = 2;

				while (cookies != x) {
					double timeWithCurrentRate = x / currentRate;
					double timeWithFarm = (c / currentRate)
							+ (x / (currentRate + f));

					if (timeWithFarm < timeWithCurrentRate) {
						totalTime += c / currentRate;
						currentRate += f;
					} else {
						totalTime += x / currentRate;
						cookies = x;
					}
				}
				String.format("%.7f", totalTime);
				out.println("Case #" + (i + 1) + ": " + new DecimalFormat("0.0000000").format(totalTime));

			}

			in.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}

}
