package methodEmbedding.Magic_Trick.S.LYD1563;

import java.io.*;
import java.util.*;
class Card
{	public static void main(String as[]) throws IOException
	{	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j,tc,c=0,x;
		int fin[]=new int[t+1];
		int temp[]=new int[t+1];
		for( tc=1;tc<=t;tc++)
		{	int ans1=sc.nextInt();
			int mat1[][]=new int[4][4];
			for( i=0;i<4;i++)
				for(j=0;j<4;j++)
					mat1[i][j]=sc.nextInt();
			/*for( i=0;i<4;i++)
				for( j=0;j<4;j++)
				System.out.println(mat1[i][j]);	*/
			
			int ans2=sc.nextInt();
			int mat2[][]=new int[4][4];
			for( i=0;i<4;i++)
				for(j=0;j<4;j++)
					mat2[i][j]=sc.nextInt();
			int count=0;
			for(i=0;i<4;i++)	
			{	x=mat1[ans1-1][i];	//System.out.println(x);
				for(j=0;j<4;j++)
					if(x==mat2[ans2-1][j])
					{	temp[tc]=x;//System.out.println("aAA");
						count++;
					}
			}
			fin[tc]=count;
		}
		for(i=1;i<fin.length;i++)	
		{
			if(fin[i]==1)
				System.out.println("Case #"+i+": "+temp[i]);
			else if(fin[i]==0)
				System.out.println("Case #"+i+": Volunteer cheated!");
			else 
				System.out.println("Case #"+i+": Bad magician!");
								
			
		}
	}
}
			

			
							
