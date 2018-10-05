package methodEmbedding.Standing_Ovation.S.LYD186;

import java.io.*;

public class Problem1 
{
	static int T;
	static int iHave,iNeed,idx;
	static String s;


	//main method for reading input for text files
	public static void main(String[] args) throws FileNotFoundException
	{
		BufferedReader br = null;
		
		try{
				br = new BufferedReader(new FileReader("C:\\temp.txt"));
				String currentLine;
				int lineNo = 1;
				int num = -1;
				while((currentLine = br.readLine()) != null)
				{
					num +=1;
					String firstLine;
					if(lineNo == 1)
					{
						firstLine = currentLine;
						lineNo = 2;
					T = Integer.parseInt(firstLine);	
					}
					
					else if(lineNo == 2)
					{
						currentLine = currentLine.replaceAll("\\s+","");
						currentLine = currentLine.substring(1,currentLine.length() );
						iHave = 0;
						iNeed = 0;
						idx = 1;
						s = currentLine.substring(0,1);
						while(s != "")
						{
							if((idx > iHave) && (Integer.parseInt(s)> 0))
							{
								iNeed += ((idx -1)-iHave);
								iHave += ((idx-1)-iHave);
							}
							iHave += Integer.parseInt(s);
							if(currentLine.length() >= idx+1)
							{
								s= currentLine.substring(idx, idx+1);
							}
							else
							{
								s = "";
							}
							
							idx++;
						}
						
						
						
						
						
						
						System.out.println("Case #"+num+": "+ iNeed);
					}
					
				}
				
				
				
			
		} 
		
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try{ 
				if(br != null)
				{
					br.close();
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
		           
        
        
	}
	
	
}
