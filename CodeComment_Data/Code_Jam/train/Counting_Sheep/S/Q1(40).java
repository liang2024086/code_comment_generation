package methodEmbedding.Counting_Sheep.S.LYD640;

import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int noOfCases = scanner.nextInt();
		int ip[]=new int[noOfCases];
		boolean[][] cond=new boolean[noOfCases][10];
		for(int i=0;i<noOfCases;i++)
		{
			ip[i]=scanner.nextInt();			
		}
		
		for(int i=0;i<noOfCases;i++)
		{
			int temp=ip[i],flag=0,n;			
			for(int j=1;flag!=1;j++)
			{
				
				int tn=temp*(j-1);
				n=temp*j;
				if(tn==n)
				{
					System.out.println("Case #" + (i+1) + ": " +"INSOMNIA" );
					break;
				}
				
				while(n>0)
				{
					int ind=n%10;
					cond[i][ind]=true;
					n=n/10;
				}
				for(int k=0;k<10;k++)
				{
					if(cond[i][k]==false)
					{
						flag=0;	break;					
					}
					else
						flag=1;						
				}				
				if(flag==1)
					System.out.println("Case #" + (i+1) + ": " +temp*(j));					
			}
			
							
		}
	}

}
