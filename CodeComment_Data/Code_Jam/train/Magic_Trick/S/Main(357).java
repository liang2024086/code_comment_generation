package methodEmbedding.Magic_Trick.S.LYD1961;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class Main {

	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(
				"//home/shuklaas/Desktop/A-small-attempt0.in"));
		@SuppressWarnings("resource")
		PrintWriter writer = new PrintWriter(
				"//home/shuklaas/Desktop/MagicOutput", "UTF-8");
		int t = Integer.parseInt(br.readLine());
		int caseNo = 1;
		while (caseNo <= t) {
			int magicMatrix[][] = new int[4][4];
			int firstAnswer = Integer.parseInt(br.readLine());
			for (int row = 0; row <= 3; row++) {
				String[] numbers = br.readLine().split(" ");
				magicMatrix[row][0] = Integer.parseInt(numbers[0]);
				magicMatrix[row][1] = Integer.parseInt(numbers[1]);
				magicMatrix[row][2] = Integer.parseInt(numbers[2]);
				magicMatrix[row][3] = Integer.parseInt(numbers[3]);
			}
			int answerCanBe[] = new int[4];
			answerCanBe[0] = magicMatrix[firstAnswer - 1][0];
			answerCanBe[1] = magicMatrix[firstAnswer - 1][1];
			answerCanBe[2] = magicMatrix[firstAnswer - 1][2];
			answerCanBe[3] = magicMatrix[firstAnswer - 1][3];

			int secondAnswer = Integer.parseInt(br.readLine());
			int count = 0;
			int answer = -1;
			for (int row = 0; row <= 3; row++) {
				String[] numbers = br.readLine().split(" ");
				if (row == secondAnswer - 1) {

					magicMatrix[row][0] = Integer.parseInt(numbers[0]);
					magicMatrix[row][1] = Integer.parseInt(numbers[1]);
					magicMatrix[row][2] = Integer.parseInt(numbers[2]);
					magicMatrix[row][3] = Integer.parseInt(numbers[3]);
					for (int i = 0; i <= 3; i++) {
						if (magicMatrix[row][0] == answerCanBe[i]) {
							answer = answerCanBe[i];
							count++;
						}
						if (magicMatrix[row][1] == answerCanBe[i]) {
							answer = answerCanBe[i];
							count++;
						}
						if (magicMatrix[row][2] == answerCanBe[i]) {
							answer = answerCanBe[i];
							count++;
						}
						if (magicMatrix[row][3] == answerCanBe[i]) {
							answer = answerCanBe[i];
							count++;
						}
					}

				}
			}

			if (count == 0) {
				writer.println("Case #" + (caseNo) + ": Volunteer cheated!");
			} else if (count == 1) {
				writer.println("Case #" + (caseNo) + ": " + answer);
			}

			else {
				writer.println("Case #" + (caseNo) + ": Bad magician!");
			}

			caseNo++;
		}
		writer.close();
		br.close();
	}

}
