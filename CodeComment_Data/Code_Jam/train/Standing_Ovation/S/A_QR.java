package methodEmbedding.Standing_Ovation.S.LYD1249;

import java.io.IOException;
import java.util.Scanner;


//4
//4 11111
//1 09
//5 110011
//0 1

//Case #1: 0
//Case #2: 1
//Case #3: 2
//Case #4: 0

//Qualification Round 2015
//Problem A. Standing Ovation
class A_QR
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(), s, ans, stand, a[];
		StringBuilder p = new StringBuilder();
		char c[];
		
		for(int no = 1; no <= t; no++)
		{
			ans = 0;
			s = scan.nextInt();
			c = scan.next().toCharArray();
			a = new int[s + 1];
			
			for(int i = 0; i <= s; i++)
				a[i] = c[i] - 48;
//			for(int i = 0; i <= s; i++)
//				System.out.println(a[i]);
			
			stand = a[0];
			for(int i = 1; i <= s; i++)
			{
				if(a[i] != 0 && i > stand)
				{
					ans += i - stand;
					stand += i - stand;
				}
				stand += a[i];
			}
			p.append(String.format("Case #%d: %d\n", no, ans));
		}
		System.out.print(p);
	}
}
