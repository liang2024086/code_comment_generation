package methodEmbedding.Magic_Trick.S.LYD1983;


import java.util.Scanner;

public class A {

	// System.out.print
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		int r, answer, n, count;

		int temp[] = new int[4];
		for (int i = 0; i < T; i++) {

			r = scan.nextInt();
			for (int j = 0; j < 4; j++) {

				for (int j2 = 0; j2 < 4; j2++) {
					if (j == r - 1) {
						temp[j2] = scan.nextInt();
					} else
						scan.nextInt();
				}

			}

			answer = -1;
			count = 0;
			r = scan.nextInt();
			for (int j = 0; j < 4; j++) {

				for (int j2 = 0; j2 < 4; j2++) {

					if (j == r - 1) {
						n = scan.nextInt();
						if (count < 2) {
							for (int k = 0; k < 4; k++) {
								if (temp[k] == n) {
									
									answer = temp[k];
									count++;
									break;
								}

							}
						}

					} else
						scan.nextInt();
				}

			}
			System.out.print("Case #" + (i + 1) + ": ");
			if (answer == -1)
				System.out.println("Volunteer cheated!");
			else if (count > 1)
				System.out.println("Bad magician!");
			else
				System.out.println(answer);

		}
	}

}
