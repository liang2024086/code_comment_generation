package methodEmbedding.Magic_Trick.S.LYD2210;

import java.io.*;
import java.util.StringTokenizer;
class Magic
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(a.readLine());
		for(int i=0;i<n;i++)
		{
			int x=Integer.parseInt(a.readLine())-1;
			String p[]=new String[4];
			for(int j=0;j<4;j++)
			{
				if(j==x)
				{
					StringTokenizer s=new StringTokenizer(a.readLine());
					p[0]=s.nextToken();
					p[1]=s.nextToken();
					p[2]=s.nextToken();
					p[3]=s.nextToken();
				}
				else
					a.readLine();
			}

			x=Integer.parseInt(a.readLine())-1;
			String q[]=new String[4];
			for(int j=0;j<4;j++)
			{
				if(j==x)
				{
					StringTokenizer s=new StringTokenizer(a.readLine());
					q[0]=s.nextToken();
					q[1]=s.nextToken();
					q[2]=s.nextToken();
					q[3]=s.nextToken();
				}
				else
					a.readLine();
			}
			
			String sol=""; int c=0;

			for(int j=0;j<4;j++)
				for(int k=0;k<4;k++)
					if(p[j].equals(q[k]))
					{
						c++;
						sol=p[j];
					}
			
			if(c==0)
				sol="Volunteer cheated!";
			else if(c>1)
				sol="Bad magician!";
			System.out.println("Case #"+(i+1)+": "+sol);
		}
	}
}
