package methodEmbedding.Revenge_of_the_Pancakes.S.LYD418;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class B
{

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		//PrintWriter out = new PrintWriter(System.out);
		PrintWriter out = new PrintWriter(new File("B.out"));
		
		for (int t = Integer.valueOf(in.nextLine()), cs = 1; t > 0; t--, cs++) {
			out.print("Case #" + cs + ": ");
			
			char[] s = (in.nextLine() + "+").toCharArray();
			int ans = 0;
			char p = s[0];
			for (int i = 1; i < s.length; i++) {
				if (s[i] != p) {
					ans++;
				}
				p = s[i];
			}
			
			out.println(ans);
		}

		out.flush();
	}
}
