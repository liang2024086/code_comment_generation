package methodEmbedding.Counting_Sheep.S.LYD443;

import java.util.Scanner;


public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++ ) {
			int test = sc.nextInt();
			if (test == 0) {
				System.out.println("Case #"+ (i+1)+": INSOMNIA");
				continue;
			}
			Integer cur = test;
			boolean visited[] = new boolean[10];
			while (true) {
				String str = cur.toString();
				for (int j = 0; j < str.length(); j++) {
					char ch = str.charAt(j);
					visited[ch - '0'] = true;
				}
				boolean fl = true;
				for (int j = 0; j < 10; j++) {
					if (visited[j] == false) {
						fl = false;
					}
				}
				if (fl) {
					System.out.println("Case #"+ (i+1)+": " + cur);
					break;
				}
				cur += test;
			}
		}
	}
}
