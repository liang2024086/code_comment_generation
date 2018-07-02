package methodEmbedding.Magic_Trick.S.LYD465;


import java.io.BufferedReader;
import java.io.FileReader;

public class Magic 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("/Users/anderson/Downloads/A-small-attempt0.in"));
		int numCases = Integer.parseInt(br.readLine());
		String answer = "";
		for (int i=1; i<=numCases; i++)
		{
			int row1 = Integer.parseInt(br.readLine());
			int[] cards = new int[17];
			for (int j=1; j<=4; j++)
			{
				String cardLine = br.readLine();
				if (row1==j)
				{
					String[] card = cardLine.split(" ");
					for (int k=0; k<card.length; k++)
					{
						cards[Integer.parseInt(card[k])]++;
					}
				}
			}
			
			int row2 = Integer.parseInt(br.readLine());
			for (int j=1; j<=4; j++)
			{
				String cardLine = br.readLine();
				if (row2==j)
				{
					String[] card = cardLine.split(" ");
					for (int k=0; k<card.length; k++)
					{
						cards[Integer.parseInt(card[k])]++;
					}
				}
			}
			int possibleCount = 0;
			int correctInteger = -1;
			for (int j=1; j<=16; j++)
			{
				if (cards[j]==2)
				{
					correctInteger = j;
					possibleCount++;
				}
			}
			answer += "Case #"+i+": ";
			if (possibleCount >= 2)
				answer += "Bad magician!";
			else if (possibleCount==1)
				answer += correctInteger;
			else
				answer += "Volunteer cheated!";
			answer += "\n";
		}
		System.out.println(answer);
	}
}
