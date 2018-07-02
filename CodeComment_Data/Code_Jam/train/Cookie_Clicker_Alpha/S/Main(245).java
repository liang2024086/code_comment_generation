package methodEmbedding.Cookie_Clicker_Alpha.S.LYD666;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String args[]) {
		System.out.println("Matarani");
		try {
			FileReader file = new FileReader(new File(
					"D:/Rahul/Practice/src/test.txt"));
			BufferedReader reader = new BufferedReader(file);
			String temp = "";
			double rate = 2;
			double seconds = 0.0000;
			double[] parameters = new double[3];
			String[] gg = null;
			int testcases = Integer.parseInt(reader.readLine());
			for (int d = 1; d <= testcases; d++) {
				rate = 2;
				seconds=0.0000;
				boolean cond = false;
				temp = reader.readLine();
				gg = temp.split(" ");
				for (int s = 0; s < 3; s++) {
					parameters[s] = Double.parseDouble(gg[s]);
				}
				
				if (parameters[2] <= parameters[0]) {
					seconds += parameters[2] / rate;
				} else {
					while (!cond) {
						double actual = parameters[2] / rate;
						double toconsider = (parameters[0]/rate) + (parameters[2]/(rate+parameters[1]));
						if (toconsider < actual) {
							seconds += parameters[0] / rate;
							rate += parameters[1];
						} else {
							seconds += actual;
							cond = true;
						}
					}
				}
				DecimalFormat df = new DecimalFormat("##.#######");
				System.out.print("Case #" + d + ": ");
				System.out.printf("%1$.7f\n",seconds);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
