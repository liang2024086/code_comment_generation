package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1048;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QB_code_jam {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			String str=br.readLine();
			char c;
			char last='+';
			int count=0;
			for(int j=str.length()-1;j>=0;j--)
			{
				c=str.charAt(j);
				if(c!=last)
				{
					count++;
				}
				last=c;
			}
			pr.println("Case #"+(i+1)+": "+count);
		}
		pr.close();
	}
}
