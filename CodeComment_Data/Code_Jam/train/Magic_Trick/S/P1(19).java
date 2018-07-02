package methodEmbedding.Magic_Trick.S.LYD2126;

import java.io.*;
import java.util.*;

public class P1 {
	public static void main (String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner (System.in);
//		PrintStream op = System.out;
		Scanner sc = new Scanner (new FileInputStream ("D:\\Internet\\A-small-attempt0.in"));
		PrintStream op = new PrintStream ("D:\\Internet\\output.txt");
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			Set <Integer> s = new HashSet<Integer>();
			int r = sc.nextInt();
			r--;
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j < 4; j++) {
					int val = sc.nextInt();
					if (k == r) {
						s.add(val);
					}
				}
			}
			int count = 0;
			r = sc.nextInt();
			r--;
			int ans = -1;
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j < 4; j++) {
					int val = sc.nextInt();
					if (k == r && s.contains(val)) {
						count++;
						ans = val;
					}
				}
			}
			op.print("Case #" + i + ": ");
			if (count == 1)
				op.println(ans);
			else if (count == 0)
				op.println("Volunteer cheated!");
			else
				op.println("Bad magician!");
		}
		sc.close();
	}
}
