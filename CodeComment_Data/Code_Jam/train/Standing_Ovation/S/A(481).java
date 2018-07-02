package methodEmbedding.Standing_Ovation.S.LYD720;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int ntests = Integer.parseInt( reader.readLine() );
		for(int test = 1 ; test <= ntests; test++)
		{
			String digits = reader.readLine().split(" ")[1];
			int[] s = new int[digits.length()];
			for(int i = 0; i < digits.length(); i++)
				s[i] = digits.charAt(i) - '0';
			int res = 0;
			int sum = 0;
			if(s[0] == 0)
			{
				res = 1;
				sum++;
			}
			sum += s[0];
			for(int i = 1; i < s.length; i++)
			{
				if(s[i] == 0)
					continue;
				if(sum < i)
				{
					res += i - sum;
					sum = i;
				}
				sum += s[i];
			}
			System.out.println("Case #" + test + ": " + res);
		}
	}
}
