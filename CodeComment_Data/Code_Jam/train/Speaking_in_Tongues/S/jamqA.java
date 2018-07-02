package methodEmbedding.Speaking_in_Tongues.S.LYD1407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class jama
{
	public static void main(String args[])throws IOException
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());	
			while(a!=0)
		{
			String s=br.readLine();
			//char c[]=s.toCharArray();
			s=s.replaceAll("a","y");
			System.out.println(s);
			
			a--;
		}
		
	}
	
}
