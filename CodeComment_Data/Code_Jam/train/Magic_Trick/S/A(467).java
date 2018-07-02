package methodEmbedding.Magic_Trick.S.LYD2029;

/**
 * Created by hoang on 4/12/2014.
 */

import java.util.*;

public class A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int test = 1; test <= testCase; ++test)
        {
            int row1 = input.nextInt();
            int mat1[][] = new int[4][4];
            for (int i = 0; i < 4; ++i)
            {
                for (int j = 0; j < 4; ++j)
                {
                    mat1[i][j] = input.nextInt();
                }
            }

            int row2 = input.nextInt();
            int mat2[][] = new int[4][4];
            for (int i = 0; i < 4; ++i)
            {
                for (int j = 0; j < 4; ++j)
                {
                    mat2[i][j] = input.nextInt();
                }
            }

            int number = -1;
            int count = 0;
            for (int i = 0; i < 4; ++i)
            {
                int num = mat1[row1 - 1][i];
                for (int j = 0; j < 4; ++j)
                {
                    if (num == mat2[row2 - 1][j])
                    {
                        number = num;
                        ++count;
                    }
                }
            }

            if (count < 1)
            {
                System.out.println("Case #" + test + ": Volunteer cheated!");
            }
            else if (count == 1)
            {
                System.out.println("Case #" + test + ": " + number);
            }
            else
            {
                System.out.println("Case #" + test + ": Bad magician!");
            }
        }
    }
}
