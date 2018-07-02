package methodEmbedding.Magic_Trick.S.LYD1699;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Magician 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cs = sc.nextInt();
		for(int i = 0; i < cs; ++i)
		{
			int first = sc.nextInt();
			int cards[][] = new int[4][4];
			for(int q = 0; q < 4; ++q)
			{
				for(int k = 0; k < 4; ++k)
					cards[q][k] = sc.nextInt();
			}
			HashMap<Integer,HashSet<Integer>> cardArg = new HashMap<Integer,HashSet<Integer>>();
			for(int q = 0; q < 4; ++q)
			{
				cardArg.put((q+1),new HashSet<Integer>());
				for(int k = 0; k < 4; ++k)
					cardArg.get((q+1)).add(cards[q][k]);
			}
			int next = sc.nextInt();
			for(int q = 0; q < 4; ++q)
			{
				for(int k = 0; k < 4; ++k)
					cards[q][k] = sc.nextInt();
			}
			int row[] = cards[next-1];
			int count = 0;
			int num = -1;
			for(int x : row)
			{
				if(cardArg.get(first).contains(x))
				{
					++count;
					num = x;
				}
				
			}
			String base = "Case #" + (i+1)+": ";
			if(count > 1)
				base += "Bad magician!";
			else if(count == 1)
				base += num;
			else
				base += "Volunteer cheated!";
			System.out.println(base);
		}
	}
}
