package methodEmbedding.Magic_Trick.S.LYD253;

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("A-small-attempt2.in"));
		FileWriter out = new FileWriter("outputFile.txt");
		int arr[][]=new int[4][4];
		int ans[]=new int[4];
		int t,r1,r2,i,j,store=0,count,k=1;
		t=Integer.parseInt(br.readLine());
		while(t!=0)
		{
			r1=Integer.parseInt(br.readLine());
			for(i=0;i<4;i++)
			{
				StringTokenizer input=new StringTokenizer(br.readLine());
				for(j=0;j<4;j++)
				{
					arr[i][j]=Integer.parseInt(input.nextToken());
				}
			}
			r2=Integer.parseInt(br.readLine());
			for(j=0;j<4;j++)
			ans[j]=arr[r1-1][j];
			for(i=0;i<4;i++) 
			{
				StringTokenizer inp=new StringTokenizer(br.readLine());
				for(j=0;j<4;j++)
				arr[i][j]=Integer.parseInt(inp.nextToken());
			}
			count=0;
			for(j=0;j<4;j++)
			{
				for(i=0;i<4;i++)
				{
					if(ans[j]==arr[r2-1][i])
					{
						count+=1;
						store=ans[j];
					}
				}
				if(count>1)
				break;
			}
			if(count==1)
			out.write("Case #"+k+": "+store+"\n");
			else if(count==0)
			out.write("Case #"+k+": Volunteer cheated!"+"\n");
			else if(count>1)
			out.write("Case #"+k+": Bad magician!"+"\n");
			
			t-=1;
			k+=1;
		}
		out.close();
	}
}
			
			
		
