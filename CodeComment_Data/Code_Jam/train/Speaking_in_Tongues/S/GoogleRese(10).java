package methodEmbedding.Speaking_in_Tongues.S.LYD1073;

import java.io.*;

class GoogleRese 
{
	public static void main(String args[]) throws IOException
	{
		char map[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		BufferedReader in=new BufferedReader(new FileReader("in.txt"));
		PrintWriter out=new PrintWriter(new FileWriter("out.txt"));
		int tests=Integer.parseInt(in.readLine());
		for(int i=0;i<tests;i++)
		{
			String input=in.readLine();
			String output="";
			for(int j=0;j<input.length();j++)
			{
				if(input.charAt(j)==' ')
				{
					output+=" ";
					continue;
				}
				int idx=((int)input.charAt(j))-97;
				output+=map[idx];
			}
			out.println("Case #"+(i+1)+": "+output);
			out.flush();
		}
	}
}
