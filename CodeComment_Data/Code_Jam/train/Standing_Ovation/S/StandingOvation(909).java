package methodEmbedding.Standing_Ovation.S.LYD742;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {
	
	public static void main(String[] args) throws IOException{
		File input = new File("A-small-attempt1.in");
		Scanner sc = new Scanner(input);
		int numCases = sc.nextInt();
		for (int i = 1; i <= numCases; i++){
			int sMax = sc.nextInt();
			String people = sc.next();
			int count = 0;
			int numPeople = Integer.parseInt(people.substring(0,1));
			for (int j = 1; j <= sMax; j++){
				int currS = Integer.parseInt(people.substring(j,j+1));
				if ((currS > 0) && (numPeople < j)){
					count = count+ j - numPeople;
					numPeople = numPeople + count + currS;
					continue;
				}
				numPeople += currS;
			}
			System.out.println("Case #" + i + ": " + count);
		}
		sc.close();
	}
	
}
