package methodEmbedding.Standing_Ovation.S.LYD390;

import static java.lang.Integer.parseInt;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTests = parseInt(sc.nextLine());
		for (int t = 1; t <= numberOfTests; t++) {
			String in = sc.nextLine();
			String[] a = in.split(" ");
			int sMax = parseInt(a[0]);
			String ins = a[1];
			int additional = 0;
			int audience = 0;
			for (int i = 0; i<ins.length(); i++) {
				int peop = parseInt("" + ins.charAt(i));
				if (peop == 0) {
					continue;
				}
				
				while (audience < i) {
					additional++;
					audience++;
				}
				audience += peop;
			}
			System.out.println(String.format("Case #%s: %s", t, additional));
		}
		sc.close();
	}
}
