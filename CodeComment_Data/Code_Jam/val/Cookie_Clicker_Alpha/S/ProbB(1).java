package methodEmbedding.Cookie_Clicker_Alpha.S.LYD47;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProbB {
	static String FILENAME = "C:/GCJ/2014/B-small-attempt0.in"; // C:\GCJ

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(ProbB.FILENAME));
			int i = 1;
			int T = Integer.parseInt(in.readLine());
			double C = 0;
			double F = 0;
			double X = 0;
			double thresholdRate = 0;
			
			for (i = 1; i <= T; i++) {
				Scanner sc = new Scanner(in.readLine()).useDelimiter(" ");
				while (sc.hasNext() != false) {
					C = sc.nextDouble();
					F = sc.nextDouble();
					X = sc.nextDouble();
					thresholdRate = F * ((X/C) - 1);
					double currentRate = 2;
					double time = 0;
					while(currentRate < thresholdRate)
					{
						time = time + (C/currentRate);
						currentRate = currentRate + F;
					}
					time = time + (X/currentRate);
					System.out.println("Case #" + i + ": " + new DecimalFormat("#0.0000000").format(time));					
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			if(in != null)
			{
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
