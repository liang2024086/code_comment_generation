package methodEmbedding.Counting_Sheep.S.LYD829;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {
		String fileName = "/Users/aryaanand/Documents/workspace/GoogleJam/src/com/google/jam/temp.txt";

		// This will reference one line at a time
		String line = null;
		Integer noOfCases;
		BigInteger chosenNo;
		BigInteger possibleNos;
		BigInteger result;
		String finalOutput = "";

		Integer findMod;
		Integer findQuo;

		ArrayList<Integer> noList = new ArrayList<Integer>();
		ArrayList<Integer> checkList = new ArrayList<Integer>();
		noList.add(1);
		noList.add(2);
		noList.add(3);
		noList.add(4);
		noList.add(5);
		noList.add(6);
		noList.add(7);
		noList.add(8);
		noList.add(9);
		noList.add(0);

		try {
			File f = new File("temp.txt");
			FileReader fileReader = new FileReader(f.getAbsolutePath());

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				noOfCases = Integer.parseInt(line);
				for (int i = 1; i <= noOfCases; i++) {

					checkList.clear();
					chosenNo = new BigInteger(bufferedReader.readLine());

					Integer j = 1;
					while (true) {
						possibleNos = chosenNo.multiply(new BigInteger(j
								.toString()));
						if (possibleNos.equals(new BigInteger("0"))) {
							finalOutput = "Case #" + i + ": INSOMNIA\n";
							break;
						} else {

							do {

								findMod = possibleNos.mod(new BigInteger("10"))
										.intValue();
								findQuo = possibleNos.divide(
										new BigInteger("10")).intValue();

								if (!checkList.contains(findMod))
									checkList.add(findMod);
								result = chosenNo.multiply(new BigInteger(j
										.toString()));
								possibleNos = new BigInteger(findQuo.toString());
							} while (findQuo != 0);
						}

						if (checkList.size() == 10) {

							File file = new File("output.txt");
							FileWriter fw = new FileWriter(
									file.getAbsoluteFile());
							BufferedWriter bw = new BufferedWriter(fw);

							if (!file.exists()) {

								file.createNewFile();
							}

							finalOutput = finalOutput + "Case #" + i + ": "
									+ result + "\n";
							bw.write(finalOutput);

							bw.close();
							
							break;
						}
						j++;
					}
				}

			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");

		}
	}
}
