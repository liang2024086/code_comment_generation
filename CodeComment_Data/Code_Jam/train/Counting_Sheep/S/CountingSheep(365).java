package methodEmbedding.Counting_Sheep.S.LYD1061;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("A-small-attempt0.in"));

		int numTestCases = sc.nextInt();

		for (int i = 0; i < numTestCases; i++) {

			int num = sc.nextInt();
			if (num == 0)
				System.out.println("Case #" + (i+1) + ": INSOMNIA");

			else {
				int count = 1;
				int digitsNotSeen = 10;
				boolean[] seenOrNot = new boolean[10];

				while (digitsNotSeen > 0) {

					int currNum = count * num;
					while (currNum > 0) {
						int digit = currNum % 10;
						if (!seenOrNot[digit]) {
							seenOrNot[digit] = true;
							digitsNotSeen--;
						}
						currNum /= 10;
					}
					count++;
				}
					System.out.println("Case #" + (i+1) + ": " + (count - 1) * num);
			}
		}
	}
}
