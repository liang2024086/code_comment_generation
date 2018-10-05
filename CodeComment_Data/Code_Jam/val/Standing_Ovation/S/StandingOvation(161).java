package methodEmbedding.Standing_Ovation.S.LYD366;


import java.io.*;

public class StandingOvation {

	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in"));

		try {
			String line = "";
			int noOfTestCases = 0;
			int k = 0;

			while ((line = reader.readLine()) != null) {

				if (k == 0) {
					noOfTestCases = Integer.parseInt(line);
					if (noOfTestCases < 1 || noOfTestCases > 100) {
						break;
					}
					k++;
					continue;
				}

				String[] shynessLevels = line.split("[ ]");

				if (shynessLevels.length == 2) {
					int shynessMax = Integer.parseInt(shynessLevels[0]);

					if (shynessMax < 0 || shynessMax > 6) {
						break;
					}

					int noOfMaxPersons = 0;
					String persons = shynessLevels[1];

					if (persons.length() != shynessMax + 1) {
						break;
					}

					int sum = 0;
					for (int i = 0; i < persons.length(); i++) {
						int num = Integer.parseInt(persons.charAt(i) + "");
						sum += num;
						if (sum < i + 1) {
							noOfMaxPersons += i - sum + 1;
							sum += i - sum + 1;
						}
					}

					System.out.println("Case #" + k++ + ": " + noOfMaxPersons);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}
}
