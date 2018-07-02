package methodEmbedding.Standing_Ovation.S.LYD1278;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        for (int tc = 1; tc <= tcs; ++tc) {
            int max = sc.nextInt();
            String all = sc.next();
            int alreadyUp = 0;
            int friends = 0;
            for (int i = 0; i <= max; ++i) {
                int numAud = all.charAt(i) - 48;
                if (numAud != 0) {
                    if (alreadyUp >= i) {
                        alreadyUp += numAud; 
                    }
                    else {
                        friends += (i - alreadyUp);
                        alreadyUp += friends;
                        alreadyUp += numAud;
                    }
                }
            }
            System.out.println("Case #"+tc+": "+friends);
        }
    }
}
