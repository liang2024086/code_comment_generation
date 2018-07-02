package methodEmbedding.Magic_Trick.S.LYD1327;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;


public class A {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter (new File("ans.out"));
		int t = in.nextInt();
		for (int h = 1; h <= t; h++){
			out.print("Case #"+h+": ");
			TreeSet<Integer> a = new TreeSet<Integer>();
			TreeSet<Integer> b = new TreeSet<Integer>();
			int x = in.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					int y = in.nextInt();
					if (i == x) a.add(y);
				}
			}
			x = in.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					int y = in.nextInt();
					if (i == x) b.add(y);
				}
			}
			a.retainAll(b);
			if (a.size() == 0) {
				out.println("Volunteer cheated!");
			} else if (a.size() == 1) {
				out.println(a.first());
			} else {
				out.println("Bad magician!");
			}
		}
		out.flush();
	}

}
