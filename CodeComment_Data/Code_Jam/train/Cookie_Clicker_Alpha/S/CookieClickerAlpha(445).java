package methodEmbedding.Cookie_Clicker_Alpha.S.LYD369;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader reader = null;

		try {
			File file = new File("CookieClicker");
			reader = new BufferedReader(new FileReader(file));

			int numberOfTestCases = Integer.parseInt(reader.readLine());

			for (int i = 1; i < (numberOfTestCases + 1); i++) {

				String[] values = reader.readLine().split(" ");
				double farmCost = Double.parseDouble(values[0]);
				double incomeIncrement = Double.parseDouble(values[1]);
				double winningValue = Double.parseDouble(values[2]);

				boolean oneMoreIteration = true;

				double myCurrentIncomeRate = 2.00000;

				double totalTime = 0.00000;

				while (oneMoreIteration) {
					
					double waitingValue = winningValue / myCurrentIncomeRate;
					double oneMoreIterationValue = (farmCost / myCurrentIncomeRate) + 
							(winningValue / (myCurrentIncomeRate + incomeIncrement));

					/* Round off both values */
					
					if (oneMoreIterationValue < waitingValue) {
						totalTime += (farmCost / myCurrentIncomeRate);
					}
					else {
						oneMoreIteration = false;
						totalTime += (winningValue / myCurrentIncomeRate);
					}
					
					myCurrentIncomeRate += incomeIncrement;
				}

				System.out.printf("Case #" + i + ": " + "%.7f", totalTime);
				System.out.println("");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
