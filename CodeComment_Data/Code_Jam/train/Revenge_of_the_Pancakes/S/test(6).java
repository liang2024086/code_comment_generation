package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1126;

import java.io.*;
class solve {
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		int c=1;
		while(test-->0)
		{
			String m_s = in.readLine();
			int n = 0;
			StringBuilder m_c = new StringBuilder(m_s);
			int location = m_c.lastIndexOf("-");
			while(location!=-1)
			{
				for(int i=0;i<=location;i++)
				{
					if(m_c.charAt(i)=='+')
					{
						m_c.setCharAt(i,'-');
					}
					else
					{
						m_c.setCharAt(i,'+');
					}
				}
				location = m_c.lastIndexOf("-");
				n++;
			}
			System.out.println("Case #"+c+": "+n);
			c++;
		}
		
	}
}
