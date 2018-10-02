package methodEmbedding.Standing_Ovation.S.LYD1098;


import java.io.*;
import java.util.*;

public class StandingOvation {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new FileReader("A-sample.in"));
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		//BufferedReader br = new BufferedReader(new FileReader("A-large.in"));
		
		//File file = new File("A-sample.out");
		File file = new File("A-small.out");
		//File file = new File("A-large.out");
		
		if(!file.exists()) file.createNewFile();
		FileWriter fw = new FileWriter(file.getAbsolutePath());
		BufferedWriter bw = new BufferedWriter(fw);
		
		int numberOfCases = Integer.parseInt(br.readLine());
		for(int caseNum = 1; caseNum <= numberOfCases; caseNum++) {
			
			int numOfStandings = 0;
			int numOfFriends = 0;
			
			String[] setup = br.readLine().split(" ");
			int maxShyness = Integer.parseInt(setup[0]);
			int[] audiences = new int[maxShyness+1];
			
			for(int i = 0; i <= maxShyness; i++) {
				if(numOfStandings < i) {
					int diff = i - numOfStandings;
					numOfFriends += diff;
					numOfStandings += diff;
				}
				numOfStandings += Character.getNumericValue(setup[1].charAt(i));;
			}

			String output = "Case #" + caseNum + ": " + numOfFriends + "\n";
			System.out.println(output);
			bw.write(output);
		}
		
		bw.close();
	}

}
