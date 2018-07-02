package methodEmbedding.Magic_Trick.S.LYD1730;

import java.util.*;
import java.io.*;

public class magician {
	public static void main(String Args[]) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File(System.getProperty("user.dir") + "/A-small-attempt3.in"));
		String line = fileScanner.nextLine();
		Scanner lineScanner = new Scanner(line);
		int current = lineScanner.nextInt();
		int x;
		int n;
		for (int i = 1; i <= current; i++) {
			Set<Integer> sets = new HashSet<>();
			List<Integer> lists = new ArrayList(8);
			for (int q = 0; q < 2; q++) {
				line = fileScanner.nextLine();
				lineScanner = new Scanner(line);
				x = lineScanner.nextInt();
				n = x;
				while (x > 1) {
					fileScanner.nextLine();
					x--;
				}
				lineScanner = new Scanner(fileScanner.nextLine());
				for (int j = 0; j < 4; j++) {
					int currentValue = lineScanner.nextInt();
					sets.add(currentValue);
					lists.add(currentValue);
				}
				for (int j = 0; j < 4 - n; j++) {
					fileScanner.nextLine();
				}
			}
			if (sets.size() == 8) {
				System.out.println("Case #" + i + ": Volunteer cheated!");
			} else if (sets.size() == 7) {
				int result = 0;
				for (int j = 0; j < 8; j++) {
					if (!sets.contains(lists.get(j))) {
						result = lists.get(j);
					} else {
						sets.remove(lists.get(j));
					}
				}
				if (result != 0) {
					System.out.println("Case #" + i + ": " + result);
				} else {
					System.out.println("Case #" + i + ": Volunteer cheated!");
				}
				
			} else {
				System.out.println("Case #" + i + ": Bad magician!");
			}
		}
	}
}
