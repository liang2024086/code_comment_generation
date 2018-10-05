package methodEmbedding.Magic_Trick.S.LYD917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;


public class MagicTrick {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(), i = 0, k;
		LinkedList<Integer> cards = new LinkedList<Integer>(), result = new LinkedList<Integer>();
		Integer current;
		while (i++ < T)
		{
			System.out.print("Case #" + i + ": ");
			cards.clear();
			result.clear();
			int j = in.nextInt();
			for (k = 4 * (j - 1); k > 0; --k)
				in.nextInt();
			for (k = 0; k < 4; ++k)
				cards.add(in.nextInt());
			for (k = 4 * (4 - j); k > 0; --k)
				in.nextInt();
			j = in.nextInt();
			for (k = 4 * (j - 1); k > 0; --k)
				in.nextInt();
			for (k = 0; k < 4; ++k)
			{
				if (cards.contains(current = new Integer(in.nextInt())))
					result.add(current);
			}
			for (k = 4 * (4 - j); k > 0; --k)
				in.nextInt();
			if (result.isEmpty())
			{
				System.out.println("Volunteer cheated!");
			} else if (result.size() > 1)
			{
				System.out.println("Bad magician!");
			} else {
				System.out.println(result.getFirst().toString());
			}
		}
		in.close();
	}
}
