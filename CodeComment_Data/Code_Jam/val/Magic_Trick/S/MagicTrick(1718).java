package methodEmbedding.Magic_Trick.S.LYD512;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * https://code.google.com/codejam/contest/2974486/dashboard
 *
 * User: bvishal
 * Date: 4/12/14
 * Time: 7:34 AM
 */
public class MagicTrick {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int iter = 0;

        while(++iter <= t) {
            final int firstAnswer = scanner.nextInt();
            final String[][] a1= new String[4][4];

            // Skip over newline
            scanner.nextLine();

            a1[0] = scanner.nextLine().split(" ");
            a1[1] = scanner.nextLine().split(" ");
            a1[2] = scanner.nextLine().split(" ");
            a1[3] = scanner.nextLine().split(" ");

            final int secondAnswer = scanner.nextInt();
            // Skip over newline
            scanner.nextLine();
            final String[][] a2 = new String[4][4];

            a2[0] = scanner.nextLine().split(" ");
            a2[1] = scanner.nextLine().split(" ");
            a2[2] = scanner.nextLine().split(" ");
            a2[3] = scanner.nextLine().split(" ");

            final String a1row[] = a1[firstAnswer-1];
            final String a2row[] = a2[secondAnswer-1];

            List<String> possibleAnswers = new ArrayList(4);
            // See if there's a unique number (intersection)
            for (int i=0; i<4; i++) {
                String a1i = a1row[i];
                for (int j=0; j<4; j++) {
                    String a2j = a2row[j];
                    if (a1i.equals(a2j)) {
                        possibleAnswers.add(a1i);
                    }
                }
            }

            String ans;
            switch(possibleAnswers.size()) {
                case 0:
                    ans = "Volunteer cheated!";
                    break;
                case 1:
                    ans = String.valueOf(possibleAnswers.get(0));
                    break;
                default:
                    ans = "Bad magician!";
            }

            System.out.printf("Case #%d: %s\n", iter, ans);
        }
    }
/*

    private static int[] getIntArray(String s) {
        String[] numStrs = s.split(" ");
        int num[] = new int[numStrs.length];
        int i = 0;
        for (String numStr : numStrs) {
            num[i++] = Integer.parseInt(numStr);
        }
        return num;
    }
*/

}
