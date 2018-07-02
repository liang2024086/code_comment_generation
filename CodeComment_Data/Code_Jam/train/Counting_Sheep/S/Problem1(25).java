package methodEmbedding.Counting_Sheep.S.LYD654;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("text1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("text.out")));
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int a = in.nextInt();
			int s = 0;
			ArrayList<Integer> Array = new ArrayList<Integer>();
			for (int count = 0; count < 10; count++) {
				Array.add(count);
			}
			if (a == 0) {
				out.println("Case #" + (i + 1) + ": INSOMNIA");
			} else {
				int m = 1;
				while (!Array.isEmpty()) {
					s = a * m;
					String num = String.valueOf(s);
					for (int j = 0; j < num.length(); j++) {
						char ch = num.charAt(j);
						int na = Character.getNumericValue(ch);
						int index = Array.indexOf(na);

						try {
							Array.remove(index);
						} catch (ArrayIndexOutOfBoundsException e) {

						}
					}
					m++;
				}
				out.println("Case #" + (i + 1) + ": " + s);
			}
		}
		in.close();
		out.close();
	}

}
