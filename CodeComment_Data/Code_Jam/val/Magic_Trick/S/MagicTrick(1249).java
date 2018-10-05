package methodEmbedding.Magic_Trick.S.LYD1999;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String source = "A-small-attempt5.in";
		String output = "magicianSource";
		int[] arr = new int[4];
		int[] arr2 = new int[4];
		int firstRow;
		int secondRow;
		int numTests;
		int number = 0;
		int count = 0;
		String message = null;
		Scanner in = new Scanner(new FileReader(source));
		PrintWriter out = new PrintWriter(output);
		
		try
		{
			numTests = in.nextInt();
			for (int i = 0; i < numTests; i++)
			{
				firstRow = in.nextInt();
				switch (firstRow)
				{
				case 1:
					for (int j = 0; j < 4; j++)
					{
						arr[j] = in.nextInt();
					}
					;
					in.next();
					in.nextLine();
					in.nextLine();
					in.nextLine();
					break;
				case 2:
					in.next();
					in.nextLine();
					for (int j = 0; j < 4; j++)
					{
						arr[j] = in.nextInt();
					}
					;
					in.next();
					in.nextLine();
					in.nextLine();
					break;
				case 3:
					in.next();
					in.nextLine();
					in.nextLine();
					for (int j = 0; j < 4; j++)
					{
						arr[j] = in.nextInt();
					}
					;
					in.next();
					in.nextLine();
					break;
				case 4:
					in.next();
					in.nextLine();
					in.nextLine();
					in.nextLine();
					for (int j = 0; j < 4; j++)
					{
						arr[j] = in.nextInt();
					}
					;
					break;
				}
				secondRow = in.nextInt();
				switch (secondRow)
				{
				case 1:
					for (int j = 0; j < 4; j++)
					{
						arr2[j] = in.nextInt();
					}
					;
					in.next();
					in.nextLine();
					in.nextLine();
					in.nextLine();
					break;
				case 2:
					in.next();
					in.nextLine();
					for (int j = 0; j < 4; j++)
					{
						arr2[j] = in.nextInt();
					}
					;
					in.next();
					in.nextLine();
					in.nextLine();
					break;
				case 3:
					in.next();
					in.nextLine();
					in.nextLine();
					for (int j = 0; j < 4; j++)
					{
						arr2[j] = in.nextInt();
					}
					;
					in.next();
					in.nextLine();
					break;
				case 4:
					in.next();
					in.nextLine();
					in.nextLine();
					in.nextLine();
					for (int j = 0; j < 4; j++)
					{
						arr2[j] = in.nextInt();
					}
					;
					break;
				}
				for (int a = 0; a < 4; a++)
				{
					for (int b = 0; b < 4; b++)
					{
						if (arr[a] == arr2[b])
						{
							number = arr2[b];
							count++;
						}
					}
				}
				if (count == 0)
				{
					System.out.println("Case #" + (i + 1) + ": " + count + "arr: " + arr[0] + " arr2 : " + arr2[0]);
					message = "Volunteer cheated!";
				}	
				else if (count == 1)
				{
					System.out.println("Case #" + (i + 1) + ": " + count + "arr: " + arr[0] + " arr2 : " + arr2[0]);
					message = Integer.toString(number);
				}
				else
				{
					System.out.println("Case #" + (i + 1) + ": " + count + "arr: " + arr[0] + " arr2 : " + arr2[0]);
					message = "Bad magician!";
				}
				out.println("Case #" + (i + 1) + ": " + message);
				count = 0;
				
			}
		}
		finally
		{
			in.close();
			out.close();
		}
	}
}
