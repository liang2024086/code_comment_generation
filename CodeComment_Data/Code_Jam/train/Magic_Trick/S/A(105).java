package methodEmbedding.Magic_Trick.S.LYD1981;


import java.util.*;
//Scanner
//ArrayList
//HashMap


public class A {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();


        int[][] board = new int[4][4];
        int[][] board2 = new int[4][4];
        for (int k = 1; k <= numberOfCases; ++k ) {
            int firstAnswer = scanner.nextInt();
            for (int i = 0; i < 4; ++i)
                for(int j = 0; j < 4; ++j)
                    board[i][j] = scanner.nextInt();

            int secondAnswer = scanner.nextInt();
            for (int i = 0; i < 4; ++i)
                for(int j = 0; j < 4; ++j)
                    board2[i][j] = scanner.nextInt();

            boolean one = false;
            boolean two = false;
            int answer = 0;
            for ( int i = 0; i < 4; ++i ) {
                for (int j = 0; j < 4; ++j ) {
                    if ( board[firstAnswer - 1][i] == board2[secondAnswer - 1][j] ) {
                        if ( one ) {
                            two = true;
                            break;
                        }
                        one = true;
                        answer = board[firstAnswer - 1][i];
                    }
                }

            }
            if ( two ) {
                System.out.format("Case #%d: Bad Magician!\n", k);
            }
            else if ( one ) {
                System.out.format("Case #%d: %d\n", k, answer);
            }
            else {
                System.out.format("Case #%d: Volunteer Cheated!\n", k);
            }
        }



    }
}


