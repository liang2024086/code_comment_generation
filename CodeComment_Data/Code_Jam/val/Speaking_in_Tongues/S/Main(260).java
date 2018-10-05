package methodEmbedding.Speaking_in_Tongues.S.LYD403;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Character Googlerese[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		Scanner oku = new Scanner(System.in);
		
		int satirNo = oku.nextInt();
		oku.nextLine();
		
		for (int i = 0; i < satirNo; i++)
		{
			System.out.print("Case #" + (i + 1) + ": ");
			
			for (Character c : oku.nextLine().toCharArray())
			{
				if(c == ' ')
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(Googlerese[c - 'a']);
				}
			}
			
			System.out.println("");
		}
		
		oku.close();
	}
}
