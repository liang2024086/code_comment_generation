package methodEmbedding.Magic_Trick.S.LYD1379;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbTest = Integer.valueOf(sc.nextLine()).intValue();
		String[] line = null;

		for (int u = 0; u < nbTest; u++) {
			int[] d1 = new int[4];
			int[] d2 = new int[4];
			int a1 = Integer.valueOf(sc.nextLine()).intValue() - 1;
			for (int i = 0; i < 4; i++) {
				line = sc.nextLine().split(" ");
				if (i == a1) {
					d1[0] = Integer.valueOf(line[0]).intValue();
					d1[1] = Integer.valueOf(line[1]).intValue();
					d1[2] = Integer.valueOf(line[2]).intValue();
					d1[3] = Integer.valueOf(line[3]).intValue();
				}
			}
			int a2 = Integer.valueOf(sc.nextLine()).intValue() - 1;
			for (int i = 0; i < 4; i++) {
				line = sc.nextLine().split(" ");
				if (i == a2) {
					d2[0] = Integer.valueOf(line[0]).intValue();
					d2[1] = Integer.valueOf(line[1]).intValue();
					d2[2] = Integer.valueOf(line[2]).intValue();
					d2[3] = Integer.valueOf(line[3]).intValue();
				}
			}

			int nb = 0;
			int a = 0;

			for (int i = 0; i < 4; i++) {
				if (d1[i] == d2[0]) {
					nb++;
					a = d1[i];
				}
				if (d1[i] == d2[1]) {
					nb++;
					a = d1[i];
				}
				if (d1[i] == d2[2]) {
					nb++;
					a = d1[i];
				}
				if (d1[i] == d2[3]) {
					nb++;
					a = d1[i];
				}
			}

			int fdp = u+1;
			System.out.print("Case #" + fdp + ": ");

			if (nb == 1) {
				System.out.println(a);
			}
			if (nb == 0) {
				System.out.println("Volunteer cheated!");
			}
			if (nb > 1) {
				System.out.println("Bad magician!");
			}

		}
	}
}
