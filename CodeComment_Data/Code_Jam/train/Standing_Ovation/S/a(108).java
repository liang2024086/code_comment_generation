package methodEmbedding.Standing_Ovation.S.LYD836;

import java.util.*;
public class a {
	public static void main(String[] arg)
	{
		new a();
	}
	public a()
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int cc = 1; cc <= cases; cc++)
		{
			int size = in.nextInt();
			String exp = in.next();
			int answer = 0;
			int cur = Integer.parseInt(exp.charAt(0)+"");
			for(int i = 1; i < exp.length(); i++)
			{
				if(cur < i)
				{
					answer += i-cur;
					cur = i;
				}
				cur += Integer.parseInt(exp.charAt(i)+"");
			}
			System.out.printf("Case #%d: ", cc);
			System.out.println(answer);
		}
		
		in.close();
	}
}
