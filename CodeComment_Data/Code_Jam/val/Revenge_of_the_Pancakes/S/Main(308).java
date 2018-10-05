package methodEmbedding.Revenge_of_the_Pancakes.S.LYD371;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int testCases = input.nextInt();
		for (int i = 1; i <= testCases; i++) {
			int minCount = 0;
			char[] inputChars = input.next().toCharArray();
			int j = 0;
			for (; j < inputChars.length - 1; j++) {
				if (inputChars[j] != inputChars[j+1]) {
					minCount++;
					for(int k = j; k >= 0; k--) {
						inputChars[k] = inputChars[j+1];
					}
				}
			}
			
			if (inputChars[j] == '-') {
				minCount++;
			}

			System.out.println("Case #" + i + ": " + minCount);
		}
	}

}
