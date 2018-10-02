package methodEmbedding.Standing_Ovation.S.LYD1086;

import java.io.*;
import java.util.*;

public class p1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int num = sc.nextInt();
			String input = sc.next();
			int current_num = 0;
			int result = 0;
			for(int j=0;j<=num;j++)
			{
				if(current_num >=j)
				{
					current_num += input.charAt(j)-'0';
				}
				else
				{
					result+=j-current_num;
					current_num = j+input.charAt(j)-'0';
				}
			}
			System.out.println("Case #"+(i+1)+": "+result);
		}
		
	}
}
