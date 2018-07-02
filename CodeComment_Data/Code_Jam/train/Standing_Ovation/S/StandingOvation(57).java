package methodEmbedding.Standing_Ovation.S.LYD1554;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class StandingOvation {

	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("input"));
		PrintWriter pw=new PrintWriter(new File("output.txt"));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=t; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			
			String ss = st.nextToken();
			int audience = Integer.parseInt(ss.charAt(0)+"");
			int ans = 0;
			
			for(int j = 1; j<=s; j++)
			{
				int tmp = Integer.parseInt(ss.charAt(j)+"");
				if(audience<j && tmp>0){
					ans += (j-audience);
					audience += (j-audience);
				}
				audience += tmp;
			}
			pw.println("Case #"+i+": "+ans);
		}
		pw.flush();
	}
}
