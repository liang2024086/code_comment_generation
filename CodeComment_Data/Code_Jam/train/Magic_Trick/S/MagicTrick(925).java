package methodEmbedding.Magic_Trick.S.LYD1821;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {

	public MagicTrick() throws FileNotFoundException {
		File file = new File("A-small-attempt0.in");
		Scanner sc = new Scanner(file);
		System.setOut(new PrintStream(new File("output.txt")));
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			List<Integer> firstRow = new ArrayList<>();
			List<Integer> secondRow = new ArrayList<>();
			int q1Ans = sc.nextInt();
			for (int j = 1; j < q1Ans; j++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}
			firstRow.add(sc.nextInt());
			firstRow.add(sc.nextInt());
			firstRow.add(sc.nextInt());
			firstRow.add(sc.nextInt());

			for (int j = 0; j < (4 - q1Ans); j++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}

			int q2Ans = sc.nextInt();
			for (int j = 1; j < q2Ans; j++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}
			secondRow.add(sc.nextInt());
			secondRow.add(sc.nextInt());
			secondRow.add(sc.nextInt());
			secondRow.add(sc.nextInt());

			for (int j = 0; j < (4 - q2Ans); j++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}

			Iterator<Integer> iterator = secondRow.iterator();
			int noOfSame = 0;
			int cardNumber = 0;
			// System.out.println(firstRow);
			// System.out.println(secondRow);
			while (iterator.hasNext()) {
				int j = iterator.next();
				if (firstRow.contains(j)) {
					cardNumber = j;
					noOfSame++;
				}
			}

			if (noOfSame == 1) {
				System.out.println("Case #" + (i + 1) + ": " + cardNumber + "");
			} else if (noOfSame > 1) {
				System.out.println("Case #" + (i + 1) + ": " + "Bad magician!");
			} else if (noOfSame == 0) {
				System.out.println("Case #" + (i + 1) + ": "
						+ "Volunteer cheated!");
			} else {
				System.err.println("Something went wrong somewhere.");
			}
		}
		sc.close();

	}

	public static void main(String[] args) throws FileNotFoundException {
		new MagicTrick();
	}
}
