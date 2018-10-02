package methodEmbedding.Standing_Ovation.S.LYD810;

import java.util.*;
import java.io.*;
public class Problem1
{	
	public static void main(String []args) throws IOException
	{
		PrintWriter writer = new PrintWriter(new File ("Output.txt"));
		Scanner Thing = new Scanner(new File("1.txt"));
		int numberofcases = Thing.nextInt();
		for (int i=0; i< numberofcases; i++)
		{
			int []audi = new int[Thing.nextInt()+1];
			int bnumber = Thing.nextInt();
			int friends = 0;
			for ( int j=audi.length; j> 0; j--)
				{
					int x = bnumber%10;
					bnumber = bnumber/10;
					audi[j-1] = x;
				}
					int sum = audi[0];
					for(int k = 1; k < audi.length; k++)
					{
						int temp = k;
						if (temp > friends + sum)
						{
							friends += k-(friends + sum);
							sum+= audi[k];
						}
						else
						{
						sum += audi[k];
						}
					}
					writer.printf( "Case #%s: " + friends + "\n", i+1);
		}
	writer.close();
	}
}
