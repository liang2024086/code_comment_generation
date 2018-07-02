package methodEmbedding.Magic_Trick.S.LYD492;


import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;

public class A {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		FileWriter out = new FileWriter("A-out.txt");
		String carriage = System.getProperty("line.separator");
		int t = Integer.parseInt(in.readLine());
		for (int kase = 0; kase < t; kase++) {
			int first = Integer.parseInt(in.readLine()) - 1;
			int[] chosen = new int[16];
			for (int i = 0; i < 4; i++) {
				String line = in.readLine();
				if (i == first) {
					String[] tokens = line.split(" ");
					for (int j = 0; j < 4; j++) {
						chosen[Integer.parseInt(tokens[j]) - 1]++;
					}
				}
			}

			int second = Integer.parseInt(in.readLine()) - 1;
			for (int i = 0; i < 4; i++) {
				String line = in.readLine();
				if (i == second) {
					String[] tokens = line.split(" ");
					for (int j = 0; j < 4; j++) {
						chosen[Integer.parseInt(tokens[j]) - 1]++;
					}
				}
			}
			LinkedList<Integer> sol = new LinkedList<Integer>();
			for (int i = 0; i < chosen.length; i++) {
				System.out.print(chosen[i] + " ");
				if (chosen[i] == 2)
					sol.add(i + 1);
			}
			String result;
			if (sol.size() == 0) {
				result = "Case #" + (kase + 1) + ": Volunteer cheated!";
			} else if (sol.size() == 1) {
				result = "Case #" + (kase + 1) + ": " + sol.poll();
			} else {
				result = "Case #" + (kase + 1) + ": Bad magician!";
			}
			System.out.println(result);
			out.append(result);
			out.append(carriage);
		}
		out.close();
	}
}
