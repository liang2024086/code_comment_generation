package methodEmbedding.Counting_Sheep.S.LYD980;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		final int testCases = in.nextInt();

		for (int i = 0; i < testCases; i++) {
			final long number = in.nextLong();
			if (number == 0) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
				continue;
			}
			List<Integer> seenNumbers = new ArrayList<Integer>(10) ;
			seenNumbers.add(0);
			seenNumbers.add(1);
			seenNumbers.add(2);
			seenNumbers.add(3);
			seenNumbers.add(4);
			seenNumbers.add(5);
			seenNumbers.add(6);
			seenNumbers.add(7);
			seenNumbers.add(8);
			seenNumbers.add(9);
			
			long mult = 1;
			long lastNumber = number;
			while (!seenNumbers.isEmpty()) {
				final long multipliedNumber = number * mult;
				String numberString = Long.toString(multipliedNumber);
				for (int k = 0; k < numberString.length(); k++) {
					int numInt = Integer.parseInt(numberString.substring(k, k+1));
					seenNumbers.remove((Object)new Integer(numInt));
				}
				mult++;
				lastNumber = multipliedNumber;
			}
			
			System.out.println("Case #" + (i + 1) + ": " + lastNumber);
		}

		in.close();
	}

}
