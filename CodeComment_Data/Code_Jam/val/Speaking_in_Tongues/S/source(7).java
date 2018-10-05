package methodEmbedding.Speaking_in_Tongues.S.LYD814;


import java.io.PrintWriter;
import java.util.Scanner;

public class PA {

	/**
	 * @param args
	 */
	static char[] map = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k',
		'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			pw.print("Case #" + i + ": ");
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++)
			{
				char ch = str.charAt(j);
				if (ch != ' ')
					pw.print(map[ch - 'a']);
				else
					pw.print(ch);
			}
			pw.println();
		}
		pw.flush();
	}

}
