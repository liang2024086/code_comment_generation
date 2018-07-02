package methodEmbedding.Magic_Trick.S.LYD70;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MagiciansCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			List<Integer> numbers = new ArrayList<Integer>();

			int ans1 = sc.nextInt();
			for (int l = 1; l <= 16; l++)
				if (l > (ans1-1) * 4 && l <= ans1 * 4)
					numbers.add(sc.nextInt());
				else
					sc.nextInt();

			int ans2 = sc.nextInt();
			for (int l = 1; l <= 16; l++)
				if (l > (ans2-1) * 4 && l <= ans2 * 4)
					numbers.add(sc.nextInt());
				else
					sc.nextInt();

			Set<Integer> common = new HashSet<Integer>(8);
			int ansCounter = 0;
			String ans = null;
			for (Integer number : numbers) {
				
				if (common.contains(number)) {
					ansCounter++;
					ans = number.toString();
				}
				common.add(number);
			}
			System.out.println(String.format("Case #%d: %s", i, (ansCounter == 1 ? ans : ansCounter == 0 ? "Volunteer cheated!" : "Bad magician!")));
		}
		sc.close();
	}

}
