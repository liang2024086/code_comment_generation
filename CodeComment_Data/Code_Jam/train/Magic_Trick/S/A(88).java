package methodEmbedding.Magic_Trick.S.LYD843;

import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTests = in.nextInt();
		for (int test = 1; test <= numTests; ++test) {
			int a = in.nextInt();
			boolean[] possib = new boolean[17];
			for (int i = 1; i <= 4; ++i)
				for (int j = 1; j <= 4; ++j) {
					int val = in.nextInt();
					if (i == a)
						possib[val] = true;
				}
			int b = in.nextInt();
			for (int i = 1; i <= 4; ++i)
				for (int j = 1; j <= 4; ++j) {
					int val = in.nextInt();
					if (i != b)
						possib[val] = false;
				}
			int ans = 0;
			for (int i = 1; i <= 16; ++i)
				if (possib[i])
					ans = (ans == 0) ? i : -1;
			System.out.print("Case #" + test + ": ");
			if (ans == -1)
				System.out.println("Bad magician!");
			else if (ans == 0)
				System.out.println("Volunteer cheated!");
			else
				System.out.println(ans);
		}
	}
	
}
