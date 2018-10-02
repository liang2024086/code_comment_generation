package methodEmbedding.Magic_Trick.S.LYD1437;

import java.util.*;
import java.io.*;

public class MagicTrick
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(new File("MT.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("MT.out"));
		int T=sc.nextInt();
		int a[]=new int[4];
		int b[]=new int[4];
		int i,j,k,ch1,ch2,count=0,number=0;
		for(i=1;i<=T;i++)
		{
			ch1=sc.nextInt();
			for(j=0;j<4;j++)
			{
				if(j!=(ch1-1))
				{
					for(k=0;k<4;k++)
						sc.nextInt();
				}
				else
				{
					for(k=0;k<4;k++)
						a[k]=sc.nextInt();
				}
			}
			ch2=sc.nextInt();
			for(j=0;j<4;j++)
			{
				if(j!=(ch2-1))
				{
					for(k=0;k<4;k++)
						sc.nextInt();
				}
				else
				{
					for(k=0;k<4;k++)
						b[k]=sc.nextInt();
				}
			}
			count=0;
			number=0;
			out:
			for(j=0;j<4;j++)
			{
				for(k=0;k<4;k++)
				{
					if(a[j]==b[k])
					{
						count++;
						number=a[j];
					}
					if(count>1)
						break out;
				}
			}
			String s="";
			if(count==1)
				s+=number;
			else if(count>1)
				s+="Bad magician!";
			else if(count==0)
				s+="Volunteer cheated!";
			pw.println("Case #"+i+": "+s);

		}
		sc.close();
		pw.close();
	}
}
