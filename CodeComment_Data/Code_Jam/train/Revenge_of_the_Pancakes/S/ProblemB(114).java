package methodEmbedding.Revenge_of_the_Pancakes.S.LYD537;

import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ans = s.nextLine();
		int testNo = Integer.parseInt(ans);
		for (int i = 0; i < testNo; i++) {
			ans = s.next();
			char[] pancakes = ans.toCharArray();
			int groupNumbers = 0;
			int j = pancakes.length - 1;
			while (j > -1 && pancakes[j] == '+') { // skipping the +'s at the bottom
				j--;
			}
			char lastP = '+';
			while (j > -1) {
				if (lastP != pancakes[j]) { // pancake with diff type of side
					lastP = pancakes[j];
					groupNumbers++;
				}
				j--;
			}

			System.out.println("Case #" + (i + 1) + ": " + groupNumbers);
		}
		s.close();
	}

}
