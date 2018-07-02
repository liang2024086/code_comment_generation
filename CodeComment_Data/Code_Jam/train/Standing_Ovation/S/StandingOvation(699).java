package methodEmbedding.Standing_Ovation.S.LYD487;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StandingOvation {

    public static void main(String[] args) {
        
        String base="D:/";
        String in=base + "A-small-attempt1.in";
        String out=base + "output.txt";
                
	    try {
	    	BufferedReader br = new BufferedReader(new FileReader(in));
	        
	        StringBuilder sb = new StringBuilder();
			String newline = System.getProperty("line.separator");
	        String line = br.readLine();
			int total = Integer.parseInt(line);
			int maxSi = 0; int cases = 1;

			for (int c = 0; c < total; c++)
			{
				line = br.readLine();
			    String maxShy [] = line.split("");
				maxSi = Integer.parseInt(maxShy[1]);
				int i = 3; int Pi = 0; int totalPi = 0; int Si = 0; int reqPi = 0; int finalPi = 0; 

				for (int d = 1; d <= maxSi+1; d++)
				{
					Pi = Integer.parseInt(maxShy[i]); //no. of people
					reqPi = Si; // required no. of people					

					
				if (Pi != 0)
				{
					
					if (reqPi == 0)
					{
						totalPi = Pi + totalPi;								
					}
					
					if (reqPi != 0)
					{
						if (reqPi == totalPi)
						{
							totalPi = Pi + totalPi;									
						}

						else if (reqPi != totalPi)
						{
                            if (totalPi < reqPi)
                            {
								finalPi = finalPi + reqPi - totalPi;
								totalPi = reqPi + Pi;										
                            }  
							
							else if (totalPi > reqPi) 
                            {
								totalPi = totalPi + Pi;										
                            }  
						}
					}
				}
					i++; Si++;
				}
				
				sb.append("Case #"+cases+": "+finalPi);
	        	sb.append(newline);
				cases++; 	        					
			
				String output = sb.toString();
		        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	            new FileOutputStream("D:/output.txt"), "utf-8"));
		        writer.write(output);
	            writer.close();
			}
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
	    }
    }
}
