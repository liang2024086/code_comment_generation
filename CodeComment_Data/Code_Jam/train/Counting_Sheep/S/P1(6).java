package methodEmbedding.Counting_Sheep.S.LYD1689;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class P1 {

	public static void main(String[] args) throws Exception {
		// BufferedReader in = new BufferedReader(new
		// InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new PrintWriter(new File("A-small-attempt0.out")));
		int max = Integer.parseInt(in.readLine());
		for (int num = 1; num <= max; num++) {
			boolean[] seen = new boolean[10];
			int count = 0;
			int save = Integer.parseInt(in.readLine()), no = save;
			if (save != 0) {
				while (count < 10) {
					int temp = no;
					while (temp > 0) {
						if (!seen[temp % 10]) {
							seen[temp % 10] = true;
							count++;
						}
						temp = temp / 10;
					}
					no += save;
				}
				//System.out.println("Case #" + num + ": " + (no - save));
				out.write("Case #" + num + ": " + (no - save) + "\n");
			} else {
				//System.out.println("Case #" + num + ": INSOMNIA");
				out.write("Case #" + num + ": INSOMNIA" + "\n");
			}
		}
		out.close();
		in.close();
	}

}
