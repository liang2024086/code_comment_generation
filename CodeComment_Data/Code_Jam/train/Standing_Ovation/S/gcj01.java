package methodEmbedding.Standing_Ovation.S.LYD608;

import java.util.*;
import java.io.*;

class gcj01
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("input1.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("output1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		int t=Integer.parseInt(br.readLine());
		for(int j=1;j<=t;j++)
		{
			String in[]=br.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			long people_standing=0;
			long people_required=0;
			for(int i=0;i<=n;i++)
			{
				int x=in[1].charAt(i)-48;
				if(x!=0)
				{
					if(people_standing<i)
					{
						long temp=i-people_standing;
						people_required+=temp;
						people_standing+=temp;
					}
					people_standing+=x;
				}
			}
			String output="Case #"+j+":"+" "+people_required+"\n";
			bw.write(output);
		}
		bw.close();
		fw.close();
	}
}
