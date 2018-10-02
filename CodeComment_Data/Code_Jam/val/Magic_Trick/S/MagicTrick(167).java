package methodEmbedding.Magic_Trick.S.LYD1477;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("A-small-out.out");
		int T = in.nextInt();
		int ch;
		ArrayList<Integer> cRow;
		ArrayList<Integer> cCard;
		
		for (int i = 1; i <= T; i++)
		{
			cRow = new ArrayList<Integer>();
			cCard = new ArrayList<Integer>();
			ch = in.nextInt();
			in.nextLine();
			for (int j = 1; j <= 4; j++)
			{
				if (j == ch)
				{
					for (int c = 0; c < 4; c++)
						cRow.add(in.nextInt());
					in.nextLine();
				}
				else
					in.nextLine();
			}
			ch = in.nextInt(); in.nextLine();
			for (int j = 1; j <= 4; j++)
			{
				if (j == ch)
				{
					for (int c = 0; c < 4; c++)
					{
						int num = in.nextInt();
						if (cRow.contains(num))
							cCard.add(num);
					}
					in.nextLine();
				}
				else
				{
					in.nextLine();
				}
			}
			out.print("Case #" + i + ": ");
			int cards = cCard.size();
			if (cards == 0)
				out.println("Volunteer cheated!");
			else if (cards > 1)
				out.println("Bad magician!");
			else
				out.println(cCard.get(0));
		}
		out.close();
	}
}
