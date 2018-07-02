package methodEmbedding.Magic_Trick.S.LYD1649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class _1_Magician {

	private final static String CASE_STRING = "Case #%s: %s";
	private final static String VOLUNTEER_CHEATED = "Volunteer cheated!";
	private final static String BAD_MAGICIAN = "Bad magician!";
	
	private static int testCaseNo = 0;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Test Cases
		int noTestCases = Integer.parseInt(br.readLine());
		String[] results = new String[noTestCases];
		while (noTestCases > 0 && testCaseNo++ < noTestCases) {
			// First
			int firstAns = Integer.parseInt(br.readLine()) - 1;
			int[][] firstArr = new int[4][4];
			ArrayList<Integer> firstRow = new ArrayList<>();
			for (int i = 0; i < 4; i++) {
				String line = br.readLine().trim();
				String[] values = line.split(" ");
				for (int j = 0; j < values.length; j++) {
					int val = Integer.parseInt(values[j]);
					firstArr[i][j] = val;
					if (i == firstAns) {
						firstRow.add(val);
					}
				}
			}
			// Second
			int secondAns = Integer.parseInt(br.readLine()) - 1;
			int[][] secondArr = new int[4][4];
			ArrayList<Integer> secondRow = new ArrayList<>();
			for (int i = 0; i < 4; i++) {
				String line = br.readLine().trim();
				String[] values = line.split(" ");
				for (int j = 0; j < values.length; j++) {
					int val = Integer.parseInt(values[j]);
					secondArr[i][j] = val;
					if (i == secondAns) {
						secondRow.add(val);
					}
				}
			}
			// Result
			String result = null;
			firstRow.retainAll(secondRow);
			if (firstRow.size() == 1) {
				result = String.valueOf(firstRow.get(0));
			}
			else if (firstRow.size() > 1) {
				result = BAD_MAGICIAN;
			}
			else {
				result = VOLUNTEER_CHEATED;
			}
			results[testCaseNo - 1] = String.format(CASE_STRING, testCaseNo, result);
		}
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
	
	
}
