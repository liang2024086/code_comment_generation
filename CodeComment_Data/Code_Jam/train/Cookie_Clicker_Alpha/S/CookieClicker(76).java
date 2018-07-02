package methodEmbedding.Cookie_Clicker_Alpha.S.LYD60;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class CookieClicker {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.bin"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("B-small-attempt0.out"));
		int t = Integer.parseInt(reader.readLine());
		DecimalFormat format = new DecimalFormat("0.0000000");
		for (int i = 0; i < t; i++) {
			String[] curInps = reader.readLine().split(" ");
			double c = Double.parseDouble(curInps[0]);
			double f = Double.parseDouble(curInps[1]);
			double x = Double.parseDouble(curInps[2]);
			double curProdRate = 2;
			double timeTaken = 0;
			while (x / curProdRate > c / curProdRate + x / (curProdRate + f)) {
				timeTaken += c / curProdRate;
				curProdRate += f;
				// System.out.println(curProdRate + "\t" + timeTaken);
			}
			timeTaken += x / curProdRate;
			StringBuilder builder = new StringBuilder("Case #").append(i + 1).append(": ").append(format.format(timeTaken))
					.append("\n");
			writer.write(builder.toString());
		}
		reader.close();
		writer.close();
	}
}
