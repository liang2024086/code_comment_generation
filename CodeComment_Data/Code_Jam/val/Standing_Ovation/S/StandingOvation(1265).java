package methodEmbedding.Standing_Ovation.S.LYD1907;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] stary = new String[2];
		for(int i=0;i<t;i++)
		{
			stary = br.readLine().split("\\s+");
			char[] ch = new char[stary[1].length()];
			ch = stary[1].toCharArray();
			int res = 0;
			int sum =0;
			for(int j=0;j<ch.length;j++)
			{
				if(sum>=j)
					sum+=((int)ch[j])-48;
				else
				{
					res+=(j-sum);
					sum+=(j-sum);
					sum+=((int)ch[j])-48;
				}
			}
			System.out.println("Case #"+(i+1)+": "+res);
		}
	}
}
