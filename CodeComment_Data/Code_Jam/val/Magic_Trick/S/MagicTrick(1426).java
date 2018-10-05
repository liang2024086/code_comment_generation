package methodEmbedding.Magic_Trick.S.LYD109;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MagicTrick
{
	public static final String BAD_MAGICIAN = "Bad magician!";
	public static final String BAD_VOLUNTEER = "Volunteer cheated!";

	public static void main(String[] args)
		throws IOException
	{
		File input;
		BufferedReader br;
		try
		{
			input = new File(args[0]);
			br = new BufferedReader(new FileReader(input));
		} catch (ArrayIndexOutOfBoundsException | FileNotFoundException e)
		{
			return;
		}

		int testCases = Integer.parseInt(br.readLine());
		List<TestCase> cases = new ArrayList<>(testCases);

		for (int i = 0; i < testCases; i++)
		{
			Choice choice1 = new Choice();
			choice1.chosenRow = Integer.parseInt(br.readLine()) - 1;
			for (int j = 0; j < 4; j++)
			{
				String[] strs = br.readLine().split(" ");
				for (int k = 0; k < strs.length; k++)
				{
					choice1.arr[j][k] = Integer.parseInt(strs[k]);
				}
			}
			Choice choice2 = new Choice();
			choice2.chosenRow = Integer.parseInt(br.readLine()) - 1;
			for (int j = 0; j < 4; j++)
			{
				String[] strs = br.readLine().split(" ");
				for (int k = 0; k < strs.length; k++)
				{
					choice2.arr[j][k] = Integer.parseInt(strs[k]);
				}
			}
			cases.add(new TestCase(choice1, choice2));
		}

		for (int i = 0; i < cases.size(); i++)
		{
			int chosenCard = 0;
			int findCount = 0;

			TestCase t = cases.get(i);
			/*
			System.out.println("Case #" + (i + 1));
			System.out.println("CHOSEN ROW 1 :" + t.one.chosenRow);
			System.out.println("CHOSEN ROW 2 :" + t.two.chosenRow);
			*/

			for (int j = 0; j < 4; j++)
			{
				//System.out.println("VAL J : " + t.one.arr[t.one.chosenRow][j]);
				for (int k = 0; k < 4; k++)
				{
					//System.out.println("VAL K : " + t.two.arr[t.two.chosenRow][k]);
					if (t.one.arr[t.one.chosenRow][j] == t.two.arr[t.two.chosenRow][k])
					{
						chosenCard = t.one.arr[t.one.chosenRow][j];
						findCount++;
					}
				}
			}

			/*
			System.out.println("FIND COUNT :" + findCount);
			System.out.println("SELECTED CARD :" + chosenCard);
			*/

			if (findCount == 1)
			{
				System.out.println("Case #" + (i + 1) + ": " + chosenCard);
			} else if (findCount > 1)
			{
				System.out.println("Case #" + (i + 1) + ": " + BAD_MAGICIAN);
			} else if (findCount < 1)
			{
				System.out.println("Case #" + (i + 1) + ": " + BAD_VOLUNTEER);
			}

			//System.out.println("====================================================");
		}
	}
}
