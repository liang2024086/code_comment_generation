package methodEmbedding.Standing_Ovation.S.LYD385;

import java.io.*;
import java.util.*;

class Program1
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb=new StringBuffer();
			int t=Integer.parseInt(br.readLine());
			int i=0;
			while(i<t)
			{
				String dat[]=br.readLine().split(" ");
				int smax=Integer.parseInt(dat[0]);
				String stg=dat[1];
				int arr[]=new int[smax+1];
				for(int j=0;j<=smax;j++)
				{
					arr[j]=stg.charAt(j)-'0';
				}
				int stp=0;
				int exp=0;
				for(int j=0;j<=smax;j++)
				{
					if(arr[j]!=0)
					{
					if(j==0)
					{
						stp+=arr[j];
					}
					else
					{
						if(stp>=j)
						{
							stp+=arr[j];
						}
						else
						{
							exp=exp+(j-stp);
							stp=stp+exp+arr[j];
						}
					}
					}
				}
				sb.append("Case #"+(i+1)+": "+exp+"\n");
				
				i++;
			}
			System.out.print(sb.toString());
		}
		catch(Exception e)
		{
		}
	}
}
