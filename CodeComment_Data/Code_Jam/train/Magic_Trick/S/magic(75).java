package methodEmbedding.Magic_Trick.S.LYD1992;

import java.util.*;
import java.io.*;
public class magic
{
	public static void main(String[]args)throws FileNotFoundException
	{
		//File Input
		FileInputStream fin = new FileInputStream("A-small-attempt0.in");
		Scanner sc = new Scanner(fin);
		
		//File Output
		FileOutputStream fout = new FileOutputStream("magic.out");
		PrintStream ps=new PrintStream(fout);
		
		int t,fa,sa,i,v,p,count,num=1,k=1,j;
		int far[]=new int[4];
		int sar[]=new int[4];
		t=sc.nextInt();
		for(k=1;k<=t;k++)
		{
			fa=sc.nextInt();
			for(i=0;i<4;i++)
			{
				p=0;
				for(j=0;j<4;j++)
				{
					if(i==(fa-1))
						far[p++]=sc.nextInt();
					else
						v=sc.nextInt();
				}
			}
			sa=sc.nextInt();
			for(i=0;i<4;i++)
			{
				p=0;
				for(j=0;j<4;j++)
				{
					if(i==(sa-1))
						sar[p++]=sc.nextInt();
					else
						v=sc.nextInt();
				}
			}
			count=0;
			for(i=0;i<4;i++)
			{
				for(j=0;j<4;j++)
				{
					if(far[i]==sar[j])
					{
						num=far[i];
						count++;
					}
				}
			}
			if(count==0)
				//System.out.println("Case #"+k+": "+"Volunteer cheated!");
				ps.println("Case #"+k+": "+"Volunteer cheated!");
			else if(count>1)
				//System.out.println("Case #"+k+": "+"Bad magician!");
				ps.println("Case #"+k+": "+"Bad magician!");
			else
				//System.out.println("Case #"+k+": "+num);
				ps.println("Case #"+k+": "+num);
		}
	}
}
				
			
					
				
