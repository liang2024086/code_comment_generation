package methodEmbedding.Counting_Sheep.S.LYD44;

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int w = 1;
		while(w<=T)
		{
			int N = input.nextInt();
			int flag = 1;
			int ans = -1;
			HashSet<Integer> digits = new HashSet<Integer>();
			HashSet<Integer> numbers = new HashSet<Integer>();
			int x = N;
			int i = 1;
			while(true)
			{
                numbers.add(x);
				while(x>0)
				{
					int r = x%10;
					if(!digits.contains(r))
					{
						digits.add(r);
					}
					x /= 10;
				}
				if(digits.size()==10)
				{
					ans = i*N;
					break;
				}
				x = (i+1)*N;
                i++;
                if(numbers.contains(x))
				{
					flag = 0;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Case #"+w+": INSOMNIA");
			}
			else
			{
				System.out.println("Case #"+w+": "+ans);
			}
			w++;
		}
	}
}
