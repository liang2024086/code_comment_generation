package methodEmbedding.Revenge_of_the_Pancakes.S.LYD146;


import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();

		for (int n = 0; n < numCases; n++)
		{
			int pos = 0, neg = 0, flips = 0, max = 1, tempMax = 1, maxPosOrNeg = 0, maxLocation = 0;
			boolean end = false, oneFlip = true;
			String str = input.next();
			str = str.replaceAll(Pattern.quote("+"), "1");
			str = str.replaceAll(Pattern.quote("-"), "0");
			char[] digits = str.toCharArray();
			int[] numPieces = new int[digits.length];

			for (int i = 0; i < numPieces.length; i++) {

				if (digits[i] == '1') {
					pos++;
					numPieces[i] = 1;
				}
				else {
					neg++;
					numPieces[i] = 0;
					if (pos != 0) {
						oneFlip = false;
					}
				}
			}

			if (pos == 0) {
				flips = 1;
				System.out.printf("Case #" + (n + 1) + ": " + flips + "\n");
			}
			else if (neg == 0) {
				flips = 0;
				System.out.printf("Case #" + (n + 1) + ": " + flips + "\n");
			}
			else if (oneFlip == true) {
				flips = 1;
				System.out.printf("Case #" + (n + 1) + ": " + flips + "\n");
			}
			else {

				while (end == false) {
					pos = 0;
					neg = 0;
					for (int i = 0; i < numPieces.length; i++) {
						if (numPieces[i] == 1) {
							pos++;
						}
						else {
							neg++;
						}
					}
					if (pos == 0) {
						flips++;
						break;
					}
					for (int i = 0; i < numPieces.length-1; i++) {
						if (numPieces[i] == numPieces[i+1]) {
							tempMax++;
							if (tempMax >= max && i+2 < numPieces.length) {
								if (numPieces[0] != numPieces[i+2] && numPieces[i+1] != numPieces[i+2]) {
									maxPosOrNeg = numPieces[i];
									max = tempMax;
									maxLocation = i+1;
								}
							}
						}
						else {
							tempMax = 1;
						}
					}

					int counter = maxLocation;
					int y = 0;
					while (y <= counter) {
						int temp = numPieces[y];
						numPieces[y] = numPieces[counter];
						numPieces[counter] = temp;
						counter--;
						y++;
					}
					for (int i = 0; i <= maxLocation; i++) {
						if (numPieces[i] == 1) {
							numPieces[i] = 0;
						}
						else {
							numPieces[i] = 1;
						}
					}

					flips++;

					for (int i = 0; i < numPieces.length; i++) {
						if (numPieces[i] == 0) {
							end = false;
							max = 1;
							tempMax = 1;
							maxPosOrNeg = 0;
							maxLocation = 0;
							break;

						}
						else {
							end = true;
						}
					}
				}

				System.out.printf("Case #" + (n + 1) + ": " + flips + "\n");
			}
		}
	}
}
