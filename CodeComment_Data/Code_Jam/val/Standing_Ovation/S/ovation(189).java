package methodEmbedding.Standing_Ovation.S.LYD280;

import java.io.*;

class Ovation
{
	static int t_case;
	static int smax;
	static int[] s_item;
	static int min=0;
	
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader(args[0]));

		if(br==null)
			System.out.println("Failed to open file!");
		else
		{
			t_case=Integer.parseInt(br.readLine());
			String[] s;
			for(int k=1;k<=t_case;k++)
			{				
				s=br.readLine().split(" ");
				smax=Integer.parseInt(s[0]);
				s_item=new int[smax+1];
				min=0;
				
				for(int i=0;i<=smax;i++)
					s_item[i]=Integer.parseInt(Character.toString(s[1].charAt(i)));
			
				for(int i=smax;i>0;i--)
				{
					int sum=0,p=0;
					for(int j=i-1;j>=0;j--)
						sum+=s_item[j];
					if(sum<i)
					{
						p+=i-sum;
						s_item[0]+=p;
						min+=p;
					}
				}
				System.out.println("Case #"+k+": "+min);
			}
		}
		br.close();
	}
	
}
