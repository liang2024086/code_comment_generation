package methodEmbedding.Magic_Trick.S.LYD1062;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class A {
	public static final String FILENAME = "A-small-attempt0";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("src/" + FILENAME
				+ ".in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("src/"
				+ FILENAME + ".out"));
		Scanner s = new Scanner(in);
		int T = s.nextInt();
		for (int i = 1; i <= T; i++) {
			s.nextLine();

			// first input
			List<Integer> la = new LinkedList<Integer>();
			int a = s.nextInt();
			for (int j = 1; j < a; j++) {
				for (int k = 0; k < 4; k++) {
					s.nextInt();
				}
			}
			for (int k = 0; k < 4; k++) {
				la.add(s.nextInt());
			}
			for (int j = a + 1; j <= 4; j++) {
				for (int k = 0; k < 4; k++) {
					s.nextInt();
				}
			}

			// second input
			List<Integer> lb = new LinkedList<Integer>();
			int b = s.nextInt();
			for (int j = 1; j < b; j++) {
				for (int k = 0; k < 4; k++) {
					s.nextInt();
				}
			}
			for (int k = 0; k < 4; k++) {
				lb.add(s.nextInt());
			}
			for (int j = b + 1; j <= 4; j++) {
				for (int k = 0; k < 4; k++) {
					s.nextInt();
				}
			}
			
			// intersect
			List<Integer> intersect = new LinkedList<Integer>();
			for(int t: la) {
				if(lb.contains(t)) {
					intersect.add(t);
				}
			}
			
			//output
			out.write("Case #"+i+": ");
			if(intersect.size() == 0) {
				out.write("Volunteer cheated!\n");
			}
			else if(intersect.size() > 1) {
				out.write("Bad magician!\n");
			}
			else {
				out.write(intersect.get(0)+"\n");
			}
		}
		in.close();
		out.close();
	}
}
