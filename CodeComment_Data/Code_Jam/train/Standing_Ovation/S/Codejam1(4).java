package methodEmbedding.Standing_Ovation.S.LYD1375;

import java.io.*;
import java.util.*;
class Codejam1
{
	public static void main(String [] args) throws Exception
	{
		String temp;
		int index=0,count=0,sum=0,j=0,k=0,add=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		for(int x=0;x<n;x++)
		{
			temp=br.readLine();
			String arr[]=temp.split(" ");	
			add=sum=0;
			for(int i=0;i<arr[1].length();i++)
			{
				for(j=i-1;j>=0;j--)
				{
					sum+=Integer.parseInt(arr[1].charAt(j)+"");
				}
				sum+=add;
				if(sum<i)
				{
					add++;
				}
				sum=0;
			}
			System.out.println("Case #"+ (x+1) + ": " + add);
		}
	}
}
