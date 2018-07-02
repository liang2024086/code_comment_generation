package methodEmbedding.Revenge_of_the_Pancakes.S.LYD302;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FlipPancake {
	private static String FileNameOut = "/home/lcc/workspace/CodeJam/result1.txt";
	private static String FileNameIn = "/home/lcc/workspace/CodeJam/B-small-attempt0.in";
	public static void main(String[] args) {


		try {
			Scanner sc = new Scanner(new File(FileNameIn));

			PrintWriter pw = new PrintWriter(FileNameOut);
			int T = sc.nextInt();
			
			for (int t = 0; t < T; t++) {
				String S = sc.next();
				int i = 0;
				int iBefore = 0;
				long flip = 0;
				int step = 1;
				while (i < S.length()) {
					while ( (i < S.length()) && ( S.charAt(i) == '-') ) {
						i++;
					}
					if (i > iBefore) {
						flip += step;
						
						
					}
					while ( (i < S.length()) && ( S.charAt(i) == '+') ) {
						i++;
					}
					iBefore = i;
					step = 2;
				}
				System.out.printf("Case #%d: %d\n",t+1,flip);
				pw.printf("Case #%d: %d\n",t+1,flip);
			}
			pw.flush();
			pw.close();
			sc.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
