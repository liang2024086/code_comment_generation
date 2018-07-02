package methodEmbedding.Magic_Trick.S.LYD204;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

public class Jam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = args[0];
		FileOutputStream output = null;
		InputStream inputStream = null;
		String printOutput = "";
		try {
			output = new FileOutputStream("output.txt");
			inputStream = new FileInputStream(input);
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream);
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);
			String readLine = bufferedReader.readLine();
			int cases = Integer.parseInt(readLine);

			for (int i = 0; i < cases || readLine == null; i++) {
				int onlyOne = 0;
				readLine = bufferedReader.readLine();
				int firstRow = Integer.parseInt(readLine);
				Vector<Integer> v = new Vector<Integer>();
				for (int j = 0; j < 4; j++) {
					readLine = bufferedReader.readLine();
					if (j == firstRow - 1) {
						String[] split = readLine.split(" ");
						for (String s : split) {
							v.add(Integer.parseInt(s.toString()));
						}
						System.out.println();
					}
				}

				readLine = bufferedReader.readLine();
				int secondRow = Integer.parseInt(readLine);
				boolean moreThanOne = false;
				boolean foundAtLeastOneMatch = false;
				for (int j = 0; j < 4; j++) {
					readLine = bufferedReader.readLine();
					if (j == secondRow - 1) {
						String[] split = readLine.split(" ");
						for (String s : split) {							
							int n = Integer.parseInt(s);
							if (v.contains(n)) {
								if (foundAtLeastOneMatch) {
									moreThanOne = true;
								} else {
									foundAtLeastOneMatch = true;
									onlyOne = n;
								}
							}
						}
						System.out.println();
					}
				}

				if (foundAtLeastOneMatch && moreThanOne) {

					printOutput += "Case #" + (1 + i) + ": "
							+ "Bad magician!\n";

				} else if (foundAtLeastOneMatch) {
					printOutput += "Case #" + (1 + i) + ": " + onlyOne + "\n";

				} else {
					printOutput += "Case #" + (1 + i) + ": "
							+ "Volunteer cheated!\n";

				}

			}

			bufferedReader.close();
			inputStreamReader.close();
			output.write(printOutput.getBytes());
			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
