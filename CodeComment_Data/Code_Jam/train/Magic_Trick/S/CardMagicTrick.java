package methodEmbedding.Magic_Trick.S.LYD634;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardMagicTrick {

	public static void main(String args[]) {
		List<String> fileContent = Utility
				.readFromFile("data/mt-A-small-attempt0.in");

		fileContent.remove(0);
		int fileSize = fileContent.size();
		int testCase = 1;
		for (int i = 0; i < fileSize;) {

			int firstSelectedRow = Integer.parseInt(fileContent.get(i));
			List<String> firstSelectedNumbers = new ArrayList<String>(
					Arrays.asList(fileContent.get(i + firstSelectedRow).split(
							" ")));

			int secondSelectedRow = Integer.parseInt(fileContent.get(i + 5));
			List<String> secondSelectedNumbers = new ArrayList<String>(
					Arrays.asList(fileContent.get(i + 5 + secondSelectedRow)
							.split(" ")));

			List<String> removedNumbers = new ArrayList<String>();
			for (String str1 : firstSelectedNumbers) {
				for (String str2 : secondSelectedNumbers) {
					if (str1.equals(str2)) {
						removedNumbers.add(str1);
					}
				}
			}
			if (removedNumbers.size() == 1) {
				System.out.println("Case #" + testCase + ": "
						+ removedNumbers.get(0));
			} else if (removedNumbers.size() > 1) {
				System.out.println("Case #" + testCase + ": Bad magician!");
			} else if (removedNumbers.size() == 0) {
				System.out
						.println("Case #" + testCase + ": Volunteer cheated!");
			}

			i += 10;
			testCase += 1;
		}
	}
}
