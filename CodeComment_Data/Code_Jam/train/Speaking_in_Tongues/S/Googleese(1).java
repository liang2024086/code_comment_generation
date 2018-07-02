package methodEmbedding.Speaking_in_Tongues.S.LYD1408;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Googleese 
{

	public static void main(String[] args)
	{
		Scanner scan = null;
		try
		{
			scan = new Scanner(new File (args[0]));
		}
		catch (FileNotFoundException e)
		{
			return;
		}
		int x = Integer.parseInt(scan.nextLine());
		HashMap<String, String> set = new HashMap<String, String>();
		set.put("y", "a");
		set.put("n", "b");
		set.put("f", "c");
		set.put("i", "d");
		set.put("c", "e");
		set.put("w", "f");
		set.put("l", "g");
		set.put("b", "h");
		set.put("k", "i");
		set.put("u", "j");
		set.put("o", "k");
		set.put("m", "l");
		set.put("x", "m");
		set.put("s", "n");
		set.put("e", "o");
		set.put("v", "p");
		set.put("z", "q");
		set.put("p", "r");
		set.put("d", "s");
		set.put("r", "t");
		set.put("j", "u");
		set.put("g", "v");
		set.put("t", "w");
		set.put("h", "x");
		set.put("a", "y");
		set.put("q", "z");
		String str;
		int j = 1;
		while(scan.hasNext())
		{
			System.out.print("Case #" + j  + ": ");
			str = scan.nextLine();
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) == ' ')
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(set.get(String.valueOf(str.charAt(i))));				
				}
			}
			j++;
			if (scan.hasNext())
			{
				System.out.println();
			}
		}
	}

}
