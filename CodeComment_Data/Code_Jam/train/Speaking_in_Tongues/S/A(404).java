package methodEmbedding.Speaking_in_Tongues.S.LYD1354;

import java.util.*;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = 1, cases = Integer.parseInt(sc.nextLine());
		int p;
		String s;
//			      ABCDEFGHIJKLMNOPQRSTUVWXYZ
		String key = "YHESOCVXDUIGLBKRZTNWJPFMAQ";

		while(test <= cases)
		{
			s = sc.nextLine();

			for(p = 0; p < 26; p++)
			{
				s = s.replace((char) ('a' + p), key.charAt(p));
			}

			s = s.toLowerCase();

			System.out.println("Case #" + test + ": " + s);

			test++;
		}
	}
}
