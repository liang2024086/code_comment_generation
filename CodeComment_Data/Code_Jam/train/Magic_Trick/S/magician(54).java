package methodEmbedding.Magic_Trick.S.LYD911;

import java.io.*;
import java.util.*;

public class magician {

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("in.txt"));
		int m = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < m; i++)
		{
			int a = scan.nextInt();
			int[] b = new int[4];
			
			for(int k = 0; k < 4; k++)
			{
				for(int j = 0; j < 4; j++)
				{
					if(k + 1 == a)
					{
						b[j] = Integer.parseInt(scan.next());
					}
					else
					{
						scan.next();
					}
				}
			}
			
			int c = scan.nextInt();
			int[] d = new int[4];
			
			for(int k = 0; k < 4; k++)
			{
				for(int j = 0; j < 4; j++)
				{
					if(k + 1 == c)
					{
						d[j] = Integer.parseInt(scan.next());
					}
					else
					{
						scan.next();
					}
				}
			}
			
			System.out.printf("Case #%d: ", i + 1);
			int num = 0;
			A: for(int k = 0; k < 4; k++)
			{
				for(int j = 0; j < 4; j++)
				{
					if(b[j] == d[k])
					{
						if(num != 0)
						{
							System.out.println("Bad magician!");
							num = -1;
							break A;
						}
						else
						{
							num = b[j];
						}
					}
				}
			}
			if(num == 0)
			{
				System.out.println("Volunteer cheated!");
			}
			else if(num != -1)
			{
				System.out.println(num);
			}
			
		}
		
	}
	
}
