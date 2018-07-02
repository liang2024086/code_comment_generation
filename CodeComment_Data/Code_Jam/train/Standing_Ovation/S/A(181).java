package methodEmbedding.Standing_Ovation.S.LYD97;


import java.util.Scanner;

public class A {
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int cas = 1; cas <= T; cas++)
		{
			int max = in.nextInt();
			String dat = in.next();
			int standing = 0;
			int invited = 0;
			for (int i = 0; i<=max; i++)
			{
				int at = (int)(dat.charAt(i) - '0');
				if (standing < i)
				{
					invited += i - standing;
					standing = i;
				}
				standing += at;
			}
			
			System.out.println("Case #" + cas + ": " + invited);
		}
	}
}
