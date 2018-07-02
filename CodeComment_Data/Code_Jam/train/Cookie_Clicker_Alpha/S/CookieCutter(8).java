package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class CookieCutter {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			double C = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());
			double X = Double.parseDouble(st.nextToken());
			double max = Double.MAX_VALUE;
			for(int j=0; j<=12*(X/F); j++)
			{
				double t = 0;
				for(int k=0; k<=j-1; k++)
				{
					t += C/(2+k*F);
				}
				t+= X/(2+F*j);
				max = Math.min(t, max);
			}
			//X/2, C/2 + X/(2+F), C/2 + C/(2+F)+X/(2+2F)
			System.out.println("Case #"+(i+1)+": "+max);
		}
	}
}
