package methodEmbedding.Standing_Ovation.S.LYD997;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StandingOvation {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//String filenameInput = "A-sample.in";
		//String filenameOutput = "A-sample.out";
		
		String filenameInput = "A-small-attempt0.in";
		String filenameOutput = "A-small-attempt0.out";

		Class currentClass = StandingOvation.class;
		try {

			String path = "src/"
					+ currentClass.getPackage().getName().replace(".", "/");
			BufferedReader input = new BufferedReader(new FileReader(new File(
					path + "/" + filenameInput)));
			BufferedWriter output = new BufferedWriter(new FileWriter(new File(
					path + "/" + filenameOutput)));
			int numOfTestcases = Integer.parseInt(input.readLine());
			// System.out.println("Number of Testcases: " + numOfTestcases);
			for (int i = 0; i < numOfTestcases; i++) {
				System.out.println("Testnumber : " + i);
				int friendsToInvite = 0;
				String[] inputStringArray = input.readLine().split(" ");
				int lenghtOfString = Integer.parseInt(inputStringArray[0])+1;
				String audienceMembersByShyness = inputStringArray[1];
				if(audienceMembersByShyness.length() != lenghtOfString){
					throw new RuntimeException("expected String to have length " + lenghtOfString + " but String was: " + audienceMembersByShyness);
				}
				int peopleStanding = 0;
				for(int j = 0;j<lenghtOfString;j++){
					int peopleStandingUp = audienceMembersByShyness.charAt(j)-'0';
					//System.out.println("people already standing: " + peopleStanding);
					//System.out.println(peopleStandingUp + " people need " +j+ " people standing before them");
					if(peopleStanding < j){
						int numberOfAdditionalFriendsToInvite = j - peopleStanding;
						//System.out.println("people to invite" + numberOfAdditionalFriendsToInvite);
						peopleStandingUp += numberOfAdditionalFriendsToInvite;
						friendsToInvite += numberOfAdditionalFriendsToInvite;
					}
					//System.out.println("peopleStandingUp now: "+peopleStandingUp);
					peopleStanding += peopleStandingUp;
				}
				
				
				int result = friendsToInvite;
				
				String outputString = "Case #"
						+ (i + 1)
						+ ": "
						+ result;
				System.out.println(outputString);

				if (i + 1 != numOfTestcases) {
					outputString += "\n";
				}
				output.write(outputString);

			}

			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
