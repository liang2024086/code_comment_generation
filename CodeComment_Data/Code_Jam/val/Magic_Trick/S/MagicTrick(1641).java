package methodEmbedding.Magic_Trick.S.LYD755;

import java.util.Arrays;
import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for (int i = 1; i <= cases; i++) {
            int[] temp = new int[8];
            int ans1 = in.nextInt();
            int[][] table1 = new int[4][4];

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    table1[j][k] = in.nextInt();
                }
            }
            int index = 0;
            for (int j = 0; j < 4; j++) {
                temp[index] = table1[ans1 - 1][j];
                index++;
            }

            int ans2 = in.nextInt();

            int[][] table2 = new int[4][4];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    table2[j][k] = in.nextInt();
                }
            }

            for (int j = 0; j < 4; j++) {
                temp[index] = table2[ans2 - 1][j];
                index++;
            }

            Arrays.sort(temp);
            int count = 0;
            int answer = 0;
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j] == temp[j + 1]) {
                    count++;
                    answer = temp[j];
                }
            }

            if (count == 1) {
                System.out.println("Case #" + i + ": " + answer);
            } else if (count > 1) {
                System.out.println("Case #" + i + ": Bad magician!");
            } else {
                System.out.println("Case #" + i + ": Volunteer cheated!");
            }
        }

        in.close();
    }

}
