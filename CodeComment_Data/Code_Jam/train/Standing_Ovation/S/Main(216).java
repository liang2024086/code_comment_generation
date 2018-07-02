package methodEmbedding.Standing_Ovation.S.LYD1178;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //Input
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

        //vars
        int testCases = 0;

        //Operation
        testCases = Integer.valueOf(k.readLine());
        for (int i = 0; i < testCases; i++) {
            //Vars
            int sMax = 0;
            String initShy = "";
            int[] shyNum;
            int audNum = 0;
            int friendsToInvite = 0;
            int totalStoodUp = 0;
            initShy = k.readLine();
            boolean solved = false;
            int diff = -1;


            sMax = Integer.valueOf(initShy.substring(0, initShy.indexOf(" ")));
            initShy = initShy.substring(initShy.indexOf(" ") + 1);
            shyNum = new int[sMax + 1];
            for (int c = 0; c < initShy.length(); c++) {
                shyNum[c] = initShy.charAt(c) - 48;
                audNum = audNum + shyNum[c];
            }

            int shyLevel = 0;
            while(diff != 0) {
                diff = 0;
                totalStoodUp = 0;
                for (int c = 0; c <= sMax; c++) {
                    if (totalStoodUp >= c) {
                        totalStoodUp += shyNum[c];
                    } else {
                        diff = c - totalStoodUp;
                        shyLevel = c - 1;
                        break;
                    }
                }
                if (diff > 0) {
                    shyNum[shyLevel] += diff;
                    friendsToInvite += diff;
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + friendsToInvite);

        }
    }
}
