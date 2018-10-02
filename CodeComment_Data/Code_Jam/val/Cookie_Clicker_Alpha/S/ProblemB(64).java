package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1541;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class ProblemB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//String filenameInput = "B-sample.in";
		//String filenameOutput = "B-sample.out";
		String filenameInput = "B-small-attempt0.in";
		String filenameOutput = "B-small-attempt0.out";
		// String filenameInput = "B-big.in";
		// String filenameOutput = "BA-big.out";

		Class currentClass = ProblemB.class;
		try {

			String path = "src/"
					+ currentClass.getPackage().getName().replace(".", "/");
			BufferedReader input = new BufferedReader(new FileReader(new File(
					path + "/" + filenameInput)));
			BufferedWriter output = new BufferedWriter(new FileWriter(new File(
					path + "/" + filenameOutput)));
			int numOfTestcases = Integer.parseInt(input.readLine());
			System.out.println("Number of Testcases: " + numOfTestcases);
			NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
			DecimalFormat df = (DecimalFormat)nf;
			df.setMinimumFractionDigits(6);
			
			for (int i = 0; i < numOfTestcases; i++) {
				System.out.println("Testnumber : " + i);
				String[] stringsCFX = input.readLine().split(" ");
				// c is the price for a cookie
				double c = Double.parseDouble(stringsCFX[0]);
				// f is the productionrate
				double f = Double.parseDouble(stringsCFX[1]);
				// x is the number of cookies to be reached
				double x = Double.parseDouble(stringsCFX[2]);
				
				int numberofcookiefarmstobuy = (int) Math.floor(x / c - 2/f );
				if(numberofcookiefarmstobuy<0){
					numberofcookiefarmstobuy = 0;
				}
				//System.out.println("number of cookies farms to buy: " + numberofcookiefarmstobuy);
				
				double time = 0;
				for (int j = 0; j <= numberofcookiefarmstobuy-1; j++) {
					//System.out.println("time spent to increase the production rate from " + (2+(j)*f) + " to " + (2+(j+1)*f) + " is :" + 1. / (2+j*f) * c);
					time += 1. / (2+j*f);
				}
				time *= c;
				time += x/(2+f*numberofcookiefarmstobuy);
				
				

				String outputString = "Case #" + (i + 1) + ": " + df.format(time);
				//System.out.println(outputString);

				if (i + 1 != numOfTestcases) {
					outputString += "\n";
				}
				output.write(outputString);

			}

			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
