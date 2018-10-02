package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1028;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Scanner;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int nCases = in.nextInt();
		in.nextLine();
		for (int caseNumber = 1; caseNumber <= nCases; caseNumber++) {					
			String[] line = in.nextLine().split(" ");
			double farmCost = Double.parseDouble(line[0]);
			double farmRevenue = Double.parseDouble(line[1]);
			double target = Double.parseDouble(line[2]);
			
			double elapsed = 0;
			int farms = 0;
			
			while (true) {
				// time needed to reach X without building a farm
				double t1 = target / (2 + farmRevenue * farms);
				//System.out.println(t1);

				// time needed to build the next farm
				double tf = farmCost / (2 + farmRevenue * farms);
				//System.out.println(tf);

				// time needed, from tf, to reach X
				double t2 = tf + (target / (2 + farmRevenue * (1+farms)));
				//System.out.println(t2);
				
				if (t2 < t1) {
					elapsed += tf;
					farms++;
				} else {
					elapsed += t1;
					break;
				}
			}
			
			DecimalFormat df = new DecimalFormat("#.0000000");
			DecimalFormatSymbols custom=new DecimalFormatSymbols();
			custom.setDecimalSeparator('.');
			df.setDecimalFormatSymbols(custom);
//			
//			System.out.println (df.format(farmCost));
//			System.out.println (df.format(farmRevenue));
//			System.out.println (df.format(target));
//			System.out.println();			

			System.out.print("Case #");
			System.out.print(caseNumber);
			System.out.print(": ");
			System.out.println (df.format(elapsed));
		}


	}


}
