package methodEmbedding.Cookie_Clicker_Alpha.S.LYD655;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Solution7 {

	public static void main(String args[]) {
		Scanner in = null;

		try {
			in = new Scanner(System.in);
			in.useLocale(Locale.US);
			Locale.setDefault(Locale.US);
			
			NumberFormat format = DecimalFormat.getInstance();
			format.setMaximumFractionDigits(7);
			format.setMinimumFractionDigits(7);

			int nbCas = in.nextInt();
			in.nextLine();

			for (int j = 0; j < nbCas; j++) {
				double c = in.nextDouble();
				double f = in.nextDouble();
				double x = in.nextDouble();

				double totalPrev = x / 2;
				double totalCurrent = c / 2 + x/(2+f);

				int nbAchat = 1;
				while (totalPrev > totalCurrent) {
					double diviseur = 2;
					int i = 0;
					totalPrev = totalCurrent;
					totalCurrent = c / 2;
					while(i < nbAchat){
						diviseur += f;
						totalCurrent += c / diviseur;
						i++;
					}
					totalCurrent += x/(diviseur+f);
					nbAchat++;
					
				}

				System.out.println("case #" + (j + 1) + ": " + format.format(totalPrev));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

}
