package methodEmbedding.Magic_Trick.S.LYD501;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("OUTPUT.TXT");
		int t = in.nextInt();
		int tmp;
		int row1, row2;
		HashSet<Integer> candidates1 = new HashSet<>(),
				candidates2 = new HashSet<>();
		for (int t0 = 0; t0 < t; ++t0){
			row1 = in.nextInt()-1;
			candidates1.clear();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					tmp = in.nextInt();
					if (i==row1) candidates1.add(tmp);
				}
			}
			row2 = in.nextInt()-1;
			candidates2.clear();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					tmp = in.nextInt();
					if (i==row2) candidates2.add(tmp);
				}
			}
			candidates1.retainAll(candidates2);
			out.println(String.format("Case #%d: %s", t0+1,
					candidates1.size()==1?
							String.valueOf(candidates1.toArray()[0]):
							candidates1.size()>1?"Bad magician!":"Volunteer cheated!"));
		}
		in.close();
		out.close();
	}

}
