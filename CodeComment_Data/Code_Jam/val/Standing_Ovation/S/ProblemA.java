package methodEmbedding.Standing_Ovation.S.LYD1597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

class ProblemA
{
	public static void main(String[] args)
	{
		BufferedReader br=null;
		BufferedWriter bw=null;

		try
		{
			File csvfile = new File("output.txt");

			if(!csvfile.exists())
			{
				csvfile.createNewFile();
			}
			else
			{
				csvfile.delete();
				csvfile.createNewFile();
			}
			
			FileWriter fw = new FileWriter(csvfile.getName(),true);
			bw = new BufferedWriter(fw);
			
			br = new BufferedReader(new FileReader("input.txt"));

			String sCurrentLine=null;
			String[] tempval=null;
			String[] tempval2=null;

			int n=Integer.parseInt(  br.readLine() );
			int i=0;

			while ((sCurrentLine = br.readLine()) != null) 
			{
					i++;

					int required=0;
					int stood=0;
					int maxslevel=0;
					int nppl=0;
					int tempr=0;

					tempval=sCurrentLine.split(" ");

					tempval2=tempval[1].split("");

					maxslevel=Integer.parseInt(tempval[0]);

					if(maxslevel+1==tempval2.length)
					{
						for(int j=0;j<tempval2.length;j++)
						{
							nppl=Integer.parseInt(tempval2[j]);
							
							if(nppl>0)
							{
								
							
								if(stood>=j)
								{
								
								}
								else
								{
									tempr=(j-stood);
									required+=tempr;
									stood+=tempr;
								}
								stood+=nppl;
							}		
						}

						bw.write("Case #"+i+": "+required);
						if(i!=n)
							bw.newLine();
					}
					else
					{
						System.out.println("ERROR");
					}
					
			}
			
			if(i!=n)
				System.out.println("ERROR2");


			
		}	
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
	}
}
