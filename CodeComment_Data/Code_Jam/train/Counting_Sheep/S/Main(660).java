package methodEmbedding.Counting_Sheep.S.LYD408;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			al = new ArrayList();
			String no_s = in.next();
			int no_i = Integer.valueOf(no_s);
			String no1_s = "";

			int mult = 1;
			if (no_i == 0) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			} else {
				while (al.size() < 10) {
					int no1_i = no_i * mult;
					no1_s = String.valueOf(no1_i);
					// System.out.println(no1_s);
					for (int j = 0; j < no1_s.length(); j++) {
						if (!al.contains(no1_s.charAt(j))) {
							al.add(no1_s.charAt(j));
						}
					}
					mult++;
				}
				System.out.println("Case #" + (i + 1) + ": " + no1_s);
			}

		}
	}
}
