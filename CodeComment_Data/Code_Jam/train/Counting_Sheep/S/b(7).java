package methodEmbedding.Counting_Sheep.S.LYD1038;

import java.util.*;
import java.io.*;




class b
{
	public static void main(String args[]) throws Exception
	{
	int n,cp=0;
	int sheep;
	PrintWriter out;
	int table[]={0,1,2,3,4,5,6,7,8,9};
	


	Scanner in=new Scanner(new FileReader("input.txt"));
	out=new PrintWriter(new FileWriter("output.txt"));
	n=in.nextInt();
	

	for(int i=0;i<n;i++)
	{
		int count[]=new int[10];
		sheep=in.nextInt();
		if(sheep<1)
		{cp++;
		out.println("Case #"+cp+": "+"INSOMNIA");
		continue;
		}
		for(int j=1;;j++)
		{
			int x=sheep*j;
			int a,b,c,flag;
			c=x;
			while(x>0)
			{
				a=x%10;
				for(int ii=0;ii<10;ii++)
					if(a==table[ii]) count[ii]=1;
					
				
				x=x/10;
			}
			if(count[0]==1 && count[1]==1 && count[2]==1 && count[3]==1 && count[4]==1 && count[5]==1 && count[6]==1 && count[7]==1 && count[8]==1 && count[9]==1)
			{cp++;
			out.println("Case #"+cp+": "+c);
			break;
			}
			
		}
	




	}
	out.close();
	}
}
