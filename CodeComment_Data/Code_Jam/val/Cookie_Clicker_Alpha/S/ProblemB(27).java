package methodEmbedding.Cookie_Clicker_Alpha.S.LYD62;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;


public class ProblemB {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				Thread.currentThread().getContextClassLoader().getResourceAsStream("B-small-attempt0.in")));
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream("output.txt"), "utf-8"));
		} catch (UnsupportedEncodingException | FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}
		DecimalFormat dformat = new DecimalFormat("##.0000000");
		try {
			int T = Integer.parseInt(reader.readLine());
			for(int times = 1; times<=T; times++) {		
				String[] values = (reader.readLine()).split(" ");
				double C = Double.parseDouble(values[0]);
				double F = Double.parseDouble(values[1]);
				double X = Double.parseDouble(values[2]);
				double runningTime = 0.0, currentProdRate = 2.0;
				while((X/currentProdRate) > ((C/currentProdRate) + (X/(currentProdRate+F)))) {
					runningTime += (C/currentProdRate);
					currentProdRate += F;
				}
				runningTime += (X/currentProdRate);
				writer.write("Case #"+times+": "+dformat.format(runningTime)+"\n");
			}
		} catch (IOException e) {
			System.out.println("IOException while reading input file.");
			e.printStackTrace();
			System.exit(0);
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				System.out.println("IOException while trying to close input/output file.");
				e.printStackTrace();
			}
		}
	}

}
