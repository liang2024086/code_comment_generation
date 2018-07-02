package methodEmbedding.Magic_Trick.S.LYD320;

import java.io.*;
import java.util.*;

public class MagicTrickMain {

	public static void main(String[] args)
	{
		String filename = args[0];
		
		FileReader fr = null;
        BufferedReader br = null;
      
        try {
        	fr = new FileReader (filename);
            br = new BufferedReader(fr);
          
    		String line = br.readLine();
    		int indexTrickCurrTrial = 1;
    		int indexTrickCurrRow = 0;
    		int countTricks = Integer.parseInt(line);
    		
    		boolean firstTrick = true;
    		int rowNumber1 = 0;
    		int rowNumber2 = 0;
    		int rowNumber3 = 0;
    		int rowNumber4 = 0;
    		
    		int firstSecondNumberMatchCount = 0;
    		int firstSecondNumberMatched = 0;
    		int indexTrickSelRow = 0;
            
            while ((line = br.readLine()) != null)
    		{	
    			switch (indexTrickCurrRow)
    			{
    			case 0:
    				indexTrickSelRow = Integer.parseInt(line);
    				break;
    				
    			default:
    				if (indexTrickCurrRow == indexTrickSelRow)
    				{
    					if (firstTrick)
    					{
    						StringTokenizer st = new StringTokenizer(line, " ");
    						rowNumber1 = Integer.parseInt(st.nextToken());
    						rowNumber2 = Integer.parseInt(st.nextToken());
    						rowNumber3 = Integer.parseInt(st.nextToken());
    						rowNumber4 = Integer.parseInt(st.nextToken());
    					}
    					else
    					{
    						StringTokenizer st = new StringTokenizer(line, " ");
    						while (st.hasMoreTokens())
    						{
    							int rowNumber = Integer.parseInt(st.nextToken());
    							if (rowNumber == rowNumber1)
    							{
    								firstSecondNumberMatchCount++;
    								firstSecondNumberMatched = rowNumber;
    							}
    							if (rowNumber == rowNumber2)
    							{
    								firstSecondNumberMatchCount++;
    								firstSecondNumberMatched = rowNumber;
    							}
    							if (firstSecondNumberMatchCount >= 2)
    								break;
    							
    							if (rowNumber == rowNumber3)
    							{
    								firstSecondNumberMatchCount++;
    								firstSecondNumberMatched = rowNumber;
    							}
    							if (rowNumber == rowNumber4)
    							{
    								firstSecondNumberMatchCount++;
    								firstSecondNumberMatched = rowNumber;
    							}
    							if (firstSecondNumberMatchCount >= 2)
    								break;
    						}
    						
    						if (firstSecondNumberMatchCount == 0)
    							System.out.println("Case #" + indexTrickCurrTrial + ": Volunteer cheated!");
    						else if (firstSecondNumberMatchCount == 1)
    							System.out.println("Case #" + indexTrickCurrTrial + ": " + firstSecondNumberMatched);
    						else
    							System.out.println("Case #" + indexTrickCurrTrial + ": Bad magician!");
    					}
    				}
    				break;
    			}
    			indexTrickCurrRow++;
    			
    			// 4x4 magic trick has been completed
    			if (indexTrickCurrRow > 4)
    			{
    				indexTrickCurrRow = 0;
    				if (!firstTrick)
    				{
    					// prepare for first trial
    					indexTrickCurrTrial++;
    					firstSecondNumberMatchCount = 0;
    					firstSecondNumberMatched = 0;
    					indexTrickSelRow = 0;
    				}
    				firstTrick = !firstTrick;
    			}
    		}           
          
        } catch (FileNotFoundException ex) {
        	// exception handling
        } catch (IOException ex) {
        	// exception handling
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                // exception handling
            }
        }
		
		
	}

}
