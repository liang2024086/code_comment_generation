package methodEmbedding.Revenge_of_the_Pancakes.S.LYD125;

import java.util.*;

class Revenge_Of_The_Pancakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTestCases, i, j, count;

		numTestCases = sc.nextInt();
		sc.nextLine();
		for(i=1; i<=numTestCases; i++) {
			String str = sc.nextLine();
			str += '+';
			count = 0;
			for(j=1; j<str.length(); j++)
				if(str.charAt(j) != str.charAt(j-1))
					count++;
			System.out.println("Case #" + i + ": " + count);
		}
	}
}
