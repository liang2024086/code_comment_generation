package methodEmbedding.Standing_Ovation.S.LYD524;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("A-small-attempt2.in"));

		int numberRuns = file.nextInt();
		for(int j = 0; j< numberRuns ; j++){

			int up = 0;
			int guests = 0;
			int neededStanding = file.nextInt();
			String data = file.next();
			for (int i = 0; i <= neededStanding; i++){
				up += Character.getNumericValue(data.charAt(i));
				while (up< (i +1)){
					guests++;
					up++;
				}
			}
			System.out.println("Case #" + (j+1) + ": " + guests);
		}
		
	}
}
