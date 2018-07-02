package methodEmbedding.Standing_Ovation.S.LYD1442;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main4 {

	public static void main(String[] args) {
		try {

			String output = "";
			
			  String input = FileUtils.readFileToString(new File(
			 "/Users/onuratamer/Desktop/code_jam/A-small-attempt0.in"));
			 
			/*String input = FileUtils.readFileToString(new File(
					"/Users/onuratamer/Desktop/code_jam/A-sample"));
*/
			String[] inputArray = input.split("\n");
			Integer count = new Integer(inputArray[0]);

			for (int i = 1; i < count + 1; i++) {

				String line = inputArray[i];
				String[] numbers = line.split("\\s+");
				Integer maxShyLevel = new Integer(numbers[0].trim());
				List<Integer> audienceList = new ArrayList<Integer>();
				for (int j = 0; j < numbers[1].length(); j++) {
					audienceList.add(new Integer(numbers[1].charAt(j) + ""));
				}

				Integer total = 0;
				Integer extra = 0;
				for (int j = 0; j < maxShyLevel + 1; j++) {
					Integer audience = audienceList.get(j);
					if (audience > 0) {
						if (total >= j) {
							total = total + audience;
						} else {
							extra = extra + j - total;
							total = j + audience;
						}
					}
				}
				output = output + "Case #" + i + ": " + extra + "\n";

			}
			FileUtils.writeStringToFile(new File(
					"/Users/onuratamer/Desktop/code_jam/A-small.out"), output);
			System.out.println(output);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
