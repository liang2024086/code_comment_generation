package methodEmbedding.Speaking_in_Tongues.S.LYD1074;

import java.util.*;
public class a {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	char[] data = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	int n = input.nextInt();
	input.nextLine();
	for(int ca = 0; ca < n; ca++)
	{
		System.out.print("Case #" + (ca+1) + ": ");
		String str = input.nextLine();
		for(char c: str.toCharArray())
		{
			if(c - 'a' >= 0 && c - 'a' < 26)
				System.out.print(data[c-'a']);
			else
				System.out.print(c);
		}
		System.out.println();
	}
}
}
