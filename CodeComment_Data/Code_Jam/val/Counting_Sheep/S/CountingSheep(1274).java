package methodEmbedding.Counting_Sheep.S.LYD1216;

import java.io.*;

public class Sample2 
{
	public static void main(String args[])throws IOException
	{
		
		DataInputStream dis=new DataInputStream(new FileInputStream(new File("C:\\Users\\sahil\\Downloads\\A-small-attempt3.in")));
		
		String line=dis.readLine();
		int t=Integer.parseInt(line.trim());
		int a[];
		int s,temp,count,count1,f=0;
		
		for(int i=0;i<t;i++)
		{
			line=dis.readLine();
			int n=Integer.parseInt(line.trim());
			s=n;
			count=0;
			count1=1;
			a=new int[10];
	
				while(count!=10)
				{
				
				if(n==0)
				{
					System.out.print("Case #"+(i+1)+": "+"INSOMNIA"+"\n");
					break;
				}
			
				else
				{
				
					while(s>0)
					{
						temp=s%10;
						if(a[temp]==0)
						{
							a[temp]=1;
							count++;
						}
						s=s/10;
					}
			    }
					
					if(count==10)
					{
						System.out.print("Case #"+(i+1)+": "+f+"\n");
					}
					else
					{
						count1++;
						s=n*count1;
						f=s;
						//s=n;
					}
					
			}
		}
				
	}
}

