package methodEmbedding.Standing_Ovation.S.LYD238;

import java.util.Scanner;


public class StandingOvation {
public static void main(String[] args) {
		
		Scanner user_input = null;
		
		user_input = new Scanner(System.in);
		
		int numberOfCase = user_input.nextInt();
		
		StringBuilder builder = new StringBuilder();
		user_input.nextLine();
		for (int i = 0; i<numberOfCase; i++) {
			String line = user_input.nextLine();
			
			String[] array = line.split(" ");
			int maxShy = Integer.parseInt(array[0]);
			
			int count = 0;
			int currentTotal = 0;
			
			for (int j = 0; j<=maxShy; j++) {
				
				if (currentTotal<j) {
					count += (j-currentTotal);
					currentTotal += (j-currentTotal);
				}
				currentTotal += Character.getNumericValue(array[1].charAt(j));
				
			}
			
			builder.append("Case #" + (i+1) + ": " + count + "\n");
			
		}
		
		System.out.println(builder.toString());
		
	}
}
