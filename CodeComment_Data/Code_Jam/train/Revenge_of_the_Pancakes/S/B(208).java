package methodEmbedding.Revenge_of_the_Pancakes.S.LYD221;


import java.io.*;
import java.util.*;

public class B {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputB.txt"));
		int T = sc.nextInt();
		for (long i=1;i<=T;i++) {
			String s = sc.next();
			char [] ca = s.toCharArray();
			int n = s.length();
			boolean prev = false;
			if (ca[0] == '-') {
				prev = false;
			} else {
				prev = true;
			}
			int res = 0;
			for (int k=2;k<=n;k++) {
				boolean curr = ca[k-1] == '+' ?  true : false;
				if (!prev && curr) {
					res++;
				} else if (prev && !curr) {
					res++;
				}
				prev = curr;
			}
			if (!prev) {
				res++;
			}
			System.out.println("Case #" + i + ": "+ res);
		}
		sc.close();
	}

}
