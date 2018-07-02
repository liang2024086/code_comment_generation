package method_all.Osmos.S.LYD23;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Osmosis {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("d:\\cj\\osmo.in");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		FileWriter f0 = new FileWriter("d:\\cj\\osmo.out");

		// number of cases
		int t = Integer.parseInt(line.trim());

		for (int c = 1; c <= t; c++) {

			line = br.readLine();
			String[] elems = line.split(" ");

			long a = Long.parseLong(elems[0]);
			int n = Integer.parseInt(elems[1]);

			int[] m = new int[n];

			line = br.readLine();

			if (a == 1) {
				// just delete all
				f0.write("Case #" + c + ": " + n + "\r\n");
			} else {
				elems = line.split(" ");
				for (int i = 0; i < n; i++) {
					m[i] = Integer.parseInt(elems[i]);
				}

				Arrays.sort(m);

				// first only adding motes
				long[] ops = new long[n];
				ops[0] = 0;

				for (int i = 0; i < n; i++) {
					if (i != 0) {
						ops[i] = ops[i - 1];
					}

					while (a <= m[i]) {
						// add max one
						a += a - 1;
						ops[i]++;
					}
					
					a += m[i];
				}

				long min = n;
				
				// seek for delete point
				for (int i = 0; i < n; i++) {
					if (ops[i] + (n - i -1) < min) {
						min = ops[i] + (n - i - 1);
					}
				}
				
				f0.write("Case #" + c + ": " + min + "\r\n");
			}


		}

		fr.close();
		f0.close();

	}

}
