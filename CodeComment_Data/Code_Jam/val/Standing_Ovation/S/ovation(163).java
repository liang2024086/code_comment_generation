package methodEmbedding.Standing_Ovation.S.LYD1687;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ovation {

	public static void main(String[] args) {

		/*
		 * Takes Standard input from the standard in and appends it to a string
		 * called mp3String for further processing
		 */

		int numCases = 0;
		int k = 0;
		List<String> caseList = new ArrayList<String>();
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			numCases = Integer.parseInt(br.readLine());
			while (k < numCases) {
				caseList.add(br.readLine());
				k++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<Integer> Smax = new ArrayList<Integer>();
		List<Integer> minInviteeList = new ArrayList<Integer>();
		List<String> audienceShyness = new ArrayList<String>();

		for (String testCase : caseList) {
			Smax.add(Integer.parseInt(Character.toString(testCase.charAt(0))));
			audienceShyness.add(testCase.substring(2, testCase.length()));

		}
		
		int minInvitees = 0;

		for (int i = 0; i < audienceShyness.size(); i++) {
			minInvitees=0;
			for (int j = 0; j <= Smax.get(i); j++) {
				int sumPrevious = 0;
				if (j > 0) {
					for (int count = 0; count<j;count++){
					sumPrevious += Integer.parseInt(Character
							.toString(audienceShyness.get(i).charAt(count)));
					}
					sumPrevious += minInvitees;
					if (sumPrevious < j) {
						minInvitees++;
					}
					
				}
				
			}
			minInviteeList.add(minInvitees);
		}

		for (int i = 0; i < minInviteeList.size(); i++) {
			System.out.println("Case #" + (i + 1) + ": "
					+ minInviteeList.get(i));
		}
	}
}
