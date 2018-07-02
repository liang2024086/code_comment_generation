package methodEmbedding.Standing_Ovation.S.LYD1450;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class StandingOvation {

	public static void main(String[] args) throws Exception {
		Stream<String> lines = Files.lines(Paths.get("data/input.txt"));
		Iterator<String> iterator = lines.iterator();
		iterator.next(); // Ignore first line
		for (int testCase = 1; iterator.hasNext(); testCase++) {
			String line = iterator.next().split(" ")[1];
			char[] chars = line.toCharArray();
			int currentClapping = 0;
			int friendsRequired = 0;
			for (int i = 0; i < chars.length; i++) {
				int quantity = Character.getNumericValue(chars[i]);
				currentClapping += quantity;
				if (currentClapping < i + 1) {
					int numberNeeded = i + 1 - currentClapping;
					currentClapping += numberNeeded;
					friendsRequired += numberNeeded;
				}
			}
			System.out.println("Case #" + testCase + ": " + friendsRequired);
		}
	}
}
