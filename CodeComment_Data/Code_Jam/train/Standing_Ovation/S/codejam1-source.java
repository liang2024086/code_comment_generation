package methodEmbedding.Standing_Ovation.S.LYD303;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		int numCases = Integer.parseInt(stdin.nextLine());
		for (int i = 0; i < numCases; i++){
			String[] line = stdin.nextLine().split(" ");
			int maxShy = Integer.parseInt(line[0]);
			String[] audiencePre = line[1].split("");
			int[] audience = new int[maxShy + 1];
			for (int j = 0; j <= maxShy; j++){
				audience[j] = Integer.parseInt(audiencePre[j]);
			}
			int spot = 0;
			int numFriends = 0;
			int numStanding = 0;
			//System.out.println(audience);
			while (spot < maxShy + 1) {
				if (numStanding < spot) {
					numFriends++;
					numStanding++;
				}
				numStanding += audience[spot];
				spot++;
			}
			System.out.println("Case #" + (i + 1) + ": " + numFriends);
		}
        /*while (stdin.hasNext()) {
            System.out.println(stdin.nextLine());
            
        }*/
	}
}
