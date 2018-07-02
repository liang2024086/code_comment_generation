package methodEmbedding.Standing_Ovation.S.LYD1429;


import java.util.Scanner;

public class StandingOvation {

	
	public static void main(String...args) {
		
		Scanner reader = new Scanner(System.in);
		int caseCount = Integer.parseInt(reader.nextLine());
		
	
		//for each use case
		for(int caseId = 0; caseId < caseCount; caseId++) {
			
			int missing = 0;
			int length = reader.nextInt() + 1;
			
			
			String audience = reader.nextLine().trim();
			
			assert(length == audience.length());
			
			
			//for each level in the audience
			int sum = 0;
			for(int level = 0; level < length; level++) {
				
				
				int cur = audience.charAt(level) - 48;
				
				if(sum < level) {
					
					missing++;
					sum++;
					
				}
				
				sum += cur;
			}
			
			
			
			
			System.out.println("Case #"+ (caseId + 1) + ": "+ missing);
		}
	}
	
}
