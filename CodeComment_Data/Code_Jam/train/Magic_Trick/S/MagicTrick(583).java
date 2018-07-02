package methodEmbedding.Magic_Trick.S.LYD428;


import java.util.Scanner;

public class MagicTrick {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        String O[] = new String[T];
        for (int i = 0; i < T; i++) {
            int G = 4;
            int A1 = sc.nextInt();
            int G1[][] = new int[G][G];
            for (int j = 0; j < G; j++) {
                for (int k = 0; k < G; k++) {
                    G1[j][k] = sc.nextInt();
                }
            }
            int A2 = sc.nextInt();
            int G2[][] = new int[G][G];
            for (int j = 0; j < G; j++) {
                for (int k = 0; k < G; k++) {
                    G2[j][k] = sc.nextInt();
                }
            }
            int C = 0;
            int J = 0;
            for (int j = 0; j < G; j++) {
                for (int k = 0; k < G; k++) {
                    if (G1[A1-1][j] == G2[A2-1][k]) {
                        C += 1;
                        J = G1[A1-1][j];
                    }
                }
            }
            if (C == 1) {
                O[i] = J+"";
            } else if (C > 1) {
                O[i] = "Bad magician!";
            } else {
                O[i] = "Volunteer cheated!";
            }
        }
        for (int i = 0; i < T; i++) {
            System.out.println("Case #" + (i + 1) + ": " + O[i]);
        }
    }
}
