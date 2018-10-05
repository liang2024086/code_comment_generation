package methodEmbedding.Magic_Trick.S.LYD661;

import java.io.StringReader;
import java.util.Scanner;

public class MagicTrick {

    private static final boolean TEST_MODE = false;

    public static void main(String[] args) {
        Scanner scanner;
        if (TEST_MODE) {
            scanner = new Scanner(new StringReader(TEST_STRING));
        } else {
            scanner = new Scanner(System.in);
        }

        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int[] cards = new int[16];

            int firstRow = scanner.nextInt();

            // move to first line of cards
            scanner.nextLine();

            for (int i = 1; i < 5; i++) {
                if (i == firstRow) {
                    cards[scanner.nextInt() - 1] += 1;
                    cards[scanner.nextInt() - 1] += 1;
                    cards[scanner.nextInt() - 1] += 1;
                    cards[scanner.nextInt() - 1] += 1;
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                }
            }

            int secondRow = scanner.nextInt();

            // move to first line of cards
            scanner.nextLine();

            for (int i = 1; i < 5; i++) {
                if (i == secondRow) {
                    cards[scanner.nextInt() - 1] += 1;
                    cards[scanner.nextInt() - 1] += 1;
                    cards[scanner.nextInt() - 1] += 1;
                    cards[scanner.nextInt() - 1] += 1;
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                }
            }

            int card = -1;
            boolean foundMultiple = false;
            for (int i = 0; i < 16; i++) {
                if (cards[i] == 2) {
                    if (card == -1) {
                        card = i;
                    } else {
                        foundMultiple = true;
                        break;
                    }
                }
            }

            if (foundMultiple) {
                System.out.println(String.format("Case #%d: Bad magician!", t + 1));
            } else if (card == -1) {
                System.out.println(String.format("Case #%d: Volunteer cheated!", t + 1));
            } else {
                System.out.println(String.format("Case #%d: %d", t + 1, card + 1));
            }
        }
    }

    private static final String TEST_STRING = "3\n" +
            "2\n" +
            "1 2 3 4\n" +
            "5 6 7 8\n" +
            "9 10 11 12\n" +
            "13 14 15 16\n" +
            "3\n" +
            "1 2 5 4\n" +
            "3 11 6 15\n" +
            "9 10 7 12\n" +
            "13 14 8 16\n" +
            "2\n" +
            "1 2 3 4\n" +
            "5 6 7 8\n" +
            "9 10 11 12\n" +
            "13 14 15 16\n" +
            "2\n" +
            "1 2 3 4\n" +
            "5 6 7 8\n" +
            "9 10 11 12\n" +
            "13 14 15 16\n" +
            "2\n" +
            "1 2 3 4\n" +
            "5 6 7 8\n" +
            "9 10 11 12\n" +
            "13 14 15 16\n" +
            "3\n" +
            "1 2 3 4\n" +
            "5 6 7 8\n" +
            "9 10 11 12\n" +
            "13 14 15 16";



}
