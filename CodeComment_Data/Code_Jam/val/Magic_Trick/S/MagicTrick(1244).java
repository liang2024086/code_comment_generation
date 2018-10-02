package methodEmbedding.Magic_Trick.S.LYD433;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by pratyush.verma on 12/04/14.
 */
public class MagicTrick {
    public static void main(String[] args) {
        int T;
        int index = 1;
        Scanner cin = new Scanner(System.in);
        T = cin.nextInt();
        while (T-- != 0) {
            int board[][] = new int[4][4];
            int row = cin.nextInt();
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; j++) {
                    board[i][j] = cin.nextInt();
                }
            }
            Set<Integer> rowInt = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                rowInt.add(board[row - 1][i]);
            }
            board = new int[4][4];
            row = cin.nextInt();
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; j++) {
                    board[i][j] = cin.nextInt();
                }
            }
            Set<Integer> newRowInt = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                newRowInt.add(board[row - 1][i]);
            }
            rowInt.retainAll(newRowInt);
            System.out.print("Case #" + index++ + ": ");
            if (rowInt.size() == 0) {
                System.out.println("Volunteer cheated!");
            } else if (rowInt.size() > 1) {
                System.out.println("Bad magician!");
            } else {
                System.out.println(rowInt.iterator().next());
            }
        }
    }
}
