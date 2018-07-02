package methodEmbedding.Counting_Sheep.S.LYD997;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {

		File fin = new File("input.in");
		File fout = new File("output.out");

		Scanner in = new Scanner(fin);
		PrintWriter out = new PrintWriter(fout);

		HashSet<Integer> numSet = new HashSet<Integer>();

		int T = in.nextInt();
		int so, s, c, clone;
		String solution;

		for (int cT = 1; cT <= T; cT++) {
			numSet.clear();
			s = so = in.nextInt();
			c = 1;
			if (so != 0){
				while (numSet.size() < 10) {
					s = so * c;
					clone = s;
					while (clone > 0) {
						numSet.add(clone % 10);
						clone /= 10;
					}
					c++;
				}
				solution = s + "";
			}
			else solution = "INSOMNIA";
			out.println("Case #" + cT + ": " + solution);
		}

		in.close();
		out.close();
	}

}
