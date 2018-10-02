package methodEmbedding.Magic_Trick.S.LYD1063;

import java.util.Scanner;


public class MagicTrick {

    static int testCases;
    static int row1;
    static int row2;
    static int[] array1;
    static int[] array2;

    public static void main(String[] args) {

        array1 = new int[4];
        array2 = new int[4];

        Scanner scanner = new Scanner(System.in);

        testCases = scanner.nextInt();


        for (int t=1; t <= testCases; ++t) {

            row1 = scanner.nextInt();
            
            int r1 = row1;

            do {
                --row1;

                array1[0] = scanner.nextInt();
                array1[1] = scanner.nextInt();
                array1[2] = scanner.nextInt();
                array1[3] = scanner.nextInt();

            } while (row1 > 0);

            for (int i = 0; i < (4-r1)*4; ++i) {
                scanner.nextInt();
            }

            row2 = scanner.nextInt();
            int r2 = row2;

            do {

                --row2;

                array2[0] = scanner.nextInt();
                array2[1] = scanner.nextInt();
                array2[2] = scanner.nextInt();
                array2[3] = scanner.nextInt();

            } while (row2 > 0);
            
            for (int j = 0; j < (4-r2)*4; ++j) {
                scanner.nextInt();
            }

            
            int possibilities = 0;
            int magicNum = 0;
            
            for (int a = 0; a < 4; ++a) {
                
                int val = array1[a];
                
                for (int b = 0; b < 4; ++b) {
                    if (array2[b] == val) {
                        possibilities++;
                        magicNum = val;
                    }
                }
            }

            
            if (possibilities == 1) {
                System.out.println("Case #" + t + ": " + magicNum);
            } else if (possibilities == 0) {
                System.out.println("Case #" + t + ": Volunteer cheated!");
            } else {
                System.out.println("Case #" + t + ": Bad magician!");
            }
        }
    }


}
