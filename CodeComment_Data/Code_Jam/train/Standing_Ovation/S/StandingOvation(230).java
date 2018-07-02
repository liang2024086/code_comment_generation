package methodEmbedding.Standing_Ovation.S.LYD1119;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StandingOvation {
	
	public static void main(String[] args) {
		// Template starts here
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input"));
			int numTestCase = Integer.valueOf(br.readLine());
			for(int testCase=1; testCase<=numTestCase; testCase++)
			{
				System.out.print("Case #" + testCase + ": ");
				
				// Read each test case
				String[] qArray = br.readLine().split(" ");
				// Do you need to use long or double?
				int maxShyness = Integer.valueOf(qArray[0]);
				String numPeople = qArray[1];				
				
				int numTotalNeedToInvite = 0;
				int numCurrentStanding = 0;
				// Logic goes here
				for(int currentShyness=0; currentShyness<=maxShyness; currentShyness++)
				{					
					int numNeedToInvite = currentShyness - numCurrentStanding;
					if(numNeedToInvite > 0)
					{
						numTotalNeedToInvite += numNeedToInvite;
						numCurrentStanding += numNeedToInvite;
					}
					int numPeopleWithCurrentShyness = Character.getNumericValue(numPeople.charAt(currentShyness));
					numCurrentStanding += numPeopleWithCurrentShyness;
				}
				
				// Print output
				System.out.println(numTotalNeedToInvite);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Template ends here
	}
	
}
