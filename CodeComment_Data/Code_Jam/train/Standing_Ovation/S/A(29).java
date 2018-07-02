package methodEmbedding.Standing_Ovation.S.LYD2204;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new File("a_s.txt"));
		FileWriter w = new FileWriter(new File("a_s.out"));
		int c = s.nextInt();
		for (int i = 0; i < c; ++i) {
			int n = 0;
			int st = 0;
			int m = s.nextInt();
			String v = s.next();
					
			for (int j = 0; j <= m; ++j) {
				int p = v.charAt(j) - '0';
				if (p == 0) continue;
				int f = Math.max(j - st, 0);
				n += f;
				st += p + f;
			}
			
			w.write(String.format("Case #%d: %d\n", (i + 1), n));
		}
		
		w.close();
		s.close();
	}

}
