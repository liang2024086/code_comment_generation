package methodEmbedding.Magic_Trick.S.LYD874;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int tc = sc.nextInt();

		for (int it = 1; it <= tc; it++) {
			int r = sc.nextInt() - 1;
			int cnt[] = new int[20];
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++) {
					int x = sc.nextInt();
					if (r == i)
						cnt[x]++;
				}
			r = sc.nextInt() - 1;
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++) {
					int x = sc.nextInt();
					if (r == i) {
						cnt[x]++;
					}
				}
			int num = -1;
			int path2[] = new int[4];
			for (int i = 0; i < cnt.length; i++) {
				if (cnt[i] == 2)
					num = i;
				path2[cnt[i]]++;
			}

			if (num == -1)
				System.out.printf("Case #%d: Volunteer cheated!\n", it);
			else if (path2[2] != 1)
				System.out.printf("Case #%d: Bad magician!\n", it);
			else {
				System.out.printf("Case #%d: %d\n", it, num);

			}
		}
		sc.close();
	}
}
