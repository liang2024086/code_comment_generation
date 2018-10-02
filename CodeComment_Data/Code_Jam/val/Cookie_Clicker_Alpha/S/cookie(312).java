package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1611;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class cookie {

	public static void main(String[] args) {
		// The name of the file to open.
		String fileName = "data.txt";

		// This will reference one line at a time
		String line = null;
		int numCases;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			numCases = Integer.parseInt(bufferedReader.readLine());

			// indl cases
			for (int i = 0; i < numCases; i++) {
				Double[] arr = new Double[3];
				String[] str = bufferedReader.readLine().split(" ");
				for (int j = 0; j < 3; j++) {
					arr[j] = Double.parseDouble(str[j]);
				}
				double last;
				double current = 0;
				int num = 0;
				do {
					if(num == 0)
						last = Double.MAX_VALUE;
					else	
						last = current;
					double rate = 2.00;
					current = 0;
					for (int k = 0; k < num; k++) {
						current += arr[0]/rate;
						rate += arr[1];
					}
					current += arr[2] / rate;
					num++;
				} while (current < last);

				DecimalFormat df = new DecimalFormat("#.0000000");
				System.out.println("Case #" + (i + 1) + ": "
						+ df.format(last));

			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

	}
}
