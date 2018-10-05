package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1169;

import java.util.Scanner;

public class Template {
	static long count = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int tc = 0; tc < t; ++tc) {
			count=0;
			char[] s = input.next().toCharArray();
			int len = s.length;
			for (;;) {
				int i;
				for (i = len - 1; i >= 0; --i) {
					if (s[i] == '-')
						break;
				}
				if (i == -1) {
					System.out.println("Case #"+(tc+1)+": "+count);
					break;
				} else {
					count++;
					for (int j = 0; j <= i; ++j) {
						if (s[j] == '+') {
							s[j]='-';
						} else
							s[j]='+';
					}
				}
			}
		}

	}

}
