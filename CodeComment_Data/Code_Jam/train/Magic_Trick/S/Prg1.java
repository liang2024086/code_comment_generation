package methodEmbedding.Magic_Trick.S.LYD795;

import java.io.*;
import java.util.*;

class Prg1
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String nt=br.readLine();
			int i=0;
			int g1,g2;
			int arr1[]=new int[4];
			int arr2[]=new int[4];
			while(i<Integer.parseInt(nt))
			{
				g1=Integer.parseInt(br.readLine().toString());
				for(int j=0;j<4;j++)
				{
					String s=br.readLine().toString();
					if(g1==j+1)
					{
						StringTokenizer st=new StringTokenizer(s," ");
						int k=0;
						while(st.hasMoreTokens())
						{
							arr1[k]=Integer.parseInt(st.nextToken().toString());
							k++;
						}
					}
				}
				
				g2=Integer.parseInt(br.readLine().toString());
				for(int j=0;j<4;j++)
				{
					String s=br.readLine().toString();
					if(g2==j+1)
					{
						StringTokenizer st=new StringTokenizer(s," ");
						int k=0;
						while(st.hasMoreTokens())
						{
							arr2[k]=Integer.parseInt(st.nextToken().toString());
							k++;
						}
					}
				}
				int c=0;
				int pn=0;
				for(int j=0;j<4;j++)
				{
					
					for(int k=0;k<4;k++)
					{
						if(arr1[j]==arr2[k])
						{
								c++;
								pn=arr1[j];
						}
					}
				}
				if(c==1)
				{
					System.out.println("Case #"+(i+1)+": "+pn);
				}
				else if(c>1)
					System.out.println("Case #"+(i+1)+": Bad magician!");
					else if(c==0)
						System.out.println("Case #"+(i+1)+": Volunteer cheated!");
				i++;
			}
		}
		catch(Exception e)
		{	
			e.printStackTrace();
		}
	}
}
