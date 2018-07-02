package methodEmbedding.Counting_Sheep.S.LYD152;

import java.util.*;
import java.io.*;

public class Source {

	public static void main(String[] args) throws IOException {
		File file = new File("input.in");
		Scanner in = new Scanner(file);
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		int t = in.nextInt();
		for (int i = 1; i <= t; i++) {
			int first = in.nextInt();
			if (first == 0) {
				pw.println("Case #" + i + ": INSOMNIA");
			} else {
				ArrayList<Integer> ref = new ArrayList<Integer>();
				boolean test = false;
				int res = first;
				int k = 1;
				int cpt = 0;
				while (!test) {
					res = k * first;
					for (int j = 0; j < 10; j++) {
						if (!ref.contains(j)) {
							if (String.valueOf(res).contains(String.valueOf(j))) {
								cpt++;
								ref.add(j);
							}
						}
					}
					test = (cpt == 10);
					if (test) {
						pw.println("Case #" + i + ": " + res);
					}
					k++;

				}

			}

		}
		pw.flush();
		pw.close();
		in.close();

	}

}
