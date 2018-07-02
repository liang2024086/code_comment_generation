package methodEmbedding.Magic_Trick.S.LYD2097;

import java.util.ArrayList;
import java.util.Scanner;

public class magic_trick {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int row1 = sc.nextInt() - 1;
            int[][] firstMat = new int[4][4];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    firstMat[j][k] = sc.nextInt();
                }
            }
            ArrayList<Integer> row1List = new ArrayList<Integer>();

            int row2 = sc.nextInt() - 1;
            int[][] secondMat = new int[4][4];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    secondMat[j][k] = sc.nextInt();
                }
            }
            ArrayList<Integer> row2List = new ArrayList<Integer>();
            int counter = 0;
            for (int j = 0; j < 4; j++) {
                row2List.add(secondMat[row2][j]);
                row1List.add(firstMat[row1][j]);
            }
            int answer = -1;
            for (int j = 0; j < 4; j++) {
                if (row1List.contains(row2List.get(j))) {
                    counter++;
                    answer = row2List.get(j);
                }
            }
            if (counter == 0) {
                System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
            } else if (counter == 1) {
                System.out.println("Case #" + (1 + i) + ": " + answer);
            } else {
                System.out.println("Case #" + (1 + i) + ": Bad magician!");
            }
        }
    }
}
