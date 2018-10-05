package methodEmbedding.Standing_Ovation.S.LYD1784;


/**
 * Created by Xiaoliable on 2015/4/11.
 */

import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testN = scanner.nextInt();
        for (int i = 0; i < testN; i++) {

            int shynessL = scanner.nextInt();
            int[] audienceN = new int[shynessL+1];

            //Parse the String.
            String audience = scanner.next();

            for (int j = 0; j < audience.length(); j++) {
                audienceN[j] = audience.charAt(j) - '0';
            }

            int standingPerson = audienceN[0];
            int needPerson = 0;
            for (int j = 1; j <= shynessL; j++) {

                int temp = j - standingPerson;
                if(temp > 0 && audienceN[j] != 0){
                    needPerson += temp;//Add the need person number
                    standingPerson += temp;
                }
                standingPerson += audienceN[j];//
            }
            System.out.println("Case #" + (i+1) + ": " + needPerson);
        }
    }
}
