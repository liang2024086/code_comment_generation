package methodEmbedding.Magic_Trick.S.LYD1022;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("A.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("A.out"));
		int t = Integer.parseInt(in.readLine().trim());
		for (int i = 0; i < t; i++) {
			out.append("Case #" + (i + 1) + ": ");
			int row = Integer.parseInt(in.readLine().trim());
			int j = 1;
			for (; j < row; j++)
				in.readLine();
			String[] ret = in.readLine().split("\\s+");
			j++;
			for (; j <= 4; j++)
				in.readLine();
			row = Integer.parseInt(in.readLine().trim());
			j = 1;
			for (; j < row; j++)
				in.readLine();
			String[] ret2 = in.readLine().split("\\s+");
			j++;
			for (; j <= 4; j++)
				in.readLine();
			HashSet<String> S = new HashSet<String>();
			for (String s : ret)
				S.add(s);
			ArrayList<String> res = new ArrayList<String>();
			for (String s : ret2) {
				if (S.contains(s))
					res.add(s);
			}

			if (res.size() == 0) {
				out.append("Volunteer cheated!");
			} else if (res.size() > 1) {
				out.append("Bad magician!");

			} else {
				out.append(res.get(0));
			}
			out.newLine();
		}
		out.flush();
		out.close();

	}

}
