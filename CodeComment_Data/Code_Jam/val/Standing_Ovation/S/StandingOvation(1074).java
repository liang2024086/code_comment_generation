package methodEmbedding.Standing_Ovation.S.LYD751;

/**
 * Seyitcan Ucin
 */


import java.util.Scanner;
public class StandingOvation {
	
	public static void main(String [] args){
		
		Scanner stdin = new Scanner(System.in);
		
		int numCases = stdin.nextInt();
		
		
		for(int i = 0; i<numCases; i++){
			
			int highestClapping = stdin.nextInt();
			int totalClapping = 0;
			int peopleNeeded = 0;
			String T = stdin.next();
			for(int j = 0; j<highestClapping+1; j++){
				if(T.charAt(j)!=48 && totalClapping<j){
					while(totalClapping!=j){
						peopleNeeded++;
						totalClapping++;
						
					}
				}
				totalClapping+=(T.charAt(j))-48;



				
			}
			System.out.println("Case #" + (i+1) + ": " + peopleNeeded);
			
		}
	}

}
