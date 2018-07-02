package methodEmbedding.Standing_Ovation.S.LYD1855;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class StandingOvation {

	public static List<String> input = new ArrayList<String>();

	public static void main(String[] args) {


		try {   
			Scanner fileScanner;
			try {
				fileScanner = new Scanner(new File("src/A-small-attempt1.in"));

				while (fileScanner.hasNextLine()){
					input.add(fileScanner.nextLine());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			int noTestCase = Integer.parseInt(input.get(0));
			int caseNo = 1;
			BufferedWriter out = new BufferedWriter(new FileWriter("standingOvation.out"));

			while(caseNo <= noTestCase){
				int numFriends = 0;
				String scenario = input.get(caseNo);
				System.out.println(scenario);
				int peopleStanding = Character.getNumericValue(scenario.charAt(2));
				if(peopleStanding == 0){
					numFriends++;
					peopleStanding = numFriends;
				}
				int peopleStartIndex = 0;
				int peopleEndIndex = peopleStanding;
				while(peopleEndIndex <= Character.getNumericValue(scenario.charAt(0))){
					for(int i = peopleStartIndex + 1; i <= peopleEndIndex; i++){
						peopleStanding = peopleStanding + Character.getNumericValue(scenario.charAt(i+2));
					}
					peopleStartIndex = peopleEndIndex;
					peopleEndIndex = peopleStanding;
					if(peopleStartIndex == peopleEndIndex){
						numFriends++;
						peopleStanding++;
						peopleEndIndex++;
					}
				}
				out.write("Case #" + caseNo + ": " + numFriends +"\n");
				caseNo++;
			}
			out.close();
		} catch (IOException e) {}
	}

}
