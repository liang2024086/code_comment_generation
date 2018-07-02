package methodEmbedding.Magic_Trick.S.LYD127;

import java.util.*;

class Magic {
    public static void main(String[] args) {
        int[][] arrange1 = new int[4][4];
        int[][] arrange2 = new int[4][4];
        String resultStr = "";
        int testCases, rowAns1, rowAns2, cardVal=0;
        int caseNum = 0;

        Scanner sc = new Scanner(System.in);

        testCases = sc.nextInt();

        while (testCases>0) {
            testCases--;
            caseNum++;

            rowAns1 = sc.nextInt();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arrange1[i][j] = sc.nextInt();
                }
            }
            rowAns2 = sc.nextInt();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arrange2[i][j] = sc.nextInt();
                }
            }
            int check = 0;
            for (int i=0; i<4; i++) {
                for(int j=0; j<4; j++) {
                    if (arrange1[rowAns1-1][i] == arrange2[rowAns2-1][j]) {
                        cardVal = arrange2[rowAns2-1][j];
                        check++;
                    }
                }
            }
            if (check > 1)
                resultStr = "Bad magician!";
            else if (check == 1)
                resultStr = String.valueOf(cardVal);
            else if (check == 0)
                resultStr = "Volunteer cheated!";

            System.out.printf("Case #%d: " + resultStr + "\n", caseNum);
        }

    }
}
