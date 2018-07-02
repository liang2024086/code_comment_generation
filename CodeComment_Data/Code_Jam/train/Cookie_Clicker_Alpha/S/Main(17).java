package methodEmbedding.Cookie_Clicker_Alpha.S.LYD830;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		Integer numberOfTestCases = 0;
		String fileName = args[0];
		String outFileName = args[1];
		FileReader fis = new FileReader(new File(fileName));
		BufferedReader bis = new BufferedReader(fis);
		FileWriter fwr = new FileWriter(new File(outFileName));
		BufferedWriter bwr = new BufferedWriter(fwr);
		numberOfTestCases = Integer.parseInt(bis.readLine());

		for (int test = 1; test <= numberOfTestCases; test++) {
			String outLine = "Case #" + test + ": ";
			String line = bis.readLine();
			String[] array = line.split(" ");
			double c = Double.parseDouble(array[0]);
			double f = Double.parseDouble(array[1]);
			double x = Double.parseDouble(array[2]);
			double xRemain = x;

			double time = 0.0;
			double currentSpeed = 2.0;
			while (xRemain > 0.0) {
				if (xRemain < c) {
					time = time + xRemain / currentSpeed;
					xRemain = 0.0;
				} else {
					xRemain = xRemain - c;
					time = time + c/currentSpeed;
					if ((xRemain/currentSpeed) > ((xRemain + c)/(currentSpeed+f))) {
						xRemain = xRemain + c;
						currentSpeed += f;
					} else {
						time = time + xRemain/currentSpeed;
						xRemain = 0.0;
					}
				}
			}
			DecimalFormat sevenDForm = new DecimalFormat("#.#######");
			outLine += Double.valueOf(sevenDForm.format(time));
			bwr.append(outLine + "\n");
			System.out.println(outLine);
		}
		bis.close();
		bwr.close();
	}
}
