package methodEmbedding.Standing_Ovation.S.LYD2127;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StandingOvation {

	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		try {
			scan = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int testcases = scan.nextInt();
		int maxShy = 0;
		int audience = 0;
		int standing;
		int added;
		for (int i = 1; i <= testcases; i++)
		{
			added = 0;
			standing = 0;
			maxShy = scan.nextInt();
			int[] arr = new int[maxShy + 1];
			audience = scan.nextInt();
			int x = maxShy;
			
			//populate array
			while (x >= 0)
			{
				arr[x] = audience % 10;
				audience = audience/10;
				x--;
			}
			x = 0;
			while (x < maxShy+1)
			{
				if (standing >= x)
				{
					standing += arr[x];
					x++;
				}
				else
				{
					added++;
					standing++;
				}
			}
			System.out.println("Case #" + i + ": " + added);
		}
	}
}
