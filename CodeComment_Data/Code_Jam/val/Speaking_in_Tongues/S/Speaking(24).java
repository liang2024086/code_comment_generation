package methodEmbedding.Speaking_in_Tongues.S.LYD380;

import java.util.Scanner;


public class Speaking {
	private static char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 
						// a    b    c	  d    e    f    g    h    i    j    k    l    m    n    o    p    q    r
			  'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		    // s    t    u    v    w    x    y    z
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int C = 1;C<=N;C++)
		{
			System.out.printf("Case #%d: ", C);
			String line = sc.nextLine();
			for (int i=0;i<line.length();i++)
			{
				char c = line.charAt(i);
				if (c == ' ') System.out.print(' ');
				else System.out.print(map[c-'a']);
			}
			System.out.println();
		}
	}
}
