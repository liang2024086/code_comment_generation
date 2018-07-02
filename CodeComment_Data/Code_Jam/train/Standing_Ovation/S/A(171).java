package methodEmbedding.Standing_Ovation.S.LYD685;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader(new File("a.in")));
		PrintWriter pw = new PrintWriter("a.out");

		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {

			int l = sc.nextInt();
			String s = sc.nextLine();
			// System.out.println(l);
			// System.out.println(s);
			int cnt = 0;
			int added = 0;
			for (int i = 0; i <= l; i++) {
				if (i > cnt) {
					int need = i - cnt;
					// System.out.println("+" + need);
					added += need;
					cnt += need;
				}
				cnt += s.charAt(i + 1) - '0';
				// System.out.println("="+cnt);
			}
			pw.printf("Case #%d: %d\n", t, added);
		}
		sc.close();
		pw.close();
	}

}
