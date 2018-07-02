package methodEmbedding.Magic_Trick.S.LYD1856;

import java.io.*;
import java.util.*;

public class A
{
	int ch1,ch2,grid1[][],grid2[][];
	String res[];
	
	public static void main(String args[])throws IOException
	{
		A ob=new A();
		Scanner sc=new Scanner(System.in);
		int t,count=0;
		t=sc.nextInt();
		int loop=1,pos=0;
		ob.res=new String[t];
		if(t>=1 && t<=100)
		{
			while(loop<=t)
			{
				ob.ch1=sc.nextInt();
				ob.grid1=new int[4][4];
				for(int i=0;i<4;i++)
					for(int j=0;j<4;j++)
						ob.grid1[i][j]=sc.nextInt();
				ob.ch2=sc.nextInt();
				ob.grid2=new int[4][4];
				for(int i=0;i<4;i++)
					for(int j=0;j<4;j++)
						ob.grid2[i][j]=sc.nextInt();
				count=0;
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						if(ob.grid1[ob.ch1-1][i]==ob.grid2[ob.ch2-1][j])
						{	
							pos=i;
							count++;
						}
					}
				}
				if(count==1)
					ob.res[loop-1]="Case #"+loop+": "+ob.grid1[ob.ch1-1][pos];
				else 
					if(count>0)
						ob.res[loop-1]="Case #"+loop+": "+"Bad magician!";
					else
						ob.res[loop-1]="Case #"+loop+": "+"Volunteer cheated!";
				loop++;
			}
			for(int i=0;i<t;i++)
				System.out.println(ob.res[i]);
		}
	}
}
