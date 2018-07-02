package methodEmbedding.Magic_Trick.S.LYD677;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException,
			FileNotFoundException {
		String input = "A-small-attempt0.in";
		String output = "A-small-attempt0.out";
		// String input = "A-large.in";
		// String output = "A-large.out";

		Scanner scan = new Scanner(new BufferedReader(new FileReader(input)));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(
				output)));

		int T = Integer.parseInt(scan.nextLine());
		for (int t = 1; t <= T; t++) {
			int num = Integer.parseInt(scan.nextLine());
			HashSet<Integer> ans1 = new HashSet<Integer>();
			for (int i = 1; i <= 4; i++) {
				String[] line = scan.nextLine().split(" ");
				if (i == num)
					for (int j = 0; j < 4; j++)
						ans1.add(Integer.parseInt(line[j]));
			}
			num = Integer.parseInt(scan.nextLine());
			ArrayList<Integer> ans2 = new ArrayList<Integer>();
			for (int i = 1; i <= 4; i++) {
				String[] line = scan.nextLine().split(" ");
				if (i == num)
					for (int j = 0; j < 4; j++) {
						int ans = Integer.parseInt(line[j]);
						if (ans1.contains(ans))
							ans2.add(ans);
					}
			}
			pw.print("Case #" + t + ": ");
			if (ans2.size() == 1)
				pw.println(ans2.remove(0));
			else if (ans2.size() == 0)
				pw.println("Volunteer cheated!");
			else
				pw.println("Bad magician!");
		}

		scan.close();
		pw.close();
	}

}
