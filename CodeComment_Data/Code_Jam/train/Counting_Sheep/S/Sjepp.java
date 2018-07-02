package methodEmbedding.Counting_Sheep.S.LYD200;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sjepp {

	static String filename = "A-small-attempt0.in";

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(filename));
		PrintWriter out = new PrintWriter(new File("sheepSmallOut.txt"));
		long numTests = in.nextLong();
		for (long test = 0; test < numTests; test++) {
			in.nextLine();
			long N = in.nextLong();
			long Nacc = N;
			long res = -1;
			boolean[] seen = new boolean[10];
			while (N != 0 && res == -1) {
				boolean finished = true;
				for (int digit = 0; digit < 10; digit++) {
					if (!seen[digit]) {
						if ((Nacc + "").indexOf(String.valueOf(digit)) != -1) {
							seen[digit] = true;
						} else {
							finished = false;
						}
					}
				}
				if (finished) {
					res = Nacc;
				} else {
					Nacc += N;
				}
			}
			out.print("Case #" + (test+1) + ": ");
			if(res >= 0){
				out.println(res);
			}
			else{
				out.println("INSOMNIA");
			}
		}
		out.close();
		in.close();
	}

}
