package methodEmbedding.Revenge_of_the_Pancakes.S.LYD975;

import java.util.Scanner;

public class RevengePancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String stack = "";
		for (int i = 0; i < t; i++) {
			int no_flips = 0;
			stack = sc.next();
			int j = 0;
			while (j < stack.length()) {
				if (stack.charAt(j) == '-') {
					j++;
					while (j < stack.length() && stack.charAt(j) == '-')
						j++;
					no_flips++;
				} else {
					j++;
					while (j < stack.length() && stack.charAt(j) == '+')
						j++;
					if (j < stack.length() && stack.charAt(j) == '-') {
						j++;
						while (j < stack.length() && stack.charAt(j) == '-')
							j++;
						no_flips += 2;
					}
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + no_flips);
		}
	}

}
