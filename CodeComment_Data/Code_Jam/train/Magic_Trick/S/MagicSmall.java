package methodEmbedding.Magic_Trick.S.LYD1201;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicSmall {

	public static void main(String[] args) throws IOException {
		int testcases = 0;
		ArrayList<Integer> answers = new ArrayList<>();
		ArrayList<Integer[][]> arrangement = new ArrayList<>();

		Integer[][] hold = new Integer[4][4];

		try {

			FileReader fr = new FileReader(System.getProperty("user.dir")
					+ "/input.in");
			BufferedReader br = new BufferedReader(fr);

			String strLine = "";
			int state = 0;
			int arrCounter = 0;

			while ((strLine = br.readLine()) != null) {
				switch (state) {
				case 0:
					testcases = Integer.parseInt(strLine);
					state++;
					break;
				case 1:
					answers.add(Integer.parseInt(strLine));
					state++;
					hold = new Integer[4][4];
					arrCounter = 0;
					break;
				case 2:
					Scanner sc = new Scanner(strLine).useDelimiter("\\s");

					int counter = 0;

					while (sc.hasNext()) {
						hold[arrCounter][counter] = Integer.parseInt(sc.next());
						counter++;
					}

					arrCounter++;
					if (arrCounter > 3) {
						state--;
						arrangement.add(hold);
					}

					break;
				default:
					break;
				}
			}

			br.close();

			int counter = 1;

			for (int i = 0; i < testcases * 2; i += 2) {
				Integer[] answerOne = new Integer[4];
				Integer[] answerTwo = new Integer[4];

				int solution = 0;
				int bad = 0;

				answerOne = arrangement.get(i)[answers.get(i) - 1];
				answerTwo = arrangement.get(i + 1)[answers.get(i + 1) - 1];

				for (int j = 0; j < answerOne.length; j++) {
					for (int k = 0; k < answerTwo.length; k++) {
						if (answerOne[j] == answerTwo[k]) {
							bad++;
							solution = answerOne[j];
						}
					}
				}

				switch (bad) {
				case 0:
					System.out.println("Case #" + counter
							+ ": Volunteer cheated!");
					break;
				case 1:
					System.out.println("Case #" + counter + ": " + solution);
					break;
				default:
					System.out.println("Case #" + counter + ": Bad magician!");
					break;
				}

				counter++;

			}

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
}
