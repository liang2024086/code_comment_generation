package methodEmbedding.Counting_Sheep.S.LYD28;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Problem

You receive a credit C at a local store and would like to buy two items. You first walk through the store and create a list L of all available items. From this list you would like to buy two items that add up to the entire value of the credit. The solution you provide will consist of the two integers indicating the positions of the items in your list (smaller number first).

Input

The first line of input gives the number of cases, N. N test cases follow. For each test case there will be:

    One line containing the value C, the amount of credit you have at the store.
    One line containing the value I, the number of items in the store.
    One line containing a space separated list of I integers. Each integer P indicates the price of an item in the store.
    Each test case will have exactly one solution.

 * @author andre
 *
 */

public class Main {

	public static void main(String[] args) throws IOException {
		Path in = Paths.get("d:\\Andrej\\A-small-attempt0.in");
		try(
				PrintWriter w = new PrintWriter("d:\\Andrej\\out.txt");
				Scanner s = new Scanner(Files.newInputStream(in))) {
			
			int sampleCount = s.nextInt();
			
			for (int caseNum = 1; caseNum <= sampleCount; caseNum++) {
				long startingNumber = s.nextLong();
				String endNumber = "INSOMNIA";
				
				int[] seenSoFar = new int[10];
				Arrays.fill(seenSoFar, 0);
				
				
				for (int i = 1; i < Integer.MAX_VALUE; i++) {
					long nextNumber = i * startingNumber;
					
					if (nextNumber == 0) {
						break;
					}
					
					String digits = "" + nextNumber;
					
					digits.chars()
						.mapToObj(is -> Character.digit(is, 10))
//						.peek(num -> System.out.print(num))
						.forEach(num -> seenSoFar[num] = 1);
					
					if (IntStream.of(seenSoFar).allMatch(num -> num == 1)) {
						endNumber = "" + nextNumber;
						break;
					}
					
					System.out.println();
				}
				
				w.println(String.format("Case #%d: %s", caseNum, endNumber));
			}
		}
		
	}
}

//Order a list
//Remove items that have greater or equal value as money available
//For each one, find one that matches




