package methodEmbedding.Speaking_in_Tongues.S.LYD700;

import java.util.Scanner;

public class SpeakingInTongues
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int cases = 0;
		String str = null;
		char[] googlerese = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };

		cases = read.nextInt();
		read.nextLine();
		for (int i = 0; i < cases; i++)
		{
			System.out.print("Case #" + (i + 1) + ": ");
			str = read.nextLine();
			for (int j = 0; j < str.length(); j++)
			{
				if (str.charAt(j) == ' ')
					System.out.print(' ');
				else
					System.out.print(googlerese[str.charAt(j) - 'a']);
			}
			System.out.println();
		}
	}
}
