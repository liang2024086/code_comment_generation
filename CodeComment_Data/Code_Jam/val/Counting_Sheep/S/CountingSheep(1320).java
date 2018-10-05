package methodEmbedding.Counting_Sheep.S.LYD867;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountingSheep {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);		
		if (scanner.hasNext()) {
			int testCases = scanner.nextInt();
			for (int i = 1; i <= testCases; i++) {
				int number = scanner.nextInt();				
				if (number == 0) {
					System.out.println("Case #" + i + ": INSOMNIA");
					continue;
				}
				HashSet<Character> set = new HashSet<Character>();
				for (char c : (number + "").toCharArray()) {
					set.add(c);
				}
				int multiplier = 2;
				int value = number;
				while (set.size() < 10) {
					value = number * multiplier;
					multiplier++;
					for (char c : (value + "").toCharArray()) {
						set.add(c);
					}
				}
				System.out.println("Case #" + i + ": " + value);
			}
		}
		scanner.close();
	}
}
