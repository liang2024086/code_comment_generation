package methodEmbedding.Magic_Trick.S.LYD1963;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicTrick {

	private static final int GRIDROWS = 4;
	private static final int GRIDCOLS = 4;
	private static final String BAD_MAGICIAN = "Bad magician!";
	private static final String BAD_VOLUNTEER = "Volunteer cheated!";

	public static void main(String[] args) throws NumberFormatException, IOException {

		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
		int testCases = Integer.parseInt(br.readLine());
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		for(int testCase = 1; testCase <= testCases; testCase++) {
			for(int pos = 0; pos < numbers.length; pos++) {
				numbers[pos] = 0;
			}
			int answer = -1;
			int firstAns = Integer.parseInt(br.readLine());
			for(int ignore = 1; ignore < firstAns; ignore++)
				br.readLine();
			String firstLine = br.readLine();
			String[] firstRowNumbers = firstLine.split(" ");
			for(int col = 0; col < GRIDCOLS; col++) {
				numbers[Integer.parseInt(firstRowNumbers[col])]++;
			}
			for(int ignore = firstAns + 1; ignore <= GRIDROWS; ignore++)
				br.readLine();
			int secondAns = Integer.parseInt(br.readLine());
			for(int ignore = 1; ignore < secondAns; ignore++)
				br.readLine();
			String secondLine = br.readLine();
			String[] secondRowNumbers = secondLine.split(" ");
			for(int col = 0; col < GRIDCOLS; col++) {
				int possibleOutput = Integer.parseInt(secondRowNumbers[col]);
				if(numbers[possibleOutput] == 1) {
					if(answer == -1) {
						answer = possibleOutput;
					} else {
						System.out.println("Case #" + testCase + ": " + BAD_MAGICIAN);
						answer = 0;
						break;
					}
				}
			}
			if(answer == -1) {
				System.out.println("Case #" + testCase + ": " + BAD_VOLUNTEER);
			} else if(answer != 0) {
				System.out.println("Case #" + testCase + ": " + answer);
			}
			for(int ignore = secondAns + 1; ignore <= GRIDROWS; ignore++)
				br.readLine();
		}
		br.close();
		fr.close();
	}

}
