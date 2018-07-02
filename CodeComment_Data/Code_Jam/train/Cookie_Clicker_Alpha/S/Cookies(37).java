package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1178;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Cookies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader;
		PrintWriter pw;
		try {
			pw = new PrintWriter(new File("output.txt"));
			reader = new Scanner(new File("B-small-attempt0.in"));
			reader.useLocale(Locale.ENGLISH);
			Locale.setDefault(Locale.ENGLISH);
			int n = reader.nextInt();
			reader.nextLine();
			for (int i = 0; i < n; i++){
			double c = reader.nextDouble();
			double f = reader.nextDouble();
			double x = reader.nextDouble();
			double speed = 2;
			double time[] = new double[100000];
			for (int j = 0; j < 100000; j++)
				time[j] = 0;
			time[0] = x / speed;
			speed += f; 
			time[1] = x /speed + c /(speed - f); 
			int j;
			for (j = 1; time[j-1] > time[j]; j++){
				speed += f;
				time[j + 1] = x/speed;
				for (int k = 0; k < (j + 1); k++) 
					time[j + 1] += c/(speed - f*(k+1));
			}
			DecimalFormat formatter = new DecimalFormat("0.#######");
			pw.print("Case #" + (i+1)  + ": ");
			pw.printf("%.7f", time[j - 1]);
			if (i != n -1)
			pw.println();
		
			}
			pw.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
