package methodEmbedding.Counting_Sheep.S.LYD1701;

import java.io.*;
import java.util.*;

public class Testing {


	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\JeffreyChan\\Downloads\\A-small-attempt0.in"));
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {
			int orig = scan.nextInt();
			int current = orig;
			int num = orig;
			int k = 1;
			Set<Integer> mySet = new HashSet<>();
			for (int j = 0; j < 10; j++) {
				mySet.add(j);
			}

			while (!mySet.isEmpty()) {
				while (num > 0) {
					mySet.remove(num % 10);
					num /= 10;
				}

				if (!mySet.isEmpty()) {
					k++;
					current = orig * k;
					num = current;
				}

				if (current <= 0) {
					break;
				}
			}

			if (mySet.isEmpty())
				System.out.println("Case #" + (i + 1) + ": " + current);
			else
				System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");

		}

		scan.close();
    }


}
