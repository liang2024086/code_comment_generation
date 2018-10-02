package methodEmbedding.Magic_Trick.S.LYD857;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MagicTrick {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cases = Integer.valueOf(br.readLine());
		int cont = 0;

		while (cases-- > 0) {

			int first = Integer.valueOf(br.readLine());
			String[] firstRow = null;
			String aux;

			for (int i = 1; i < 5; i++) {
				aux = br.readLine();
				if (i == first) {
					firstRow = aux.split(" ");
				}
			}

			int second = Integer.valueOf(br.readLine());
			String[] secondRow = null;

			for (int i = 1; i < 5; i++) {
				aux = br.readLine();
				if (i == second) {
					secondRow = aux.split(" ");
				}
			}

			Arrays.sort(firstRow);

			int saida = 0;

			int index = 0;

			for (int i = 0; i < 4; i++) {
				if (Arrays.binarySearch(firstRow, secondRow[i]) >= 0) {
					saida++;
					index = i;
				}
			}

			if (saida == 0) {
				System.out
						.println("Case #" + (++cont) + ": Volunteer cheated!");
			} else if (saida == 1) {
				System.out.println("Case #" + (++cont) + ": "
						+ secondRow[index]);
			} else {
				System.out.println("Case #" + (++cont) + ": Bad magician!");
			}

		}

	}

}
