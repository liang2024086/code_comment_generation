package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1021;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class pancakes {

	public static void main(String[] args) throws IOException {
		// count how many times it switches, starting from bottom
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		//System.out.println("HELLO");
		//Scanner in = new Scanner(System.in);
		PrintWriter fileOut = new PrintWriter(new FileWriter("pancakes.out"));
		int T = in.nextInt();
		in.nextLine();
		for (int test = 1; test <= T; test++)
		{
			String code = in.nextLine();
			char last = code.charAt(code.length()-1);
			int count = 0;
			if (last == '-')
			{
				count++;
			}
			for (int i = code.length()-2; i >= 0; i--)
			{
				if (code.charAt(i) != last)
				{
					count++;
				}
				last = code.charAt(i);
			}
			fileOut.printf("Case #%d: %d\n", test, count);
		}
		fileOut.close();

	}

}
