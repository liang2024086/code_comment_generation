package methodEmbedding.Standing_Ovation.S.LYD0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class StandingOvation {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int sum = 0;
			int ex = 0;
			for(int j =0 ; j<num+1; j++)
			{
				int c = Integer.parseInt(s.charAt(j)+"");
				if(sum < j)
				{
					int d = j - sum;
					ex += d;
					sum += d;
				}
				sum += c;
			}
			System.out.println("Case #" + i + ": " + ex);
		}
	}
}
