package methodEmbedding.Standing_Ovation.S.LYD1980;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
		{
			PrintWriter writer = new PrintWriter(args[1]);
			
			int numOfTestCases = Integer.parseInt(br.readLine());
			for (int i = 1; i <= numOfTestCases; i++){
				int friendsToAdd = 0;
				int audienceStanding = 0;
				
				String[] line = br.readLine().split(" ");
				int maxShyness = Integer.parseInt(line[0]);
				String audience = line[1];
				for (int shyness = 0; shyness <= maxShyness; shyness++) {
					int audienceMembers = Character.getNumericValue(audience.charAt(shyness));
					if (audienceMembers > 0) {
						if (audienceStanding < shyness) {
							int audienceToAdd = shyness - audienceStanding;
							friendsToAdd += audienceToAdd;
							audienceStanding += audienceToAdd;
						}
					}
					audienceStanding += audienceMembers;
				}
				
				writer.println("Case #" + i + ": " + friendsToAdd);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
