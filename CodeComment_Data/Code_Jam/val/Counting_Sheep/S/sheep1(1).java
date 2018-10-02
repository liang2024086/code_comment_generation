package methodEmbedding.Counting_Sheep.S.LYD693;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class sheep1 {

	public static void main(String[] args) {
		Vector<Integer> v = null;
		v = new Vector<Integer>();
		for (int i = 0; i <= 9; i++) {
			v.add(i);
		}
		Scanner put = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		int m = put.nextInt();
		try {
			for (int a = 1; a <= m; ++a) {
				Vector<Integer> v1 = new Vector<Integer>();
				v1.addAll(v);
				int count = put.nextInt();
				int pro;
				Integer z = 0;
				int x = 1;

				if (count != 0) {

					while (!v1.isEmpty()) {
						z = x * count;

						String[] numbers = Integer.toString(z).split("");
						for (int i = 0; i < numbers.length; i++) {
							pro = Integer.parseInt(numbers[i]);
							if (v1.contains(pro)) {
								v1.remove((Integer) pro);
							}
						}

						if (v1.isEmpty()) {
							System.out.println("Case #" + a + ": " + z);
						}
						x++;
					}

				} else {
					System.out.println("Case #" + a + ": INSOMNIA");
				}

			}
		} finally {
			put.close();
		}
	}
}
