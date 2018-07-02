package methodEmbedding.Speaking_in_Tongues.S.LYD1311;

import java.io.*;
class google
{
	public static void main(String args[])throws Exception
	{
		BufferedReader ds=new BufferedReader(new FileReader("input.txt"));
		PrintWriter W=new PrintWriter(new FileWriter("output.txt"));
		String a="yhesocvxduiglbkrztnwjpfmaq";
		String b="abcdefghijklmnopqrstuvwxyz";
		int n=Integer.parseInt(ds.readLine());
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			W.print("Case #"+i+": ");
			String c=ds.readLine();
			for(j=0;j<c.length();j++)
			{
				if(c.charAt(j)==' ')
				{
					W.print(' ');
					continue;
				}
				for(k=0;k<26;k++)
				{
					if(c.charAt(j)==b.charAt(k))
					{
						W.print(a.charAt(k));
						break;
					}
				}
			}
			W.println();	
		}
		W.close();
	}
}
