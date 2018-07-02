package methodEmbedding.Speaking_in_Tongues.S.LYD835;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		char[] rep = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i',
				'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f',
				'm', 'a', 'q' };

		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter p = new PrintWriter(new File("out.txt"));

		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= n; i++)
		{
			char[] a = scan.nextLine().toCharArray();
			for (int k = 0; k < a.length; k++)
				if (a[k] != ' ')
					a[k] = rep[a[k] - 'a'];
			p.println("Case #" + i + ": " + new String(a));
		}

		p.close();
		scan.close();
	}
}
