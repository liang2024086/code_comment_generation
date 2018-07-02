package methodEmbedding.Speaking_in_Tongues.S.LYD68;

import java.io.*;
import java.util.*;

class A
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File(args[0]));

		int t;
		String english    = " abcdefghijklmnopqrstuvwxyz";
		String googlerese = " ynficwlbkuomxsevzpdrjgthaq";

		t = Integer.parseInt(in.nextLine());


		for (int i=0; i<t; i++)
		{
			String g = in.nextLine();
			String s = new String();

			for (int j = 0; j<g.length(); j++)
			{
				s = s + english.charAt(googlerese.indexOf(g.charAt(j)));
			}

			System.out.println("Case #" + (i+1) + ": " + s );
		}

	}
}
