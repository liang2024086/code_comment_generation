package methodEmbedding.Magic_Trick.S.LYD1626;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MagicTrick {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Taghi\\Downloads\\A-small-attempt0 (1).in");
		DataInputStream in2 = new DataInputStream(file);
		Scanner in = new Scanner(new InputStreamReader(in2));
		int numberOfTestCases = in.nextInt();
		for (int i=0;i<numberOfTestCases;i++)
		{
			int firstLine = in.nextInt();
			int[] row = new int[4];
			for (int k=0;k<4;k++)
			{
				for (int j=0;j<4;j++)
				{
					if (k==firstLine-1)
					{
						row[j] = in.nextInt();
					}
					else
						in.nextInt();
				}
			}
			
			int secondLine = in.nextInt();
			int [] secondRow = new int[4];
			for (int k=0;k<4;k++)
			{
				for (int j=0;j<4;j++)
				{
					if (k==secondLine - 1)
					{
						secondRow[j] = in.nextInt();
						
					}
					else
						in.nextInt();
				}
			}
			
			// Now, compare two arrays and see how many hits there are.
			int number = 0;
			int hits = 0;
			for (int k=0;k<4;k++)
			{
				for (int j=0;j<4;j++)
				{
					if (row[k]==secondRow[j])
					{
						number = row[k];
						hits++;
					}
				}
			}
			System.out.print("Case #"+(i+1)+": ");
			if (hits==1)
				System.out.println(number);
			else
				if (hits > 1)
					System.out.println("Bad magician!");
				else
					System.out.println("Volunteer cheated!");
		}
	}

}
