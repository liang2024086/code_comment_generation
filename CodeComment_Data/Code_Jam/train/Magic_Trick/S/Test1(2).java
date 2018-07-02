package methodEmbedding.Magic_Trick.S.LYD261;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test1
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File(args[0]));
		List<Integer> cards = new ArrayList<>();
		int card = 0;
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++)
		{
			int chosenRow = in.nextInt();
			
			for (int j = 0; j < chosenRow; j++)
			{
				in.nextLine();
			}
			for (int j = 0; j < 4; j++)
			{
				cards.add(in.nextInt());
			}
			for (int j = chosenRow - 1; j < 4; j++)
			{
				in.nextLine();
			}
			
			chosenRow = in.nextInt();
			for (int j = 0; j < chosenRow; j++)
			{
				in.nextLine();
			}
			for (int j = 0; j < 4; j++)
			{
				int m = in.nextInt();
				if (cards.contains(m))
				{
					if (card == 0)
					{
						card = m;
					}
					else 
					{
						in.nextLine();
						chosenRow++;
						card = -1;
						break;
					}
				}
			}
			for (int j = chosenRow - 1; j < 4; j++)
			{
				in.nextLine();
			}
			
			System.out.print("Case #" + (i + 1) + ": ");
			switch (card)
			{
			case -1:
				System.out.println("Bad magician!");
				break;
			case 0:
				System.out.println("Volunteer cheated!");
				break;
			default:
				System.out.println(card);
				break;
			}			
			
			card = 0;
			cards.clear();
		}
		
		in.close();
	}

}
