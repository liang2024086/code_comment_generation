package methodEmbedding.Standing_Ovation.S.LYD1483;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Test1 {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));
		Scanner in = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int tt = 0;
			int aa = 0;
			int smax = in.nextInt();
			String ss = in.next();
			System.out.println(ss);
			for (int j = 0; j < smax + 1; j++) {
				int h1 = Integer.parseInt(ss.substring(j, j+1));
				//int h2 = Integer.parseInt(ss.substring(j+1, j+2));
				int h2 = j + 1;
				tt += h1;
				if (h2 > tt) {
					aa += h2 - tt;
					tt += h2 - tt;
				}
			}
			//System.out.println("Case #" + (i+1) +": " + aa);
			bw.write("Case #" + (i+1) +": " + aa + "\n");
			bw.flush();
		}
	}
}
