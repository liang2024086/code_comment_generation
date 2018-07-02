package methodEmbedding.Revenge_of_the_Pancakes.S.LYD726;

import java.util.Scanner;

public class RevengeOfThePancakes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();
		in.nextLine();
		for (int a = 0; a < trials; a++) {
			String cakes = in.nextLine();
			boolean cakez[] = new boolean[cakes.length()];
			for (int b = cakes.length() - 1; b >= 0; b--) {
				if (cakes.charAt(b) == '+')
					cakez[b] = true;
				else
					cakez[b] = false;
			}
			int flips = 0;
			boolean flipped = true;
			for (int b = cakes.length() - 1; b >= 0; b--) {
				if (!cakez[b]) {
					flipped = false;
				}
			}
			while (!flipped) {
				flips++;
				flipped = true;
				boolean flipping = false;
				for (int b = cakes.length() - 1; b >= 0; b--) {
					if (flipping) {
						cakez[b] = !cakez[b];
					} else {
						if (!cakez[b]) {
							flipping = true;
							cakez[b] = !cakez[b];
						}
					}
				}
				for (int b = cakes.length() - 1; b >= 0; b--) {
					if (!cakez[b]) {
						flipped = false;
						break;
					}
				}
			}
			System.out.println("Case #" + (a + 1) + ": " + (flips));
		}
	}

}
