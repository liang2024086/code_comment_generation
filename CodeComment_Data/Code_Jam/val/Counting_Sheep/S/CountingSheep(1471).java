package methodEmbedding.Counting_Sheep.S.LYD1008;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountingSheep {
	public static void main(String[] args) {

		File inputFile = new File("/Users/Mark/python stuff/playground/A-small-attempt2.in");
		File outputFile = new File("/Users/Mark/python stuff/playground/A-small-attempt2.out");

		try {
			
			BufferedReader buffRead = new BufferedReader(new FileReader(inputFile));
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(outputFile));

			int testCases = Integer.parseInt(buffRead.readLine());

			for (int i = 1; i <= testCases; i++) {

				String inputN = buffRead.readLine();

				int intN = Integer.parseInt(inputN);

				boolean done = false;

				int zero = 0;
				int one = 0;
				int two = 0;
				int three = 0;
				int four = 0;
				int five = 0;
				int six = 0;
				int seven = 0;
				int eight = 0;
				int nine = 0;

				if (inputN.equals("0")) {
					buffWrite.write("Case #" + i + ": " + "INSOMNIA");
				} else {

					int k = 1;
					while (!done) {

						String N = String.valueOf(k * intN);
						int lengthN = N.length();

						for (int j = 0; j < lengthN; j++) {
							if (N.substring(j, j + 1).equals("1")) {
								one++;
							} else if (N.substring(j, j + 1).equals("2")) {
								two++;
							} else if (N.substring(j, j + 1).equals("3")) {
								three++;
							} else if (N.substring(j, j + 1).equals("4")) {
								four++;
							} else if (N.substring(j, j + 1).equals("5")) {
								five++;
							} else if (N.substring(j, j + 1).equals("6")) {
								six++;
							} else if (N.substring(j, j + 1).equals("7")) {
								seven++;
							} else if (N.substring(j, j + 1).equals("8")) {
								eight++;
							} else if (N.substring(j, j + 1).equals("9")) {
								nine++;
							} else if (N.substring(j, j + 1).equals("0")) {
								zero++;
							}

						}
						k++;
						if (one > 0 && two > 0 && three > 0 && four > 0 && five > 0 && six > 0 && seven > 0 && eight > 0
								&& nine > 0 && zero > 0) {
							done = true;
							buffWrite.write("Case #" + i + ": " + N);
						}
					}
				}
				buffWrite.newLine();
			}
			buffWrite.close();
			buffRead.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
