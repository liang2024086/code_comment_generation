package methodEmbedding.Cookie_Clicker_Alpha.S.LYD385;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class QualificationB_small {

	public static void main(String[] args) throws IOException {

		BufferedReader inputReader = new BufferedReader(
				new FileReader("fileQualificationB\\B-small-attempt0.in"));
		BufferedWriter outputWriter = new BufferedWriter(
				new FileWriter("fileQualificationB\\B-small-attempt0.out"));
		int testCaseNumber = Integer.valueOf(inputReader.readLine());
		for (int i = 1 ; i <= testCaseNumber ; i++) {
			String lineOfCFX = inputReader.readLine();
			String[] sepOfCFX = lineOfCFX.split(" ");
			double C = Double.parseDouble(sepOfCFX[0]);
			double F = Double.parseDouble(sepOfCFX[1]);
			double X = Double.parseDouble(sepOfCFX[2]);
			//double increaseCookie = 2;
			double thisTimeCost = C/2 + X/(2 + F);
			double preTimeCost = X/2;
			double j = 1;
			while (true) {
				if (thisTimeCost > preTimeCost) {
					break;
				}
				thisTimeCost = thisTimeCost - X/(2 + F*j);
				thisTimeCost = thisTimeCost + C/(2 + F*j) + X/(2 + F*(j+1));
				preTimeCost = preTimeCost - X/(2 + F*(j-1));
				preTimeCost = preTimeCost + + C/(2 + F*(j-1)) + X/(2 + F*j);
				j++;
			}
			
			DecimalFormat format = new DecimalFormat("#####.#######");
			outputWriter.write("Case #" + Integer.toString(i) + ": " + format.format(preTimeCost));
			outputWriter.newLine();
		}
		inputReader.close();
		outputWriter.close();
	}

}
