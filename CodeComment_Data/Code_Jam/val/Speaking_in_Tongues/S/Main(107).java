package methodEmbedding.Speaking_in_Tongues.S.LYD605;


/**
 *
 * @author ffreakk
 */

import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); in.nextLine();

        char convert[][] = new char[27][2];

        // manual conversion
        convert[0][0] = 'a';        convert[0][1] = 'y';
        convert[1][0] = 'b';        convert[1][1] = 'n';
        convert[2][0] = 'c';        convert[2][1] = 'f';
        convert[3][0] = 'd';        convert[3][1] = 'i';
        convert[4][0] = 'e';        convert[4][1] = 'c';
        convert[5][0] = 'f';        convert[5][1] = 'w';
        convert[6][0] = 'g';        convert[6][1] = 'l';
        convert[7][0] = 'h';        convert[7][1] = 'b';
        convert[8][0] = 'i';        convert[8][1] = 'k';
        convert[9][0] = 'j';        convert[9][1] = 'u';
        convert[10][0] = 'k';       convert[10][1] = 'o';
        convert[11][0] = 'l';       convert[11][1] = 'm';
        convert[12][0] = 'm';       convert[12][1] = 'x';
        convert[13][0] = 'n';       convert[13][1] = 's';
        convert[14][0] = 'o';       convert[14][1] = 'e';
        convert[15][0] = 'p';       convert[15][1] = 'v';
        convert[16][0] = 'q';       convert[16][1] = 'z';
        convert[17][0] = 'r';       convert[17][1] = 'p';
        convert[18][0] = 's';       convert[18][1] = 'd';
        convert[19][0] = 't';       convert[19][1] = 'r';
        convert[20][0] = 'u';       convert[20][1] = 'j';
        convert[21][0] = 'v';       convert[21][1] = 'g';
        convert[22][0] = 'w';       convert[22][1] = 't';
        convert[23][0] = 'x';       convert[23][1] = 'h';
        convert[24][0] = 'y';       convert[24][1] = 'a';
        convert[25][0] = 'z';       convert[25][1] = 'q';
        convert[26][0] = ' ';       convert[26][1] = ' ';

        for (int t=1; t<=T; t++){
            System.out.print("Case #"+t+": ");
            String inputString = in.nextLine();
            char input[] = new char[1];
            input = inputString.toCharArray();
            for (int i = 0; i<input.length; i++) {
                for (int ii=0; ii<27; ii++) {
                    if (convert[ii][1] == input[i])
                        System.out.print(convert[ii][0]);
                }
            }
            System.out.println();
        }

    }

}
