package methodEmbedding.Magic_Trick.S.LYD479;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TOTAL_CASES = in.nextInt();
        for (int zz = 1; zz <= TOTAL_CASES; zz++) {
            int ans1 = in.nextInt();
            int[] row1 = new int[4];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == ans1 - 1) {
                        row1[j] = in.nextInt();
                    } else {
                        in.nextInt();
                    }
                }
            }

            int ans2 = in.nextInt();
            int[] row2 = new int[4];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == ans2 - 1) {
                        row2[j] = in.nextInt();
                    } else {
                        in.nextInt();
                    }
                }
            }

            int commonCard = -1;
            boolean bad = false;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (row1[i] == row2[j]) {
                        if (commonCard > -1) {
                            bad = true;
                        } else {
                            commonCard = row1[i];
                        }
                    }

                    if (bad) {
                        break;
                    }
                }

                if (bad) {
                    break;
                }
            }

            String output;
            if (bad) {
                output = "Bad magician!";
            } else if (commonCard == -1) {
                output = "Volunteer cheated!";
            } else {
                output = String.valueOf(commonCard);
            }
            System.out.format("Case #%d: %s\n", zz, output);
        }
    }
}
