package methodEmbedding.Standing_Ovation.S.LYD53;


import googlecodejam.lirao.yr2014.TextReadWriter;

import java.util.ArrayList;
import java.util.List;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2){
			System.out.println("input and output file name required");
			return;
		}
		
		List<String> inputStrings = TextReadWriter.Reader(args[0]);
		List<String> resultStrings = new ArrayList<>();
		int testSize = Integer.parseInt(inputStrings.get(0));
		
				
		for (int t=1; t<=testSize; t++){
			String result = null;
			//preparing the input		
			String[] originalRow = inputStrings.get(t).split("\\s+");
			int maxShyness = Integer.parseInt(originalRow[0]);
			char[] peopleCharArr = originalRow[1].toCharArray();
			int[] peopleArr = new int[maxShyness+1];
			for (int i = 0; i<=maxShyness;i++){					
				peopleArr[i]= Character.getNumericValue(peopleCharArr[i]);
			}
			
			int clapperCount = 0;	//The current people standing
			int friendNeeded = 0;	//Cumulative count of number of people added 

			for (int i=0; i<=maxShyness; i++)
			{
				//Check the init clapper
				int candidate = peopleArr[i];
				if (clapperCount<i)
				{
					//If the number of current clappers is not enough to kickstart this group, 
					//fill in the rest with friends
					//where friend is of at most index-1 shyness
					friendNeeded += i-clapperCount;
					clapperCount += i-clapperCount;
				}
				clapperCount+=candidate;
				//System.out.println("Case #"+t+": "+clapperCount);
			}
			
			//Output String
			resultStrings.add("Case #"+t+": "+friendNeeded);
		}
		TextReadWriter.Writer(resultStrings, args[1]);
		
	}	
	
}
