package methodEmbedding.Standing_Ovation.S.LYD1738;

import java.util.Scanner;


public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// reading
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		int Smax;
		String[] line;
		int[] shy;
		for(int casenb=1; casenb<=T; casenb++){
			line = scan.nextLine().split("\\s+");
			Smax = Integer.parseInt(line[0]);
			
			// doing
			shy = new int[Smax+1];
			for(int i=0; i<Smax+1; i++){
				shy[i] = Character.getNumericValue(line[1].charAt(i));
			}
			
			int[] partialSum = new int[Smax+2];
			for(int i=1; i<Smax+2; i++){
				partialSum[i] = partialSum[i-1] + shy[i-1]; 
			}
			
			int maxDiff = 0;
			
			for(int k=0; k<=Smax; k++){
				maxDiff = Math.max(maxDiff, k-partialSum[k]);
			}
			
			// printing
			System.out.println("Case #"+casenb+": "+maxDiff);
		}
		
	}

}
