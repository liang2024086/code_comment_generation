package methodEmbedding.Magic_Trick.S.LYD1661;

import java.util.Scanner;

public class magictrick
{

	public static void main(String args[])
	{
		String tempInputLine[] = new String[4];
		String tempInputLineParts[] = new String[4];
		char tempKeyChar, tempInputChar;
		int answer[][] = new int[1000][2];
		int cards[][][][] = new int[1000][2][4][4];
		int testCases;
		Scanner sc = new Scanner(System.in);
		
		testCases = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<testCases;i++)
		{
			for(int l=0;l<2;l++)
			{
				answer[i][l] = Integer.parseInt(sc.nextLine());
				for(int j=0;j<4;j++)
				{
					tempInputLine[j] = sc.nextLine();
					tempInputLineParts = tempInputLine[j].split("\\s+");
					for(int k=0;k<4;k++)
					{
						cards[i][l][j][k] = Integer.parseInt(tempInputLineParts[k]);
					}
				}
			}
			
			int matchCount = 0;
			int matchingCard=0;
			int row1[] = cards[i][0][answer[i][0]-1];
			int row2[] = cards[i][1][answer[i][1]-1];

			for(int l=0;l<4;l++)
			{
				for(int m=0;m<4;m++)
				{
					if(row1[l]==row2[m])
					{
						matchCount++;
						matchingCard = row2[m];
					}
				}
			}
			if(matchCount==1)
			{
				System.out.println("Case #"+(i+1)+": "+matchingCard);
			}
			else if(matchCount>1)
			{
				System.out.println("Case #"+(i+1)+": Bad magician!");
			}
			else
			{
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
		}
	}
}
