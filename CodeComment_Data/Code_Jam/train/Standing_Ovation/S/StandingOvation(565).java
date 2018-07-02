package methodEmbedding.Standing_Ovation.S.LYD136;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class StandingOvation {
	public StandingOvation(String fileName) {
		try {
			FileReader dataFile = new FileReader(fileName);
			BufferedReader bufferedDataFile = new BufferedReader(dataFile);
			PrintWriter out = new PrintWriter("output.txt");
			
			int numLine = Integer.parseInt(bufferedDataFile.readLine());
			for (int i = 0; i < numLine; i++) {
				int totalInvite = 0;
				int totalStoodUp = 0;
				
				String[] currentLine = bufferedDataFile.readLine().split(" ");
				int maxShy = Integer.parseInt(currentLine[0]);
				String audience = currentLine[1];
			
				for (int j = 0; j <= maxShy; j++) {
					int currentShyNo = Integer.parseInt(Character.toString(audience.charAt(j)));
					if (currentShyNo != 0) {
						if (totalStoodUp >= j) {
							totalStoodUp += currentShyNo;
						} else {
							while (totalStoodUp < j) {
								totalStoodUp++;
								totalInvite++;
							}
							totalStoodUp += currentShyNo;
						}
					}
				}
				
				int number = i+1;
				String resultCase = "Case #" + number + ": " + totalInvite;
				out.println(resultCase);
			}
			bufferedDataFile.close();
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		StandingOvation task1 = new StandingOvation("A-small-attempt2.in");
	}
}
