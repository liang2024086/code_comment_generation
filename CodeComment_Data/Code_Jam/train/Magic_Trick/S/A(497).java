package methodEmbedding.Magic_Trick.S.LYD538;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        int numRows = 4;
        int numCols = 4;

        for (int i = 0; i < numCases; i++) {
            int row1 = Integer.parseInt(sc.nextLine());
            boolean[] seen = new boolean[16];

            for (int j = 0; j < row1 - 1; j++) {
                sc.nextLine();
            }

            String[] cols1 = sc.nextLine().split(" ");

            for (int j = 0; j < numCols; j++) {
                int num = Integer.parseInt(cols1[j]);
                seen[num - 1] = true;
            }

            for (int j = row1; j < numRows; j++) {
                sc.nextLine();
            }

            int row2 = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < row2 - 1; j++) {
                sc.nextLine();
            }

            int numFound = 0;
            int foundCard = 0;
            String[] cols2 = sc.nextLine().split(" ");

            for (int j = 0; j < numCols; j++) {
                int num = Integer.parseInt(cols2[j]);

                if (seen[num - 1]) {
                    numFound++;
                    foundCard = num;
                }
            }

            for (int j = row2; j < numRows; j++) {
                sc.nextLine();
            }

            System.out.print("Case #" + (i + 1) + ": ");

            if (numFound == 0) {
                System.out.println("Volunteer cheated!");
            } else if (numFound == 1) {
                System.out.println(foundCard);
            } else {
                System.out.println("Bad magician!");
            }
        }
    }
}
