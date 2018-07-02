package methodEmbedding.Speaking_in_Tongues.S.LYD425;

import java.util.Scanner;

public class A2 {
	private static char[] enc2dec = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r',
			'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= n; i++)
		{
			System.out.print("Case #" + i + ": ");
			String line = scan.nextLine();
			for (int j = 0; j < line.length(); j++)
			{
				char c = line.charAt(j);
				if (c >= 'a' && c <= 'z')
					System.out.print(enc2dec[c - 'a']);
				else
					System.out.print(c);
			}
			System.out.println();
		}
	}
}
