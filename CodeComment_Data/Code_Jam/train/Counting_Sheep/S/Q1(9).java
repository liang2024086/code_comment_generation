package methodEmbedding.Counting_Sheep.S.LYD1321;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Q1 {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		int numCases = Integer.parseInt(in.readLine());
		boolean[] digits;
		int digitsLeft;
		
		for(int i = 0; i < numCases; i++)
		{
			int N = Integer.parseInt(in.readLine());
			digitsLeft = 10;
			digits = new boolean[10];
			if(N==0)
			{
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
				continue;
			}
			limit:
			for(int counter = 0; counter < 1000000; counter++)
			{
				int currN = N*(counter+1);
				int temp = currN;
				while(temp != 0)
				{
					int digit = temp%10;
					if(!digits[digit])
					{
						digits[digit] = true;
						digitsLeft--;
						if(digitsLeft == 0)
						{
							System.out.println("Case #" + (i+1) + ": " + currN);
							break limit;
						}
					}
					temp/=10;
				}
			}
		}
	}
	
}
