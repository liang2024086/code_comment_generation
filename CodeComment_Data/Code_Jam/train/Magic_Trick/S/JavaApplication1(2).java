package methodEmbedding.Magic_Trick.S.LYD494;

import java.util.Scanner;

/**
 *
 * @author mark
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int testCase = 1; testCase <= T; testCase++) {
            short[] tmpRow = new short[4];
            short ans = 0;
            int targetRow = sc.nextInt();
            sc.nextLine();
            for (int row = 1; row <= 4; row++) {
                if (row == targetRow) {
                    for (int i = 0; i < 4; i++) {
                        tmpRow[i] = sc.nextShort();
                    }
                }
                sc.nextLine();
            }
            short targetRow2 = sc.nextShort();
            sc.nextLine();
            for (int row = 1; row <= 4; row++) {
                if (row == targetRow2) {
                    for (int i = 0; i < 4; i++) {
                        short tmp = sc.nextShort();
                        for (int t = 0; t < 4 && ans!=-1; t++) {
                            if (tmp == tmpRow[t]) {
                                if (ans != 0) {
                                    System.out.println("Case #" + testCase + ": Bad magician!");
                                    ans=-1;
                                    break;
                                } else {
                                    ans = tmp;
                                }
                            }
                        }
                    }
                }
                sc.nextLine();
            }
            if (ans==-1) continue;
            if (ans == 0) {
                System.out.println("Case #" + testCase + ": Volunteer cheated!");
            } else {
                System.out.println("Case #" + testCase + ": " + ans);
            }
        }
    }

}
