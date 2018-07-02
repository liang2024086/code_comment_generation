package methodEmbedding.Speaking_in_Tongues.S.LYD1557;

import java.util.*;
public class Tongues {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int cases=in.nextInt();
		char[] convert=new char[]{'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		in.nextLine();
		for(int i=1; i<=cases; i++)
		{
			String line=in.nextLine();
			System.out.printf("Case #%d: ",i);
			for(char c: line.toCharArray())
			{
				if(c!=' ')
					System.out.print(convert[c-'a']);
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
