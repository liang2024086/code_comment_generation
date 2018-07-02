package methodEmbedding.Counting_Sheep.S.LYD805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		String temp;
		if (t <= 100 && t > 0) {
			for (int i = 1; i <= t; ++i) {
				int n = in.nextInt();
				if (n <= 200 && n >= 0) {
					int j, r;
					int aux = 0;
					if (n != 0) {
						j = 1;
						temp = "";
						while (temp.length() < 10) {
							aux = n * j;
							r = aux;
							while (r > 0) {
								String mod = "" + (r % 10);
								if (temp.contains(mod) == false) {
									temp = temp + mod;
								}
								r = r / 10;
							}
							j++;

							System.out.println("Case #" + i + ": " + aux);
						}
					} else {
						System.out.println("Case #" + i + ": INSOMNIA");
					}
				}
			}
		}
	}
}
