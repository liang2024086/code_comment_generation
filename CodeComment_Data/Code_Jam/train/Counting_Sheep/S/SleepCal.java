package methodEmbedding.Counting_Sheep.S.LYD247;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SleepCal {
	public static void main(String input11[]) {
		BufferedReader br = null;
		String input1 = "";
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(
					"C:\\Users\\ACER\\Music\\Downloads\\A-small-attempt1.in"));

			while ((sCurrentLine = br.readLine()) != null) {
				// System.out.println(sCurrentLine);
				input1 += sCurrentLine + "\n";
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		String inputs[] = input1.split("\n");
		int noOfInputs = Integer.parseInt(inputs[0]);
		int input[] = new int[noOfInputs];
		String output[] = new String[noOfInputs];

		PrintWriter writer;
		try {
			writer = new PrintWriter("C:\\Users\\ACER\\Music\\Downloads\\output.in", "UTF-8");

			for (int i = 0; i < noOfInputs; i++) {
				int inpuno = i + 1;
				input[i] = Integer.parseInt(inputs[inpuno]);
				if (input[i] == 0) {
					output[i] = "Case #" + inpuno + ": INSOMNIA";
					writer.println(output[i]);
				} else {
					String mul = "" + input[i];
					int counter = 1;
					boolean found = false;
					while (!found && counter < 1000) {
						mul = (input[i] * counter) + mul;
						if (mul.contains("1") && mul.contains("2")
								&& mul.contains("3") && mul.contains("4")
								&& mul.contains("5") && mul.contains("6")
								&& mul.contains("7") && mul.contains("8")
								&& mul.contains("9") && mul.contains("0")) {
							int multiplied = input[i] * counter;
							output[i] = "Case #" + inpuno + ": " + multiplied;
							writer.println(output[i]);
							found = true;
						}
						counter++;

					}
				}
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(output);
		// Write code here
	}
}
