package methodEmbedding.Standing_Ovation.S.LYD1400;

import java.io.*;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) throws IOException {

		PrintWriter writer = new PrintWriter(new FileWriter(new File("StandingOvation.txt")));
		Scanner in = new Scanner(System.in);

		int noCases = in.nextInt();
		
		for (int testCase = 1; testCase <= noCases; testCase++) {

			int noOfFriends=0;
			in.nextLine(); // Move curser to next line
			int maxShyness = in.nextInt();
			String shyness = in.next();
			
			int counter = 0;
			for(int i =0;i<= maxShyness ;i++)
			{
				int noPeople = Integer.parseInt(String.valueOf(shyness.charAt(i))); 
				if(noPeople==0 && counter <= i)
					{
					noOfFriends++;
					counter++;
					}
				else
					counter+=noPeople;	
						
			
			}
			
			System.out.printf("Case #%d: %d\n", testCase, noOfFriends);
			writer.printf("Case #%d: %d\n", testCase, noOfFriends);

		}

		writer.close();
	}
}
