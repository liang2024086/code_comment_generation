package methodEmbedding.Magic_Trick.S.LYD866;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class magic_trick {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("A-small.out", "UTF-8");
		
		int t = Integer.parseInt(br.readLine());
		for (int test = 0; test < t; test++) {
			pw.print("Case #" + (test + 1) + ": ");
			ArrayList<Integer> possible = new ArrayList<Integer>();
			ArrayList<Integer> initial = new ArrayList<Integer>();
			int r1 = Integer.parseInt(br.readLine());
			for (int i = 0; i < 4; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				if (i + 1 == r1) {
					for (int j = 0; j < 4; j++) {
						initial.add(Integer.parseInt(st.nextToken()));
					}
				}
			}
			int r2 = Integer.parseInt(br.readLine());
			for (int i = 0; i < 4; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				if (i + 1 == r2) {
					for (int j = 0; j < 4; j++) {
						int temp = Integer.parseInt(st.nextToken());
						if (initial.contains(temp)) {
							possible.add(temp);
						}
					}
				}
			}
			if (possible.size() == 0) {
				pw.println("Volunteer cheated!");
			} else if (possible.size() > 1) {
				pw.println("Bad magician!");
			} else {
				pw.println("" + possible.get(0));
			}
		}
		
		br.close();
		pw.close();
	}
}
