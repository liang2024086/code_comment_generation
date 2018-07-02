package methodEmbedding.Standing_Ovation.S.LYD1396;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ernesto Velazquez Caballero
 * @since 10/04/2015
 */
public class ContestOne {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final FileReader fileReader = new FileReader("res\\contest_1\\A-small-attempt0.in");
        final BufferedReader bufferedReader = new BufferedReader(fileReader);

        final int numberOfTests = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfTests; i ++) {
            final String[] stringElements = bufferedReader.readLine().split(" ");
            final char[] digits = stringElements[1].toCharArray();

            int totalFriends = 0;
            int totalClaps = 0;
            int j = 0;

            for (final char digit : digits) {
                final int digitInt = Character.getNumericValue(digit);

                if (digitInt > 0) {
                    if ((j == 0) || (totalClaps >= j)) {
                        totalClaps += digitInt;
                    } else {
                        int newFriends = (j - totalClaps);
                        totalFriends += newFriends;
                        totalClaps += digitInt + newFriends;
                    }
                }

                j ++;
            }

            System.out.println("Case #" + (i+1) + ": " + totalFriends);
        }
    }
}
