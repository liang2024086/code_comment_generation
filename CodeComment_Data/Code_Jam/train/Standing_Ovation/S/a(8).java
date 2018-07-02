package methodEmbedding.Standing_Ovation.S.LYD1194;

import java.io.*;
import java.util.*;

class a
{
	static public void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("first"));
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		PrintWriter pw=new PrintWriter(new FileWriter("ansFirst"));
		for(int cn=0;cn<T;cn++)
		{
			st=new StringTokenizer(br.readLine());
			int S=Integer.parseInt(st.nextToken());
			String a=st.nextToken();
			
			int[] p=new int[S+1];
			
			for(int i=0;i<S+1;i++)
			{
				p[i]=(int)a.charAt(i)-48;
			}
			
			int[] sum=new int[S+1];
			sum[0]=p[0];
			for(int i=1;i<=S;i++)
			{
				sum[i]=sum[i-1]+p[i];
			}
			
			int need=0;
			
			if(p[0]==0)need=1;
			
			for(int i=1;i<S+1;i++)
			{
				if(p[i]!=0)
				if(i>sum[i-1]+need)
				{
					need+=i-sum[i-1]-need;
				}
			}
			
			System.out.println(need);
			pw.println("Case #"+(cn+1)+": "+need);
		}
		pw.flush();
		pw.close();
		br.close();
	}
}
