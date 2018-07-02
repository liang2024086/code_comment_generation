package methodEmbedding.Standing_Ovation.S.LYD814;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for (int zz = 1; zz <= T; zz++)
		{
			int Smax = scan.nextInt();
			String shyline = scan.next();
			int standers = (int)(shyline.charAt(0)-48);
			int friends = 0;
			
			for (int i = 1; i <= Smax; i++)
			{
				friends += Math.max(0, i-standers);
				standers += Math.max(0, i-standers) + (int)(shyline.charAt(i)-48);
			}
			System.out.print("Case #" + zz + ": ");
			System.out.println(friends);
		}
		
		scan.close();
	}
}
