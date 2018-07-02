package methodEmbedding.Standing_Ovation.S.LYD295;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		FileReader reader = new FileReader("D:/Google.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		PrintWriter writer = new PrintWriter("D:/Output.txt");
		int numberOfCases = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < numberOfCases; i++) {
			String caseLine = bufferedReader.readLine();
			String[] caseArray = caseLine.split(" ");
			int maxShyness = Integer.parseInt(caseArray[0]);
			char[] shynessNumbers = caseArray[1].toCharArray();
			int numberToAdd = 0;
			int standingPeople = 0;
			for(int j= 0 ; j <= maxShyness ; j++){
				if(standingPeople >= j){
					standingPeople += Character.getNumericValue(shynessNumbers[j]);
				}
				else{
					while(standingPeople < j){
						numberToAdd++;
						standingPeople++;
						standingPeople += Character.getNumericValue(shynessNumbers[j]);
					}
					
				}
			}
			writer.println("Case #" + (i+1) + ": " + numberToAdd);
		}
		writer.close();
	}
}
