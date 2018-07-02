package methodEmbedding.Magic_Trick.S.LYD975;


import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class GoogleMagicTrick {
	private static final File input = new File("source");
	private static final int NUMBER_OF_ROWS = 4;
	private static final int NUMBER_OF_COLUMNS = 4;

	public static void main(final String[] args) {
		try (final Scanner scanner = new Scanner(input)) {
			scanner.useLocale(Locale.US);
			final int cases = scanner.nextInt();
			for (int i = 1; i <= cases; i++) {
				final int numbers[] = new int[17]; // we make it larger for to access by number, not index
				scanner.nextLine();

				// we could use a method, but well, lets keep it simple
				final int row1 = scanner.nextInt();
				for (int j = 1; j <= NUMBER_OF_ROWS; j++) {
					scanner.nextLine();
					if (j == row1)
						for (int k = 1; k <= NUMBER_OF_COLUMNS; k++)
							++numbers[scanner.nextInt()];
				}

				scanner.nextLine();
				final int row2 = scanner.nextInt();
				for (int j = 1; j <= NUMBER_OF_ROWS; j++) {
					scanner.nextLine();
					if (j == row2)
						for (int k = 1; k <= NUMBER_OF_COLUMNS; k++)
							++numbers[scanner.nextInt()];
				}

				int result = 0;
				for (int j = 1; j < numbers.length; j++)
					if (numbers[j] == 2) // the interesting part is if we found the number exactly two times
						if (result == 0)
							result = j;
						else { // this happens if we found multiple numbers two times. Then we did a bad job with arranging the cards
							result = -1;
							break;
						}
				// if we do not find a number two times, the volunteer cheated. If he is honest, the card must be in his selected row.

				if (result < 0)
					System.out.printf("Case #%d: Bad magician!\n", i);
				else if (result == 0)
					System.out.printf("Case #%d: Volunteer cheated!\n", i);
				else
					System.out.printf("Case #%d: %d\n", i, result);
			}
		} catch (final Exception e) {
			// doNothing();
		}
	}
}
