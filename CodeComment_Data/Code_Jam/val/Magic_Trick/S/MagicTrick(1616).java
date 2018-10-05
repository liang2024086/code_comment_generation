package methodEmbedding.Magic_Trick.S.LYD83;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class MagicTrick {
	

	public static void main(String[] args) {
		
		HashSet<Integer> cardsAfterFirst;
		HashSet<Integer> cardsAfterSecond;
		Scanner input = null;
		try {
			input = new Scanner(new File("input.in"));
			
			int T = input.nextInt();
			for (int i=1;i<=T;i++)
			{
				cardsAfterFirst = new HashSet<Integer>();
				cardsAfterSecond = new HashSet<Integer>();
				System.out.print("Case #"+i+":");
				//Skip to first answer
				int firstAns = input.nextInt();
				input.nextLine();
				int t = firstAns;
				while (t>1)
				{
					t--;
					input.nextLine();
				}
				//add the 4 cards
				for (int j=0;j<4;j++)
					cardsAfterFirst.add(input.nextInt());
				input.nextLine();
				t=firstAns+1;
				while (t<=4)
				{
					t++;
					input.nextLine();
				}
				
				int secAns = input.nextInt();
				input.nextLine();
				t=secAns;
				while (t>1)
				{
					t--;
					input.nextLine();
				}
				
				for (int j=0;j<4;j++)
				{
					int currCard = input.nextInt();
					if (cardsAfterFirst.contains(currCard))
						cardsAfterSecond.add(currCard);
				}
				input.nextLine();
				t=secAns+1;
				while (t<=4)
				{
					t++;
					input.nextLine();
				}
				
				if (cardsAfterSecond.size()==1)
				{
					Iterator<Integer> it = cardsAfterSecond.iterator();
					System.out.println(" "+it.next());
				}
				else 
				{
					if (cardsAfterSecond.size()!=0)
						System.out.println(" Bad magician!");
					else
						System.out.println(" Volunteer cheated!");
				}
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		input.close();

	}

}
