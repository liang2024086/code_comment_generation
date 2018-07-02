package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1017;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FileReader isr;

		try {

			Scanner in = new Scanner(new File(
					"C:\\Users\\dilip1\\Desktop\\B-small-attempt0.in"));
			// BufferedReader br = new BufferedReader(isr);

			FileWriter fw = new FileWriter(new File(
					"C:\\Users\\dilip1\\Desktop\\output.out"));
			BufferedWriter bw = new BufferedWriter(fw);

			int no_cases = in.nextInt();
			// //System.out.println("cases:"+no_cases);
			for (int j = 1; j <= no_cases; j++) {

				double c = in.nextDouble();
				double f = in.nextDouble();
				double x = in.nextDouble();
				double f1 = 0.0;
				double t = 0;
				double t1 = (x / (2.0 + f1 * f));
				double t2 = (c / (2.0 + f1 * f) + (x / (2.0 + (f1 + 1) * f)));
				f1 += 1;
				if (t1 > t2) {
					t = c / 2.0;

					t1 = (x / (2.0 + f1 * f));
					t2 = (c / (2.0 + f1 * f) + (x / (2.0 + (f1 + 1) * f)));

					f1 += 1;
					while (t1 > t2) {
						t = t + (c / (2.0 + (f1 - 1) * f));
						t1 = (x / (2.0 + f1 * f));
						t2 = (c / (2.0 + f1 * f) + (x / (2.0 + (f1 + 1.0) * f)));
						f1 += 1;
						// System.out.println(t+" "+t1+" "+t2);
					}
					t += (x / (2.0 + (f1 - 1) * f));
				} else
					t = t1;
				//System.out.println("time: " + t);
				DecimalFormat df = new DecimalFormat("#.0000000");
				
				fw.write("Case #" + j + ": " + df.format(t));
				if (j < no_cases)
					fw.write("\n");
			}
			fw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
