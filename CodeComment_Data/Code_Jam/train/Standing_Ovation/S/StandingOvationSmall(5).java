package methodEmbedding.Standing_Ovation.S.LYD1013;

import java.io.File;
import java.util.Scanner;


/*
 * Author Krishna K
 * 
 */

public class StandingOvationSmall {
	public static void main(String args[])
	{
		Integer testCases = 0;
		Integer sMax;
		String sMembers;
		Integer[] sMembersArray;
		Integer totalStanding;
		Integer maxNeededToStand;
		Integer maxNeededToStandNow = 0;
		Integer count = 0;
		
		File input = new File("2015Inputs/A-small.txt");
		try{
			Scanner in = new Scanner(input);
			if(in.hasNext())
				testCases = in.nextInt();
			while(in.hasNext())
			{
				count++;
				totalStanding = 0;
				maxNeededToStand = 0;
				maxNeededToStandNow = 0;
				sMax = in.nextInt();
				sMembers = in.next();
				
				sMembersArray = new Integer[sMembers.length()];
				for(int i = 0; i < sMembers.length(); i++)
				{
					sMembersArray[i] = Character.getNumericValue(sMembers.charAt(i));
				}
				
				for(int i = 0; i<sMembersArray.length;i++)
				{
					maxNeededToStand = i;
					if(i==0)
					{
						totalStanding = sMembersArray[i];
						
					}
					else
					{
						if(totalStanding < maxNeededToStand)
						{
							maxNeededToStandNow++; 
							totalStanding += sMembersArray[i];
							totalStanding++;
						}
						else
						{
							totalStanding += sMembersArray[i];
						}
					}
					//System.out.println("Total Standing = "+totalStanding +" Members Here is "+sMembersArray[i]+" Max Needed to Stand = "+maxNeededToStand + "Max  Standing Now = "+maxNeededToStandNow);
				}
				System.out.println("Case #"+count+": "+maxNeededToStandNow);
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
}
