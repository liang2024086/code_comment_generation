package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1320;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("F:\\input.in"));

			File file = new File("F:\\output.out");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
			bufferedWriter = new BufferedWriter(fileWriter);

			int T = Integer.valueOf(bufferedReader.readLine());
			for (int i = 1; i <= T; i++) {

				String line = bufferedReader.readLine();
				String[] split = line.split(Matcher.quoteReplacement(" "));
				double C = Double.valueOf(split[0]);
				double F = Double.valueOf(split[1]);
				double X = Double.valueOf(split[2]);

				double lastTime = Double.MAX_VALUE;
				int numberOfFactories = 0;
				while (true) {
					double income = 2;
					double time = 0;

					for (int j = 1; j <= numberOfFactories; j++) {
						time += C / income;
						income += F;
					}

					time += X / income;
					if (lastTime < time) {
						break;
					} else {
						numberOfFactories++;
						lastTime = time;
					}
				}

				bufferedWriter.write("Case #" + i + ": " + lastTime + "\n");

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
