package methodEmbedding.Magic_Trick.S.LYD63;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\OSCAR\\Desktop\\Google Code Jam\\Magic\\output.out");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		String sCurrentLine;
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\OSCAR\\Desktop\\Google Code Jam\\Magic\\input.in"));
		//We load the number of cases
		if((sCurrentLine = br.readLine()) != null) 
		{			
			int n = Integer.parseInt(sCurrentLine);
			for(int i=0; i<n;i++)
			{
				String array1 ="";
				String array2="";
				
				sCurrentLine = br.readLine();
				int answer =Integer.parseInt(sCurrentLine);
				for(int j=0; j<4;j++)
				{
					sCurrentLine = br.readLine();
					if(j==answer-1)
					{
						array1 =sCurrentLine;
					}
					
				}				
						
				sCurrentLine = br.readLine();
				int answer2 =Integer.parseInt(sCurrentLine);
				for(int k=0;k<4;k++)
				{
					sCurrentLine = br.readLine();
					if(k==answer2-1)
					{
						array2=sCurrentLine;
					}					
				}
				int found =0;
				int number =0;
				for(int h=0;h<4;h++)
				{
					
					int one=Integer.parseInt(array1.split(" ")[h]);
					for(int c =0;c<4;c++)
					{
						int two =Integer.parseInt(array2.split(" ")[c]);
						if( one==two )
						{
							found++;
							number=one;
						}
					}
				}
				if(found==0)
				{
					bw.write("Case #"+(i+1)+": Volunteer cheated!\n");
				}
				else if(found==1)
				{
					bw.write("Case #"+(i+1)+": "+ number+"\n");
				}
				else
				{
					bw.write("Case #"+(i+1)+": Bad magician!\n");
				}
				
				
				
				
			}
			
		}

		bw.close();
	}

}
