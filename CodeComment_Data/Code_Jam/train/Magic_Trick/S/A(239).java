package methodEmbedding.Magic_Trick.S.LYD1889;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("A-small-attempt1.in"));
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.print("Case #" + (i + 1) + ": ");
            int first = sc.nextInt();
            int[] cards = new int[4];
            for (int j = 0; j < 4; j++) {
                if (j + 1 == first) {
                    for (int k = 0; k < cards.length; k++) {
                        cards[k] = sc.nextInt();
                    }
                }
                else {
                    for (int t = 0; t < 4; t++) {
                        sc.nextInt();
                    }
                }
            }

            int second = sc.nextInt();
            int[][] secondCards = new int[4][4];
            boolean found = false;
            boolean bad = false;
            int fcard = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    secondCards[j][k] = sc.nextInt();
                    if (j + 1 == second) {
                        for (int p = 0; p < 4; p++) {
                            if (secondCards[j][k] == cards[p] && !found) {
                                found = true;
                                fcard = cards[p];
                            } else if (secondCards[j][k] == cards[p] && found && !bad) {
                                System.out.println("Bad magician!");
                                bad = true;
                                break;
                            }
                        }
                    }
                }
            }

            if (bad) {
                continue;
            }
            if (found) {
                System.out.println(fcard);
            } else {
                System.out.println("Volunteer cheated!");
            }
        }
    }
}
