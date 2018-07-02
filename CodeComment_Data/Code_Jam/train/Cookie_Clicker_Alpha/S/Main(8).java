package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1150;

import java.util.Scanner;
import java.util.Locale;
import java.util.Properties;
import java.text.DecimalFormat;

public class Main {
	public static boolean DEBUG_MODE;

	static public void main(String[] args) {
		// Read the number of problems
		DEBUG_MODE = (null != System.getProperty("debug") && "true".equalsIgnoreCase(System.getProperty("debug")));

		Scanner scanner = new Scanner(System.in);
			scanner.useLocale(Locale.US);
		int numberOfProblems = scanner.nextInt();
		assert 0 < numberOfProblems : "Zero number of problems...??";

		int caseNum = 1;
		while( 0 < numberOfProblems-- ) {
			System.out.print("Case #" + (caseNum++) + ": ");
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();

			if( DEBUG_MODE ) {
				System.out.println("C: " + C + ", F: " + F + ", X: " + X);
			}

			double result = Double.MAX_VALUE;
			double prevResult;
			int i=0;
			double timeForFarms = 0;
			do {
				prevResult = result;
				result = timeForFarms + X/(2+(i*F));
				timeForFarms += C/(2+(i*F));
				i++;
			}while(result < prevResult);

			System.out.print(prevResult);
			System.out.print("\n");
		}
	}
}
