package methodEmbedding.Standing_Ovation.S.LYD504;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A
{

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		//PrintWriter out = new PrintWriter(System.out);
		PrintWriter out = new PrintWriter(new File("A.out"));
		
		for (int t = Integer.valueOf(in.nextLine()), cs = 1; t > 0; t--, cs++) {
			out.print("Case #" + cs + ": ");
			
			int n = in.nextInt();
			String s = in.next();
			int answer = 0, sum = 0;
			for (int i = 0; i <= n; i++) {
				int k = s.charAt(i) - '0';
				if (sum >= i) {
					sum += k;
				} else if (k > 0) {
					int invite = i - sum;
					answer += invite;
					sum += invite + k;
				}
			}
			
			out.println(answer);
		}

		out.flush();
	}
}
