package methodEmbedding.Standing_Ovation.S.LYD723;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int numCases = scanner.nextInt();
		
		for(int i = 0; i < numCases; i++){
			int standing = 0;
			int needed = 0;
			int sMax = scanner.nextInt();
			int[] sLevel = new int[sMax + 1];
			String people = scanner.nextLine().trim();
			
			for(int j = 1; j <= sLevel.length; j++){
				sLevel[j - 1] = Integer.parseInt(people.substring(j - 1, j));
			}
			
			for(int j = 0; j < sLevel.length; j++){
				if(standing >= j){
					standing += sLevel[j];
				}else{
					needed++;
					standing++;
					j--;
				}
			}
			
			System.out.println("Case #" + (i+1) + ": " + needed);
		}
		
		scanner.close();
		
	}

}
