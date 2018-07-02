package methodEmbedding.Standing_Ovation.S.LYD1220;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Ritesh1690
 *
 */
public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Reader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		try {
			// get no. of testcases
			int testCaseNo = Integer.parseInt(b.readLine());
			int[] extraPeopleCount = new int[testCaseNo];
			int index = 0;
			// for each testcase find extra people needed to make all audience clap.
			while (testCaseNo != 0) {
				String StrList = b.readLine();
				String[] splitList = StrList.split(" ");
				int shyMax = Integer.parseInt(splitList[0]);
				int[] noOfAudianceList = new int[shyMax + 1];
				int standUpCount = 0;
				for (int i = 0; i < splitList[1].length(); i++) {
					noOfAudianceList[i] = Integer.parseInt(Character
							.toString(splitList[1].charAt(i)));
				}
				if (noOfAudianceList[0] != 0) {
					standUpCount = noOfAudianceList[0];
				}
				for (int i = 1; i < noOfAudianceList.length; i++) {
					if (noOfAudianceList[i] != 0) {
						if (i > standUpCount) {
							extraPeopleCount[index] = extraPeopleCount[index]
									+ (i - standUpCount);
							standUpCount = standUpCount + (i - standUpCount);
						}
						standUpCount += noOfAudianceList[i];
					}
				}
				index++;
				testCaseNo--;
			}

			for (int k = 0; k < extraPeopleCount.length; k++) {
				System.out.println("Case #" + (k + 1) + ": "
						+ extraPeopleCount[k]);
			}

		} catch (Exception e) {
			System.out.println("invalid inputs !!! \n"+ e.getMessage());
		} 

	}
}
