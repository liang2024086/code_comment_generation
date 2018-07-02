package methodEmbedding.Standing_Ovation.S.LYD160;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StandingOvationA {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
		String s = br.readLine();
		int testCases = Integer.parseInt(s);
		ArrayList<Integer> additionalP = new ArrayList<>(); 
		int numOfPeopleStanding = 0;
		int additionalPeople = 0;
		int additionalPeopleThisRound = 0;
		
		for (int j=0;j<testCases;j++){
			s = br.readLine();
			String[] input = s.split(" ");
			numOfPeopleStanding = 0;
			additionalPeople = 0;
			additionalPeopleThisRound = 0;
			int maxShyness = Integer.parseInt(input[0]);
			for (int i=0;i<=maxShyness;i++){
				int peopleWithIShyness=Character.getNumericValue(input[1].charAt(i));
				if (numOfPeopleStanding>=i) numOfPeopleStanding+=peopleWithIShyness;
				else {
					additionalPeopleThisRound=i-numOfPeopleStanding;
					additionalPeople+=additionalPeopleThisRound;
					numOfPeopleStanding+=additionalPeopleThisRound+peopleWithIShyness;
				}
			}
			additionalP.add(additionalPeople);
		}
		PrintWriter writer = new PrintWriter("output.txt");
		for (int i=0;i<additionalP.size();i++){
			testCases = i+1;
			writer.println("Case #"+testCases+": "+additionalP.get(i));
		}
		writer.close();
		
	}
}
