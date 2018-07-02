package methodEmbedding.Counting_Sheep.S.LYD790;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		int n = 0;
		int i = 0;
		boolean flag[] = new boolean[10];
		int count = 0;
		for (i = 1; i <= t; i++) {
			int j = 0;
			count = 10;
			for (j = 0; j <= 9; j++) {flag[j] = false;}
			n = in.nextInt();
			if (n == 0) {
				System.out.println("Case #" + i + ": " + "INSOMNIA");
				continue;
			}
			j = 1;
			while (true) {
				int temp = n * j;
				while (temp != 0) {
					if (!flag[temp % 10]) {
						flag[temp % 10] = true;
						count--;
						if (count == 0) {
							System.out.println("Case #" + i + ": " + n * j);
							break;
						}
					}
					temp = temp / 10;
				}
			if (count !=0) {j++;}
			else {break;}
			}
		}
	}
}
