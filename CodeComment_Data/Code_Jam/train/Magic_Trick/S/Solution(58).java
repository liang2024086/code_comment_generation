package methodEmbedding.Magic_Trick.S.LYD1943;


import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		String inputFile = "/Users/ankushgupta/Downloads/A-small-attempt0.in";
		String outputFile = "/Users/ankushgupta/Downloads/output";
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		int numberOfTestCases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= numberOfTestCases; i++) {
			HashSet<String> stringHash = new HashSet<String>();
			String match = " ";
			Boolean matchFound = false;
			Boolean doubleMatch = false;
			int ans1 = Integer.parseInt(reader.readLine());
			for (int j = 1; j <= 4; j++) {
				if (j == ans1) {
					String[] arr1 = reader.readLine().split(" ");
					for (int k = 0; k < 4; k++)
						stringHash.add(arr1[k]);
				} else
					reader.readLine();
			}
			int ans2 = Integer.parseInt(reader.readLine());
			for (int j = 1; j <= 4; j++) {
				if (j == ans2) {
					String[] arr2 = reader.readLine().split(" ");
					for (int k = 0; k < 4; k++) {
						if (stringHash.contains(arr2[k])) {
							if (matchFound) {
								doubleMatch = true;
								break;
							}
							matchFound = true;
							match = arr2[k];
						}
					}
				} else
					reader.readLine();
			}
			if (doubleMatch)
				writer.write("Case #" + i +": " + "Bad magician!\n");
			else if (!matchFound)
				writer.write("Case #" + i +": " + "Volunteer cheated!\n");
			else 
				writer.write("Case #" + i +": " + match +"\n");
		}
		reader.close();
		writer.close();
	}
}
