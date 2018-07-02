package methodEmbedding.Counting_Sheep.S.LYD1338;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Sheep {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			int n = in.nextInt();
			ArrayList<String> sleep = new ArrayList<String>();
			for (int j=0; j<10; j++) {
				sleep.add(j+"");
			}
			int count = 1;
			int multiply = 0;
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
			} else {
				while (n != 0 && !sleep.isEmpty()) {
					multiply = n * count;
					String mul = multiply + "";
					char[] cc = mul.toCharArray();
					for (int y=0;y<cc.length;y++) {
						String get = cc[y]+"";
						sleep.remove(get);
					}
					count ++;
				}
				
				System.out.println("Case #" + i + ": " + multiply + "");
			}
		}
	}
}
