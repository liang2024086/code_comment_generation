package methodEmbedding.Standing_Ovation.S.LYD312;

import java.io.File;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception
	{
		//InputFilePath
		//String filePath="D://Eclipse//CodeJam//src//CodeJam_2015//TestInput.txt";
		String filePath="D://Eclipse//CodeJam//src//CodeJam_2015//A-small-attempt2.in";
		
		Scanner sc=new Scanner(new File(filePath));
	
		int TestCases=sc.nextInt();
		
		for(int currentCase=0;currentCase<TestCases;currentCase++)
			{
				int maxShyness=sc.nextInt();
				String audiance=sc.next();
				
				int standingPeople=0;
				int needPeople_Total=0;
				for(int shyness=0;shyness<=maxShyness;shyness++)
				{
					int noOfPeopleAtCurrentShyness=Character.getNumericValue(audiance.charAt(shyness));
					
					int needPeople_Current=0;
					
					if(standingPeople<shyness)
					{
					    needPeople_Current=shyness-standingPeople;
						needPeople_Total+=needPeople_Current;
						
					}
					standingPeople+=noOfPeopleAtCurrentShyness+needPeople_Current;
	
				}
				
				System.out.format("Case #%d: %d\n", currentCase+1, needPeople_Total);
			}
		
	}

}
