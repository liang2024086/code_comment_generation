package methodEmbedding.Cookie_Clicker_Alpha.S.LYD804;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MainClazz {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Incorrect format. Please enter file name");
		} else {
			File f = new File("C:\\Users\\urvi\\Desktop\\Output.txt");
			FileWriter fstream = new FileWriter(f);
			BufferedWriter out = new BufferedWriter(fstream);
			String fileName = args[0];
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter("\n");
			int iterations = Integer.parseInt(scanner.next().trim());
			for (int index = 1; index <= iterations; index++) {
				String[] inputRow = scanner.next().trim().split(" ");
				double consumedTime = 0;
				double cookieSpeed = 2;
				double farmCost = Double.parseDouble(inputRow[0]);
				double farmSpeed = Double.parseDouble(inputRow[1]);
				double desiredOutput = Double.parseDouble(inputRow[2]);
				while (true) {
					if ((desiredOutput / cookieSpeed) < ((farmCost / cookieSpeed) + desiredOutput
							/ (cookieSpeed + farmSpeed))) {
						consumedTime += desiredOutput / cookieSpeed;
						break;
					} else {
						consumedTime += farmCost / cookieSpeed;
						cookieSpeed = cookieSpeed + farmSpeed;
					}
				}

				DecimalFormat decimalFormat = new DecimalFormat("###.0000000");
				String output = "Case #" + index + ": "
						+ decimalFormat.format(consumedTime);
				out.write(output);
				if (index < iterations) {
					out.newLine();
				}
			}
			out.flush();
		}
	}
}
