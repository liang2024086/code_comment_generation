package methodEmbedding.Magic_Trick.S.LYD1622;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;

public class QualA {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.setIn(new FileInputStream(new File("input.in")));
		System.setOut(new PrintStream(new File("output.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int test = 1; test <= t; test++) {
			System.out.print("Case #" + test + ": ");
			int ch1 = Integer.parseInt(in.readLine());
			HashSet<Integer> ans1 = new HashSet<Integer>();
			int res = 0;
			int resAns = -1;
			for (int i = 0; i < 4; i++) {
				if (i == ch1 - 1) {
					String[] a = in.readLine().split(" ");
					for (int j = 0; j < a.length; j++) {
						ans1.add(Integer.parseInt(a[j]));
					}
				} else
					in.readLine();
			}
			int ch2 = Integer.parseInt(in.readLine());
			for (int i = 0; i < 4; i++) {
				if (i == ch2 - 1) {
					String[] a = in.readLine().split(" ");
					for (int j = 0; j < a.length; j++) {
						if (ans1.contains(Integer.parseInt(a[j]))) {
							res++;
							resAns = Integer.parseInt(a[j]);
						}
					}
				} else
					in.readLine();
			}
			if (res == 0) {
				System.out.println("Volunteer cheated!");
			} else if (res > 1) {
				System.out.println("Bad magician!");
			} else {
				System.out.println(resAns);
			}
		}
	}
}
