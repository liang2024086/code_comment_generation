package methodEmbedding.Magic_Trick.S.LYD936;

import java.util.*;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = 1, cases = Integer.parseInt(sc.nextLine());
		int row;
		String line;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int match;
		int curr;

		Scanner lineSc;

		int i;

		while(test <= cases)
		{
			nums.clear();
			match = -1;

			row = Integer.parseInt(sc.nextLine());

			for(i = 1; i < row; i++)
			{
				sc.nextLine();
			}

			line = sc.nextLine();
			lineSc = new Scanner(line);

			while(lineSc.hasNextInt())
			{
				nums.add(lineSc.nextInt());
			}

			for(i = row + 1; i <= 4; i++)
			{
				sc.nextLine();
			}

			row = Integer.parseInt(sc.nextLine());

			for(i = 1; i < row; i++)
			{
				sc.nextLine();
			}

			line = sc.nextLine();
			lineSc = new Scanner(line);

			while(lineSc.hasNextInt())
			{
				curr = lineSc.nextInt();
				if(nums.contains(curr))
				{
					if(match == -1)
						match = curr;
					else match = -2;
				}
			}

			for(i = row + 1; i <= 4; i++)
			{
				sc.nextLine();
			}

			System.out.print("Case #" + test + ": ");

			if(match >= 0)
				System.out.println(match);
			else if(match == -1)
				System.out.println("Volunteer cheated!");
			else System.out.println("Bad magician!");

			test++;
		}
	}
}
