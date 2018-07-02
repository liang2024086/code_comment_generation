package methodEmbedding.Revenge_of_the_Pancakes.S.LYD781;

import java.util.*;
import java.util.Arrays;
import java.io.*;
class Sample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int j = 1; j <= num; j++)
		{
			int countp = 0;
			int countn = 0;
			int x = 0, count = 1;
			String str = sc.next();
			int len = str.length();
			int answer = 0;
			boolean flag = true;
			String cmp = "";
			char a[] = str.toCharArray();
			for(int i = 0; i < len; i++)
			{
				if(str.charAt(i) == '+')
					countp++;
				else
					countn++;
			}
			if(countp == len)
			{
				System.out.println("Case #" + j + ": 0");
			}
			else if(countn == len)
			{
				System.out.println("Case #" + j + ": 1");
			}
			else
			{
				cmp = cmp + a[0];
				for(int k = 1; k < len; k++)
				{
					if(a[k] == cmp.charAt(cmp.length() - 1))
						continue;
					else
						cmp = cmp + a[k];
				}
				if(cmp.charAt(cmp.length() - 1) == '+')
					answer = cmp.length()-1;
				else
					answer = cmp.length();
				System.out.println("Case #" + j + ": " + answer);
			}
		}
	}
}
