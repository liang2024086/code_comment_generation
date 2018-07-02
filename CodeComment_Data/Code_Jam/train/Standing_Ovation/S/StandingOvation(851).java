package methodEmbedding.Standing_Ovation.S.LYD1800;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) throws NoSuchElementException {
		InputData input = new InputData(System.in);
		List<String> inputCases = input.getLines();
		List<String> outputCases = new ArrayList<String>();
		
		for (String line : inputCases) {
			Scanner lineScanner = new Scanner(line);
			int sMax = Integer.parseInt(lineScanner.next());
			String shyness = lineScanner.next(); //String representing audience member shyness
			int extras = 0; //running total of those I need to invite.
			int standing = 0; //running total of those already standing.
			for (int i = 0; i <= sMax; i++) {
				int count = shyness.charAt(i) - '0';
				int deficit = i - standing;
				if (deficit > 0) { //more people needed
					extras += deficit;
					standing += deficit;
				}
				standing += count; //shyness defeated!
			}
			outputCases.add("" + extras);
		}
		
		for (int i = 0; i < outputCases.size(); i++) {
			System.out.println("Case #" + (i+1) + ": " + outputCases.get(i));
		}
	}

}
