package methodEmbedding.Standing_Ovation.S.LYD339;


import java.io.*;

public class StandingOvation {

	public static void main(String Args[]) throws IOException
	{
		try {
			FileInputStream fStream= new FileInputStream("input.txt");
			BufferedReader bReader = new BufferedReader(new InputStreamReader(fStream));
			
			String line;
			int noOfTextCases=0;
			int caseNumber =0;
			
			while ((line = bReader.readLine()) != null)   {
			
				
				if(line.length()==1)
				{
					noOfTextCases = Integer.parseInt(line);
				}
				else
				{
					int sMax = Integer.parseInt(line.substring(0,1));
					caseNumber= caseNumber+1;
					int output =0;
					
					int[] values = new int[sMax+1];
					for(int i=2; i<=(sMax+ 2); i++)
					{
						values[i-2]=Integer.parseInt(line.substring(i,i+1));
					}
					
					for(int j=0;j< values.length; j++)
					{
						int sum=0;
						for(int k=0;k<j;k++)
						{
							sum=sum + values[k];
						}
						
						if(sum < j)
						{
							output= output+ (j-sum);
							values[j]= values[j]+ (j-sum);
						}
					}
					
					System.out.println("Case #"+caseNumber+": "+output);
				}
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
