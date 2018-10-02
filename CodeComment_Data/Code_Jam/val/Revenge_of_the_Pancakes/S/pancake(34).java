package methodEmbedding.Revenge_of_the_Pancakes.S.LYD861;


import java.util.Scanner;

public class pancake {
	public static void main(String ar[]) {
		int c = 0, t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		while (c++ < t) {

			String s = in.next();
			char a[] = s.toCharArray();
			int y = 0, count = 0, len = s.length() - 1;
			while (len != 0 && a[len] == '+')
				len--;
			if (len > 0 || a[0] == '-') {
				for (int i = 0; i < len; i++) {
					if (s.charAt(i) != s.charAt(i + 1)) {
						y = i + 1;
						for (int j = 0; j < y; j++)
							if (a[j] == '-')
								a[j] = '+';
							else
								a[j] = '-';
						count++;

					}

				}
				System.out.println("Case #" + c + ": " + (count+1));
			} else
				System.out.println("Case #" + c + ": " + count);

		}
	}
}
