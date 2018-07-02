package methodEmbedding.Standing_Ovation.S.LYD2113;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			File file = new File("src/input.txt");
			scanner = new Scanner(file);
			
			int testCount = Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < testCount; i++) {
				String[] inputs = scanner.nextLine().split(" ");
				int maxShyness = Integer.parseInt(inputs[0]);
				String audienceStr = inputs[1];
				int friendCount = 0;
				int newFriendCount = 0;
				int standingCount = Character.getNumericValue(audienceStr.charAt(0));
				for (int j = 1; j <= maxShyness; j++) {
					int audienceAtj = Character.getNumericValue(audienceStr.charAt(j));
					if(standingCount < j && audienceAtj != 0){
						newFriendCount = j - standingCount;
						standingCount += newFriendCount;
						friendCount += newFriendCount;
					}
					standingCount += audienceAtj;
					
				}
				
				System.out.println("Case #"+(i+1)+": "+friendCount);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			if(scanner != null){
				scanner.close();
			}
		}
	}
}
