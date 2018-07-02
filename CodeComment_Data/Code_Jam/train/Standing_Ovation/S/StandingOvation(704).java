package methodEmbedding.Standing_Ovation.S.LYD2015;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {
	StandingOvation(String fileName, String outputFileName){
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName));
			int noOfCases = Integer.valueOf(in.readLine());
			for(int caseNo = 0; caseNo < noOfCases; caseNo++){
				String caseData = in.readLine();
				int stopIndex = caseData.indexOf(" ");
				int maxShyness = Integer.valueOf(caseData.substring(0, stopIndex));
				char[] charArr =caseData.substring(stopIndex+1).toCharArray();
				int curTotal = 0;
				int totalNeeded = 0;
				for(int curShy = 0; curShy <= maxShyness; curShy++){

					int curValue = Character.digit(charArr[curShy],10);
					if(curTotal < curShy){
						totalNeeded += curShy - curTotal;
						curTotal+=curShy - curTotal;
					}
					curTotal+=curValue;
				}
				out.write("Case #" + (caseNo+1) + ": " + totalNeeded);
				out.newLine();
			}
			in.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		StandingOvation createObject = new StandingOvation("A-small-attempt0.in","A-small-attempt0.out");
	}
}
