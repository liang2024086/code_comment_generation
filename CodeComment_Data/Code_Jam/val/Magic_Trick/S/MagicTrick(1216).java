package methodEmbedding.Magic_Trick.S.LYD875;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(
				"A-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"A-small-attempt1.out")));

		int t = Integer.parseInt(in.readLine());
		for (int i = 1; i <= t; i++) {
			int a = Integer.parseInt(in.readLine());
			int[] first = new int[4];
			for (int j = 0; j < first.length; j++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				if (j == a - 1)
					for (int k = 0; k < first.length; k++)
						first[k] = Integer.parseInt(st.nextToken());
			}

			int b = Integer.parseInt(in.readLine());
			int[] second = new int[4];
			for (int j = 0; j < second.length; j++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				if (j == b - 1)
					for (int k = 0; k < second.length; k++)
						second[k] = Integer.parseInt(st.nextToken());
			}

			int num = -1;
			A: for (int j = 0; j < first.length; j++)
				for (int k = 0; k < second.length; k++)
					if (num == -1 && first[j] == second[k]) {
						num = first[j];
						continue A;
					} else if (num != -1 && first[j] == second[k]) {
						num = 0;
						break A;
					}

			out.print("Case #" + i + ": ");
			if (num == 0)
				out.println("Bad magician!");
			else if (num == -1)
				out.println("Volunteer cheated!");
			else
				out.println(num);
		}
		
		in.close();
		out.close();
		System.exit(0);
	}

}
