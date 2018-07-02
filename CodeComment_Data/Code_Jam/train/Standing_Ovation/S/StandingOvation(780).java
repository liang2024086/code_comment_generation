package methodEmbedding.Standing_Ovation.S.LYD597;

public class StandingOvation {
	//public static int[] output;

	public static void main(String[] args) {
		int T = StdIn.readInt();
		int[] record = new int[100];
		int count2 = 0;
		
		for (int u = 0; u < T; u++) {
			int fill = 0;
			int people = 0;
			int add = 0;
			int count = 1;
			int X = StdIn.readInt();
			int Y = StdIn.readInt();
			int[] output = new int[T];
			int[] shy = new int[6 + 1];
			for (int a = (X); a >= 0; a--) {
				shy[fill] = (Y / (int) Math.pow(10.0, a)) % 10;
				fill++;
			}
			people = shy[0];

			for (int b = 1; b <= X; b++) {

				if (people >= count) {
					people = people + shy[b];
				} else {
					add = add + 1;
					people = people + 1 + shy[b];

				}
				count++;
			}
			record[u] = add;
		}

		for (int k = 0; k < T; k++) {
			System.out.println("Case #" + (k + 1) + ": " + record[count2]);
			count2++;

		}
	}
}
