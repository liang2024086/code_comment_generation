package methodEmbedding.Standing_Ovation.S.LYD2061;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CodeJam {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt2.in"));
		PrintWriter out = new PrintWriter("out.txt");
		int nTests = in.nextInt();
		for(int currentTest = 0; currentTest < nTests; ++currentTest) {
			int shinessMax = in.nextInt();
			String shinessStr = in.next();
			int[] a = new int[shinessMax+1];
			for(int currentShiness = 0; currentShiness < shinessMax + 1; ++currentShiness) {
				a[currentShiness] = shinessStr.charAt(currentShiness) - '0';
			}
			
			int minFriends = 0;
			int sum = a[0];
			for(int i=1;i<shinessMax + 1;++i) {
				if (a[i] > 0 ) {
					int b = i - sum - minFriends;
					if (b > 0) {
						minFriends += b;
					}
				}
				sum += a[i];
			}
			
			out.println("Case #" + (currentTest+1) + ": " + minFriends);
		}
		out.close();
	}

}
