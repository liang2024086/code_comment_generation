package methodEmbedding.Magic_Trick.S.LYD1932;


import java.util.*;

//unique substrings

public class SolutionA {
	private static Scanner c;

	public static void main(String args[]) {
		c = new Scanner(System.in);

		int t = new Integer(c.nextInt());

		for (int k = 0; k < t; k++) {
			int qtd = 0, value = 0;
			List<Integer> p = new ArrayList<Integer>();
			int line = c.nextInt();
			for (int j = 0; j < (line - 1) * 4; j++) {
				c.nextInt();
			}
			for (int j = 0; j < 4; j++) {
				p.add(c.nextInt());
			}
			for (int j = line * 4; j < 16; j++) {
				c.nextInt();
			}

			line = c.nextInt();
			for (int j = 0; j < (line - 1) * 4; j++) {
				c.nextInt();
			}
			for (int j = 0; j < 4; j++) {
				Integer q = c.nextInt();
				if (p.contains(q)) {
					qtd++;
					value = q;
				}
			}
			for (int j = line * 4; j < 16; j++) {
				c.nextInt();
			}

			if (qtd == 0)
				System.out.println("Case #" + (k + 1) + ": Volunteer cheated!");
			else if (qtd == 1)
				System.out.println("Case #" + (k + 1) + ": " + value);
			else
				System.out.println("Case #" + (k + 1) + ": Bad magician!");

		}

	}

}
