package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1160;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

class TUX02 {

	/**
	 * @author reva
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner (new FileInputStream("D://B-small-attempt0.in"));
		DecimalFormat df = new DecimalFormat("#.000000000");
		int T = in.nextInt();
		double C, F, X;
		for (int n = 1; n <= T; n++) {
			C = in.nextDouble();
			F = in.nextDouble();
			X = in.nextDouble();

			// double C=500.0, F=4.0 , X=2000.0;
			double rate = 2;
			double seconds = 0;
			

			double totaltimeRequired = seconds + X / rate, totalTimeStillRequired = seconds
					+ X / rate;
			while (totaltimeRequired >= totalTimeStillRequired) {
				totaltimeRequired = totalTimeStillRequired;
				seconds += C / rate;
				rate += F;
				totalTimeStillRequired = seconds + X / rate;
				// System.out.println(" rate "+rate+"\n time passed "+seconds+"\ncapacity"+capacity);
				// System.out.println("rate"+rate+"\ntotaltime"+(seconds+X/rate)+"\ntotaltimeRequired "+totaltimeRequired+"\ntotalTimeStillRequired "+totalTimeStillRequired+"\n--------------------");
			}
			
			 
			System.out.println("Case #" + n + ": " + df.format(totaltimeRequired));

		}
	}

}
