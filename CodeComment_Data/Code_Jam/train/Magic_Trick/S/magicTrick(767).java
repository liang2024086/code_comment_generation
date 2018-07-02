package methodEmbedding.Magic_Trick.S.LYD1212;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class magicTrick {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		File answers = new File("magicAns.txt");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("magicAns.txt"))));
		int inputs = scan.nextInt();
		for(int i = 0; i < inputs; i++)
		{
			int row = scan.nextInt();
			int[][]configInit = new int[4][4];
			for(int x = 0; x < 16; x++)
			{
				configInit[x % 4][x / 4] = scan.nextInt();
			}
			int rowInit[] = new int[4];
			for(int x = 0; x < 4; x++)
			{
				rowInit[x] = configInit[x][row - 1];
			}
			int newRow = scan.nextInt();
			int[][] newConfig = new int[4][4];
			for(int x = 0; x < 16; x++)
			{
				newConfig[x % 4][x / 4] = scan.nextInt();
			}
			int[] rowSecond = new int[4];
			for(int x = 0; x < 4; x++)
			{
				rowSecond[x] = newConfig[x][newRow - 1];
			}
			ArrayList<Integer> cardsPossible = new ArrayList<Integer>();
			for(int x = 0; x < 4; x++)
			{
				int check = rowInit[x];
				for(int y = 0; y < 4; y++)
				{
					if(check == rowSecond[y])
					{
						cardsPossible.add(check);
					}
				}
			}
			if(cardsPossible.size() == 1)
			{
				out.println("Case #" + (i + 1) + ": " + cardsPossible.get(0));
			}
			else if(cardsPossible.size() == 0)
			{
				out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			}
			else
			{
				out.println("Case #" + (i + 1) + ": Bad magician!");
			}
		}
		out.close();
		scan.close();
	}

}
