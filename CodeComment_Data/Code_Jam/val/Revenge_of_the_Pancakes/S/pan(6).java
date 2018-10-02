package methodEmbedding.Revenge_of_the_Pancakes.S.LYD628;

import java.io.*;
class pan
{
	public static void main(String []args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			String str=br.readLine();
			char ch[]=str.toCharArray();
			int count=0;
			boolean flag=true;
			if(ch[0]=='-')
				flag=false;
			for(int j=1;j<ch.length;j++)
			{
				if(ch[j]!=ch[j-1])
				{
					if(ch[j]=='-')
					{
						flag=false;
						count++;
					}
					else
					{
						flag=true;
						count++;
					}
				}
			}
			if(!flag)
				count++;
			System.out.println("Case #"+String.valueOf(i)+": "+String.valueOf(count));
		}
	}	
}
