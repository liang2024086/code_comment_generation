package methodEmbedding.Standing_Ovation.S.LYD869;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("output.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		FileReader fileReader = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int numberOfTestCases = Integer.parseInt(bufferedReader.readLine());
		for (int index = 1; index <= numberOfTestCases; ++index) {
			bufferedWriter.write("Case #" + index + ": ");
			String[] arr = bufferedReader.readLine().split(" ");
			int smax = Integer.parseInt(arr[0]);
			int memberNeed = 0;
			int currentStanding = Integer.parseInt(arr[1].charAt(0) + "");
			for (int strIndex = 1; strIndex <= smax
					&& ((currentStanding + memberNeed) < smax); ++strIndex) {
				int no = Integer.parseInt(arr[1].charAt(strIndex) + "");
				if (no != 0) {
					if ((currentStanding + memberNeed) < strIndex) {
						memberNeed += (strIndex - (currentStanding + memberNeed));
					}
					currentStanding += no;
				}
			}
			bufferedWriter.write(memberNeed + "");
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
		bufferedWriter.close();
		bufferedReader.close();
		fileWriter.close();
	}
}
