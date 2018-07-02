package methodEmbedding.Revenge_of_the_Pancakes.S.LYD966;

import java.util.Scanner;


public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t ++) {
			String str = sc.next();
			char[] vals = str.toCharArray();
			int rot = 0;
			for (int i = vals.length - 1; i >= 0; i --) {
				if (vals[i] == '-') {
					int rotStart = 0;
					for (int j = 0; j <= i; j ++) {
						if (vals[j] == '-') {
							rotStart = j;
							break;
						}
					}
					if (rotStart > 0) {
						// there is some rotating happens
						for (int j = 0; j < rotStart; j ++) {
							vals[j] = '-';
						}
						rot ++;
					}
					for (int j = 0; j <= i; j ++) {
						if (vals[j] == '-') {
							vals[j] = '+';
						} else {
							vals[j] = '-';
						}
					}
					// now the first rotStarts are '-'s now rotate between i and 0
					int start = 0;
					int end = i;
					while (start < end) {
						char tmp = vals[start];
						vals[start] = vals[end];
						vals[end] = tmp;
						start ++;
						end --;
					}
					rot ++;
				}
			}
			System.out.println("Case #" + (t + 1) + ": " + rot);
		}
	}
}
