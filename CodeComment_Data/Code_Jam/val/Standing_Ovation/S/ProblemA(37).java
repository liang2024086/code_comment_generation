package methodEmbedding.Standing_Ovation.S.LYD2026;

import java.awt.font.NumericShaper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ProblemA {
	
	public static void main (String[] args) {
		try {
			
			String testFile = "A-small-attempt1.in";
			String localF = "PA.in";
			FileReader fr = new FileReader(testFile);
			BufferedReader br = new BufferedReader(fr);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("PA.out"));
			
			int numberOfTestCases = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < numberOfTestCases; i++) {
				String line = br.readLine();
				int maxShyLevel = Integer.parseInt(line.split(" ")[0]);
				char[] shyPeople = line.split(" ")[1].toCharArray();
				
				int needXPeople = 0;
				int haveXPeople = 0;
				int needXMorePeople = 0;
				
				int totalPeopleToAdd = 0;
				
				for (int j = 0; j <= maxShyLevel; j++) {
					int c = Integer.parseInt(shyPeople[j] + "");
					needXPeople = j;
					if (needXPeople - haveXPeople >= 0) {
						needXMorePeople = needXPeople - haveXPeople;
					} else {
						needXMorePeople = 0;
					}
					
					
					if (needXMorePeople > 0) { // dont need to add more people for this level
						totalPeopleToAdd += needXMorePeople;
					}
					
					haveXPeople = haveXPeople + c + needXMorePeople;
					System.out.println(needXPeople + " " + haveXPeople + " " + needXMorePeople);
				}
				System.out.println();
				String caseNumber = (i+1) + "";
				String output = "Case #" + caseNumber + ": " + totalPeopleToAdd + "\r\n";
				bw.write(output);
			}
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
