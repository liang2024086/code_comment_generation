package methodEmbedding.Revenge_of_the_Pancakes.S.LYD258;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String HAPPY_SIDE_UP = "+";
		final String BLANK_SIDE_UP = "-";

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String lines = in.nextLine();
		int testCases = Integer.parseInt(lines);
//		int testCases = 1;
		String status = "+";
		int answer = 0;

		for (int testNumber = 1; testNumber <= testCases; testNumber++) {
//			String pancakesLine = "+-";
			String pancakesLine = in.nextLine();
			String pancakesStack[] = pancakesLine.split("");


			if (pancakesStack[0].equals(BLANK_SIDE_UP)) {
				status = "-";

			}
      answer = 0;
			for (int i = 0; i < pancakesStack.length; i++) {

				if (!status.equals(pancakesStack[i])) {
					if (status.equals(HAPPY_SIDE_UP)) {
						status = BLANK_SIDE_UP;
						answer++;
					} else{
						status = HAPPY_SIDE_UP;
						answer++;
					}
				}

			}
			if (status.equals(BLANK_SIDE_UP)) {
				answer++;
			}
      status = "+";
			System.out.println("Case #" + testNumber + ": " + answer);
		}


	}

}
