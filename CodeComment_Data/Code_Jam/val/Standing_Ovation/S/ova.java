package methodEmbedding.Standing_Ovation.S.LYD2024;

import java.io.*;
import java.util.StringTokenizer;
class ova
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int t1=t;
		while(t-->0)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			int sm=Integer.parseInt(st.nextToken());
			String s=st.nextToken();
			//int n=s.length();
			int m=0;
			int n2=0;
			for(int i=0;i<=sm;i++)
			{
				int c=s.charAt(i)-'0';
				//System.out.println("x "+m+" "+i);
				if(m>=i)
					m+=c;
				else
					{
					if(c!=0){
					//System.out.print("i-m="+(i-m));
					n2=n2+i-m;
					m=c+i;}}
			}
			System.out.println("Case #"+(t1-t)+": "+n2);
		}
	}
}
