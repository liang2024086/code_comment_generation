package methodEmbedding.Magic_Trick.S.LYD1892;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("Inputs\\A-small-attempt1.in"));
		PrintWriter out = new PrintWriter("Outputs\\A-small.out");
		int T = sc.nextInt();
		int choice;
		ArrayList<Integer> chosenRow;
		ArrayList<Integer> chosenCard;
		
		for (int i = 1; i <= T; i++)
		{
			chosenRow = new ArrayList<Integer>();
			chosenCard = new ArrayList<Integer>();
			choice = sc.nextInt(); sc.nextLine();
			for (int j = 1; j <= 4; j++, sc.nextLine())
			{
				if (j == choice)
					for (int c = 0; c < 4; c++)
						chosenRow.add(sc.nextInt());
			}
			choice = sc.nextInt(); sc.nextLine();
			for (int j = 1; j <= 4; j++, sc.nextLine())
			{
				if (j == choice)
				{
					for (int c = 0; c < 4; c++)
					{
						int num = sc.nextInt();
						if (chosenRow.contains(num))
							chosenCard.add(num);
					}
				}
			}
			out.print("Case #" + i + ": ");
			int cards = chosenCard.size();
			if (cards == 0)
				out.println("Volunteer cheated!");
			else if (cards > 1)
				out.println("Bad magician!");
			else
				out.println(chosenCard.get(0));
		}
		sc.close();
		out.close();
	}
}
