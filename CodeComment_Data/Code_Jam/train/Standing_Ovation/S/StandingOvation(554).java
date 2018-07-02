package methodEmbedding.Standing_Ovation.S.LYD494;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation
{
	static final int CH_0 = (int) '0';
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; ++i)
		{
			int sum = 0;
			int friends = 0;
			sb.append("Case #" + (i+1) + ": ");
			String[] line = br.readLine().split("\\s+");
			int smax = Integer.parseInt(line[0]);
			for (int j = 1; j < smax + 1; ++j)
			{
				sum += line[1].charAt(j - 1) - CH_0;
				if (sum + friends < j)
					++friends;
			}
			sb.append(friends + "\n");
		}
		System.out.println(sb.toString());
		
//		StringBuilder nine = new StringBuilder();
//		StringBuilder zero = new StringBuilder();
//		for (int i = 0; i < 111; ++i)
//		{
//			nine.append("9");
//			zero.append("00000000");
//		}
//		System.out.println("999 " + nine.toString() + zero.toString() + "1");
//		int x = (int) '0';
//		System.out.println(x);

		br.close();
	}
}
