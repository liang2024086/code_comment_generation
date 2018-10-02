package methodEmbedding.Magic_Trick.S.LYD732;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) throws Exception
	{
		String path = "C:\\Users\\Ziming\\Downloads\\";
		String input = path + "A-small-attempt0.in";
		String output = path + "A.out";
		Scanner scanner = new Scanner(new FileReader(input));
		PrintWriter writer = new PrintWriter(output);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i=0;i<T;i++)
		{
			writer.print("Case #" + (i+1) + ": ");
			int r1 = scanner.nextInt();
			int[][] square1 = new int[4][4];
			for (int j=0;j<4;j++)
				for (int k=0;k<4;k++)
					square1[j][k] = scanner.nextInt();
			int r2 = scanner.nextInt();
			int[][] square2 = new int[4][4];
			for (int j=0;j<4;j++)
				for (int k=0;k<4;k++)
					square2[j][k] = scanner.nextInt();
			System.out.println(r1 + " " + r2);
			int c = 0;
			int n = 0;
			for (int j=0;j<4;j++)
			{
				for (int k=0;k<4;k++)
				{
					if (square1[r1-1][j]==square2[r2-1][k])
					{
						n = square1[r1-1][j];
						c++;
						break;
					}
				}
			}
			if (c==0)
				writer.print("Volunteer cheated!");
			else if (c==1)
				writer.print(n);
			else {
				writer.print("Bad magician!");
			}
			writer.println();
		}
		writer.flush();
		writer.close();
		scanner.close();
	}
}
