package methodEmbedding.Magic_Trick.S.LYD1340;

import java.util.Arrays;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, cases, first, second;
		cases = scan.nextInt();
		String[] result = new String[cases];
		for (num = 0; num < cases; ++num)
		{
			first = scan.nextInt();
			int[][] array = new int[4][4];
			for (int i = 0; i < 4; ++i)
			{
				for (int j = 0; j < 4; ++j)
					array[i][j] = scan.nextInt();
			}
			int[] row1 = new int[4];
			System.arraycopy(array[first-1],0,row1,0,4);
			
			second = scan.nextInt();
			for (int i = 0; i < 4; ++i)
			{
				for (int j = 0; j < 4; ++j)
					array[i][j] = scan.nextInt();
			}
			int[] row2 = new int[4];
			System.arraycopy(array[second-1],0,row2,0,4);
			
			int[] numbers = new int[8];
			System.arraycopy(row1, 0, numbers, 0, 4);
			System.arraycopy(row2, 0, numbers, 4, 4);
			Arrays.sort(numbers);
			
			int number = 0;
			int possibilities = 0;
			for (int i = 0; i < 7; ++i)
			{
				if (numbers[i] == numbers[i+1])
				{
					number = numbers[i];
					++possibilities;
				}
			}
			
			if(possibilities == 0)
				result[num] = "Volunteer cheated!";
			else if (possibilities == 1)
				result[num] = ""+number+"";
			else if (possibilities > 1)
				result[num] = "Bad magician!";
		}
		scan.close();
		
		for (num = 1; num <= cases; ++num)
		{
			System.out.print("Case #"+num+": ");
			System.out.println(result[num-1]);
		}
	}
}
