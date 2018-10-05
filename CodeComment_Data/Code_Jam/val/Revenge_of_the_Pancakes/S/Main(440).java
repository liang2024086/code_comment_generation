package methodEmbedding.Revenge_of_the_Pancakes.S.LYD615;


import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		String s = sc.nextLine();
		
		for(int testNum = 1; testNum <= tests; testNum++)
		{
			s = sc.nextLine().trim();
			System.out.print("Case #" + testNum + ": ");
			int steps = 0;
			if(s.charAt(s.length() - 1) == '-')
				steps++;
			
			for(int i = s.length() - 2; i >= 0; i--)
			{
				if(s.charAt(i) != s.charAt(i + 1))
					steps++;
			}
			
			System.out.println(steps);
		}
		
		sc.close();
	}

}
