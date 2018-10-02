package methodEmbedding.Magic_Trick.S.LYD1258;


import java.util.Map;
import java.util.Scanner;

public class test {

    static Map<Long, Byte> fairSquare;

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] results = new int[T];
        for (int i = 0; i < T; i++) {

            int firstRow = scanner.nextInt();
            for (int j = 1; j < firstRow; j++) {
                for (int k = 0; k < 4; k++)
                    scanner.nextInt();
            }

            int[] row1 = new int[4];
            for (int k = 0; k < 4; k++)
                row1[k] = scanner.nextInt();

            for (int j = firstRow; j < 4; j++) {
                for (int k = 0; k < 4; k++)
                    scanner.nextInt();
            }

            int secondRow = scanner.nextInt();
            for (int j = 1; j < secondRow; j++) {
                for (int k = 0; k < 4; k++)
                    scanner.nextInt();
            }

            int[] row2 = new int[4];
            for (int k = 0; k < 4; k++)
                row2[k] = scanner.nextInt();

            for (int j = secondRow; j < 4; j++) {
                for (int k = 0; k < 4; k++)
                    scanner.nextInt();
            }

            int matches = 0;
            int num = -1;
            for (int z = 0; z < 4; z++) {
                for (int a = 0; a < 4; a++) {
                    if (row1[z] == row2[a]) {
                        num = row1[z];
                        matches++;
                    }
                }
            }

            if (matches == 0) {
                System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
            } else if (matches == 1) {
                System.out.println("Case #" + (i + 1) + ": " + num);
            } else {
                System.out.println("Case #" + (i + 1) + ": Bad magician!");
            }

        }

    }

}
