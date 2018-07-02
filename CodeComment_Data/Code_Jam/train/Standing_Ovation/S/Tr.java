package methodEmbedding.Standing_Ovation.S.LYD984;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Tr {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		String num = scanner.nextLine();
		ArrayList<Integer> adds = new ArrayList<>();

		int n = Integer.parseInt(num);
		for (int i = 0; i < n; i++) {
			adds.add(0);
			int stand = 0, track = 0, add = 0;
			String inp = scanner.nextLine();
			String numbers = inp.split(" ")[1];
			int max = Character.getNumericValue(inp.charAt(0));
			int shy;
			for (int j = 0; j <= max; j++) {
				shy = (Character.getNumericValue(numbers.charAt(j)));
				if (shy != 0) {
					if (j <= stand)
						stand += shy;
					else {
						add += (j - stand);
						stand += shy + add;
					}
				}
			}
			adds.set(i, add);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Case #" + (i + 1) + ": " + adds.get(i));
		}
	}
}
