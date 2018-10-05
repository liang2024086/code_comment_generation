package methodEmbedding.Counting_Sheep.S.LYD245;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountingSheep 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(new FileReader("./input/a.txt"));
		PrintWriter pw = new PrintWriter(new File("./output/A.txt"));
		int casos = sc.nextInt();
		for (int i = 1; i <= casos; i++) 
		{
			long N = sc.nextInt(),n=N;
			if(N ==0)
			{
				pw.println(String.format("Case #%d: INSOMNIA", i));
				continue;
			}
			int mult = 1;
			boolean[] picked = new boolean[10];
			int left = 10;
			while(left>0)
			{
				n = N*mult++;
				char[] digits = Long.toString(n).toCharArray();
				for (char c: digits)
				{
					if(!picked[c-'0'])
					{
						picked[c-'0'] = true;
						left--;
					}
				}
			}
//			System.out.println(String.format("Case #%d: %d", i,n));
			pw.println(String.format("Case #%d: %d", i,n));
		}
		pw.close();
	}
}
