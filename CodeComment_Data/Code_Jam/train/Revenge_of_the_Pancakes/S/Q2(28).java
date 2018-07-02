package methodEmbedding.Revenge_of_the_Pancakes.S.LYD336;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		try {
			String fileName = "B-small-attempt0";
			Scanner in = new Scanner(new File(fileName + ".in"));
			PrintWriter out = new PrintWriter(fileName + ".out");
			int numberOfTestCases = Integer.parseInt(in.nextLine());
			ArrayList<String> tests = new ArrayList<>();
			for (int i = 0; i < numberOfTestCases; i++) {
				tests.add(in.nextLine());
			}
			int testNum = 1;
			for (String pancakes : tests) {
				long result = 0;
				if (pancakes.substring(0, 1).equals("-")) {
					result++;
				}
				for(int i = 1; i < pancakes.length(); i++) {
					if(pancakes.substring(i - 1, i).equals("+") 
							&& pancakes.substring(i, i + 1).equals("-")) {
						result += 2;
					}
				}
				out.println("Case #" + testNum + ": " + result);
				testNum++;
			}
			in.close();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
