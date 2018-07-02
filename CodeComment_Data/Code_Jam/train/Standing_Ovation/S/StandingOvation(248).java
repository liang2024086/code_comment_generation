package methodEmbedding.Standing_Ovation.S.LYD656;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class StandingOvation {

	public static void main(String[] args) {
		try
		{
			BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(f.readLine());
			FileWriter fout = new FileWriter("standingovation.out");
			for(int i = 1; i <= t; i++)
			{
				StringTokenizer st = new StringTokenizer(f.readLine());
				int smax = Integer.parseInt(st.nextToken());
				int[] people = new int[smax+1];
				String s = st.nextToken();
				for(int j = 0; j < people.length; j++)
					people[j] = Integer.parseInt(s.charAt(j)+"");
				int added = 0;
				int count = 0;
				for(int j = 0; j < people.length; j++)
				{
					if(count < j)
					{
						added += j - count;
						count = j;
					}
					count += people[j];
				}
				System.out.println("Case #" + i + ": " + added);
				fout.write("Case #" + i + ": " + added + "\n");
			}
			f.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
