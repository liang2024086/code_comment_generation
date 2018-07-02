package methodEmbedding.Speaking_in_Tongues.S.LYD320;

import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String[] args) throws Exception {
		Map<String, String> mp = new TreeMap<String, String>();
		mp.put("z","q");
		mp.put("q","z");
		Scanner sc = new Scanner(new File("key.txt"));
		int len = sc.nextInt();
		sc.useDelimiter("\n");
		String[] in = new String[len];
		String[] out = new String[len];
		for (int i = 0; i < len; i++) {
			in[i] = sc.next();
		}
		for (int i = 0; i < len; i++) {
			out[i] = sc.next();
		}
		for (int i = 0; i < len; i++) {
			for (int a = 0; a < in[i].length(); a++) {
				mp.put(""+in[i].charAt(a), ""+out[i].charAt(a));
			}
		}
		System.out.println(mp);
		sc = new Scanner(new File("A-small-attempt0.in"));
		System.setOut(new PrintStream(new File("A-small.out")));
		len = sc.nextInt();
		sc.useDelimiter("\n");
		for (int i = 0; i < len; i++) {
			System.out.print("Case #"+(i+1)+": ");
			String tmp = sc.next();
			for (int a = 0; a < tmp.length(); a++) {
				System.out.print(mp.get(""+tmp.charAt(a)));
			}
			System.out.print("\n");
		}
	}
}
