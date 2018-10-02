package methodEmbedding.Counting_Sheep.S.LYD998;

/**
 * Created by Cody on 4/9/2016.
 *
 *
 */

import java.util.*;
public class CodeJam {

    public static void main(String[] args) {

        boolean[] isFound = new boolean[10];
        Scanner sc = new Scanner(System.in);

        int found = 0;
        int caseNum = 1;
        String stringNum;
        String digit;

        int token;


        int T = sc.nextInt();


        while (T-- > 0) {

            int N = sc.nextInt();
            if (N == 0) {
                System.out.println("Case #" + caseNum + ":" + " INSOMNIA");
                caseNum++;

            }

            else {
                int k = N;
                while (found < 10) {

                    stringNum = Integer.toString(N);

                    for (int i = 0; i < stringNum.length(); i++) {
                        digit = (stringNum.substring(i, i + 1));
                        token = Integer.parseInt(digit);

                        if (!isFound[token]) {
                            isFound[token] = true;
                            found++;
                        }
                    }
                    //k++;

                    N = N + k;

                }

                System.out.format("Case #%s: %s", caseNum, N - k);
                System.out.println();
                caseNum++;
                found = 0;
                isFound = new boolean[10];



            }
        }


    }

}



