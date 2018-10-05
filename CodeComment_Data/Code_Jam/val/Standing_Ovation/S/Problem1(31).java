package methodEmbedding.Standing_Ovation.S.LYD1477;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;



public class Problem1 {
	
	public static final int MAX_K = 1000;
	
	public static void main(String[] args) throws IOException{
		
		int cases, sMax;
		int[] k = new int[MAX_K];
		
		//IO utilities
		Scanner reader = new Scanner(new File("A-small-attempt0.in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("Problem1_output.txt"));
		
		cases = reader.nextInt();
		
		for(int i=0;i<cases;i++)
		{
			int friendsNeeded = 0;
			int audienceStanding = 0;
			reader.nextLine();
			sMax = reader.nextInt();
			String shyness = reader.next();
			
			for(int j=0;j<=sMax;j++)
			{
				k[j] = Integer.valueOf(shyness.substring(j, j+1));
				if((friendsNeeded + audienceStanding) < j) friendsNeeded += j - (friendsNeeded + audienceStanding);
				audienceStanding += k[j];
			}
			
			writer.write("Case #" + (i + 1) + ": " + friendsNeeded + "\n");
			
		}
		
		writer.close();
		
		
	}
}
