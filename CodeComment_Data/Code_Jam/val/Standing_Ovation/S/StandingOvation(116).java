package methodEmbedding.Standing_Ovation.S.LYD766;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

class StandingOvation
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = null;
		File file = new File("G:\\output1.txt");
		
		if (!file.exists())
		{
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
 
		br = new BufferedReader(new FileReader("G:\\input1.txt"));
		
		String sCurrentLine=br.readLine();
		int t=Integer.parseInt(sCurrentLine);
		
		for(int k=1;k<=t;k++)
		{
			String str[]=br.readLine().split(" ");
			int n=Integer.parseInt(str[0]);
			n++;
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(str[1].charAt(i)+"");
			}
			
			if(n==1)
			{
				String content="Case #"+k+": 0";
				bw.write(content);
				bw.write("\n");
			}
			else
			{
				int counter=0;
				int ans=0;
				for(int i=1;i<n;i++)
				{
					counter+=a[i-1];
					if(a[i]!=0)
					{
						if(counter<i)
						{
							int diff=i-counter;
							counter+=diff;
							ans+=diff;
						}
					}
				}
				
				String content="Case #"+k+": "+ans;
				bw.write(content);
				bw.write("\n");
			}
		}
		bw.close();
	}
}
