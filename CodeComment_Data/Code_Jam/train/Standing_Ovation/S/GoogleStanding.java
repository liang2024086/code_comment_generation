package methodEmbedding.Standing_Ovation.S.LYD48;

import java.io.*;

public class GoogleStanding
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rameez\\Documents\\Java\\inp\\A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Rameez\\Documents\\Java\\inp\\A-small-attempt0.out"));

		int tc = Integer.parseInt(br.readLine());
		for(int z=0;z<tc;z++)
		{
			String inp[] = br.readLine().split(" ");
			int S = Integer.parseInt(inp[0]);
			int len = S+1;
			int personsClapping = Integer.parseInt(inp[1].charAt(0)+"");
			int invite = 0;
			for(int i=1;i<len;i++)
			{
				if((personsClapping >= i)||(Integer.parseInt(inp[1].charAt(i)+"")==0))
					personsClapping += Integer.parseInt(inp[1].charAt(i)+"");
				else
				{
					invite += (i-personsClapping);
					personsClapping += invite;
					personsClapping += Integer.parseInt(inp[1].charAt(i)+"");
				}
			}
			if(z==tc-1)
				pw.print("Case #"+(z+1)+": "+invite);
			else
				pw.println("Case #"+(z+1)+": "+invite);
		}
		pw.close();
	}
}
