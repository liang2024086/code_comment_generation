package methodEmbedding.Standing_Ovation.S.LYD2138;

import java.util.Scanner;

public class a {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int numTestCases = sc.nextInt();
		
		for (int i = 1; i <= numTestCases; i++){
			int numFriendsToInvite = 0;
			int sizeOfArray = sc.nextInt();
			String audience = sc.next();
			int numApplauding = 0;			
			int[] ovationArray = new int[sizeOfArray + 1];
			
			for (int j = 0; j < audience.length(); j++){
				ovationArray[j] = Character.getNumericValue(audience.charAt(j));
			}
			
			for (int k = 0; k < ovationArray.length; k++){				
				if(numApplauding + numFriendsToInvite < k){					
					numFriendsToInvite++;
				}				
				numApplauding += ovationArray[k];				
			}			
			System.out.println("Case #" + i + ": " + numFriendsToInvite);
		}
	}
}
