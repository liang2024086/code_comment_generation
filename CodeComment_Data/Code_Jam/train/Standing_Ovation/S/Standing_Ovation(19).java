package methodEmbedding.Standing_Ovation.S.LYD1014;

import java.util.Scanner;


/**
 * Standing Ovation
 * @author N8 Stewart
 * Google Code Jam 2015
 */
public class Standing_Ovation {

	public static void main(String[] args){
		
		// Console input
		Scanner in = new Scanner(System.in);
		
		// Grab the number of cases from the console
		int num_cases = in.nextInt();
		
		// Loop through every case
		for (int i = 0; i < num_cases; i++){
			
			// Grab the max shyness and shyness counts
			int max_shyness = in.nextInt();
			char shyness_counts[] = in.next().toCharArray();
			
			// Record the current number of people standing and the number of friends needed
			int standing = 0;
			int friends = 0;
			
			// Loop through all shyness levels
			for (int current_level = 0; current_level < max_shyness + 1; current_level++){
				
				// Test if num standing < shyness level
				if(standing < current_level){
					friends += current_level - standing; // increment friends based on the number needed
					standing = current_level + (int)shyness_counts[current_level] - 48; // friends + standing == current_level
				}else{
					standing += (int)shyness_counts[current_level] - 48; // Add current shyness onto num standing
				}
				
				
			}
			
			System.out.println("Case #" + (i + 1) + ": " + friends);
			
		}
		
		in.close();
		
	}
	
}
