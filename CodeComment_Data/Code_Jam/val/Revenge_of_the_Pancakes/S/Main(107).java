package methodEmbedding.Revenge_of_the_Pancakes.S.LYD417;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		int cases = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < cases; i++) {
			char[] c = scanner.nextLine().toCharArray();
			int moves = 0;
			int cursor = 0;
			while (cursor < c.length) {
				if (c[0] == '+') {
					if (c[cursor] == '+') {
						cursor++;
					} else {
						for (int j = 0; j < cursor; j++) {
							if (j == 0) {
								moves++;
							}
							c[j] = '-';
						}
//						for (char d : c) {
//							System.out.print(d);
//						}
//						System.out.println();
					}
				} else {
					if (c[cursor] == '-') {
						cursor++;
					} else {
						for (int j = 0; j < cursor; j++) {
							if (j == 0) {
								moves++;
							}
							c[j] = '+';
						}
//						for (char d : c) {
//							System.out.print(d);
//						}
//						System.out.println();
				}
			}
		}
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '+')
					break;
				else if (j + 1 == c.length && c[j] == '-')
					moves++;
			}
			
			System.out.println("Case #" + (i + 1) + ": " + moves);
	}
  }
}
