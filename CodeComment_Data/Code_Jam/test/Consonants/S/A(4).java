package method_all.Consonants.S.LYD35;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		 Scanner in = new Scanner(new File("A.in"));
		 PrintWriter out = new PrintWriter("A.out");
//		Scanner in = new Scanner(System.in);
//		PrintWriter out = new PrintWriter(System.out);
		boolean[] v = new boolean[26];
		Arrays.fill(v, true);
		v['a' - 'a'] = false;
		v['e' - 'a'] = false;
		v['i' - 'a'] = false;
		v['o' - 'a'] = false;
		v['u' - 'a'] = false;
		int t = in.nextInt();
		int r = 0;
		while (t-- > 0) {
			r++;
			long res = 0;
			char[] a = in.next().toCharArray();
			int n = in.nextInt();
			int cnt = 0;
			int s = 0, e = -1;
			int ls = -1;
			while (true) {
				while (cnt < n && e < a.length - 1) {
					e++;
					if (v[a[e] - 'a'])
						cnt++;
					else {
						s = e + 1;
						cnt = 0;
					}
				}
				if (cnt == n) {
					res += (long)((long)a.length - (long)e) * (long)((long)s - (long)ls);
					ls = s;
					cnt--;
					s++;
				}
				if (e == a.length - 1 || s == a.length)
					break;
			}
			out.printf("Case #%d: %d\n", r, res);
		}
		out.close();
	}
}
