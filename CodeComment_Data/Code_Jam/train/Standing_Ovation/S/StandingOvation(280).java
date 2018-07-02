package methodEmbedding.Standing_Ovation.S.LYD244;

import java.util.*;
import java.io.*;
class  StandingOvation 
{
	public static void main(String[] args) throws IOException
	{
		int T=0,S=0;
		int res[];
		int count,current=0;
		String K="";
		Scanner sc=new Scanner(new BufferedReader(new FileReader("A-small.in")));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("A-small.out")));
		T=sc.nextInt();
		res=new int[T];
		for (int n=0; n<res.length ;n++ )
		{
			res[n]=0;
		}
		for(int i=0;i<T;i++)
		{
			count=0;
			S=sc.nextInt();		
			K=sc.next();
			count=(int)((K.charAt(0))-48);
			for (int m=1;m<K.length();m++ )
			{
				if(count>=m)
				{
					count+=(int)((K.charAt(m))-48);
				}
				else
				{
					current=m-count;
					res[i]+=current;
					count+=current+(int)((K.charAt(m))-48);
				}
			}
		}
		for(int i=0;i<res.length;i++)
		{
			out.println("Case #"+(i+1)+": "+res[i]);
		}
		out.close();
	}
}
