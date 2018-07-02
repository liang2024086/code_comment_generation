package methodEmbedding.Standing_Ovation.S.LYD202;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author oluwatonifuwape
 *
 */
public class FIrst {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		try {
			int tc = Integer.parseInt(br.readLine());
			for (int count = 0; count < tc; count++) {
				String line = (br.readLine());
				String[] ins = line.split(" ");
				int max = Integer.parseInt(ins[0]);
				String others = ins[1].trim();
				int sum = 0;
				int added = 0;
				int last = 0;
				for (int i = 0; i <= max; i++) {
					int num = Integer.parseInt(Character.toString(others
							.charAt(i)));
					if (sum >= i && num != 0) {
						sum += num;
						last = i;
					} else if (num != 0 && sum < i) {
						added += (i - sum);
						sum += (added + num);
						last += 1;

					}

				}
				System.out.println(added);
			}

		} finally {
			br.close();
		}

	}

}
