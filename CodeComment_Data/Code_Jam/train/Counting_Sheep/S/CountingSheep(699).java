package methodEmbedding.Counting_Sheep.S.LYD1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= t; i++) {
			int n = Integer.parseInt(reader.readLine());
			int found[] = new int[10];
			int count = 0;
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			int r, temp = n,pos = 1;
			while (count != 10) {
				// System.out.print(n * j + " ");
				while (temp != 0) {
					r = temp % 10;
					if (found[r] == 0) {
						found[r] = 1;
						count++;
					}
					temp /= 10;
				}
				temp = n * ++pos;
			}
			System.out.println("Case #" + i + ": " + n * (pos -1));
		}

		reader.close();
	}

}
