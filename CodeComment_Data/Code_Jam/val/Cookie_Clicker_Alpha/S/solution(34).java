package methodEmbedding.Cookie_Clicker_Alpha.S.LYD463;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class solution {

	private static final String INPUT_FILE = "/Users/reelfeet/Documents/workspace/codeJam/resources/cookieFarm/input.txt";
	private static final String OUTPUT_FILE = "/Users/reelfeet/Documents/workspace/codeJam/resources/cookieFarm/output.txt";
	
	public static void main(String[] args) {
		
		// set up file readers
		File input = new File(INPUT_FILE);
		FileReader fileReader = null;
		BufferedReader inputReader = null;
		
		try {
			fileReader = new FileReader(input);
			inputReader = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			System.out.println("broken file reader");
		}
		
		// set up file writers
		File output = new File(OUTPUT_FILE);
		FileWriter fileWriter = null;
		BufferedWriter outputWriter = null;
				
		try {
			fileWriter = new FileWriter(output);
			outputWriter = new BufferedWriter(fileWriter);
		} catch (IOException e1) {
			System.out.println("broken file writer");
		}
		
		try {
			int numCases = Integer.valueOf(inputReader.readLine());
			
			for (int i = 0; i < numCases; i ++) {
				
				String[] values = inputReader.readLine().split(" ");
				
				// get input values
				double farmPrice = Double.valueOf(values[0]);
				double farmRate = Double.valueOf(values[1]);
				double target = Double.valueOf(values[2]);

				// find limit at which it becomes faster to stop buying farms
				double limit = Math.ceil((target * farmRate - 2 * farmPrice)/(farmPrice * farmRate));
				
				// initialise output variables
				double time = 0;
				int testCase = i + 1;
				
				// handle case where it is quickest to not buy any farms
				if (limit < 1) {
					time = target/2;
					
				} else {
					// calculate time to buy first 'limit - 1' farms
					for (int j = 1; j < limit; j ++) {
						time += farmPrice/(2 + (j - 1) * farmRate);
					}
					
					// add time to reach target
					time += target/(2 + (limit - 1) * farmRate);
				}
			
				outputWriter.write("Case #" + testCase + ": " + String.format("%.7f", time));
				outputWriter.newLine();
			}

			outputWriter.close();
			fileWriter.close();
			inputReader.close();
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
