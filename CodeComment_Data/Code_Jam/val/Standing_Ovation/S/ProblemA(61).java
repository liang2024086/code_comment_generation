package methodEmbedding.Standing_Ovation.S.LYD297;

import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=1; i <= T; i++) {
            int Smax = in.nextInt();
            char[] audience = in.next().toCharArray();
            int standing = Character.getNumericValue(audience[0]);
            int friends = 0;
            for (int k=1; k <= Smax; k++) {
                int numOfK = Character.getNumericValue(audience[k]);
                if (numOfK > 0) {
                    if (standing >= k) {
                        standing += numOfK;
                    } else {
                        friends += k - standing;
                        standing = k + numOfK;
                    }
                }
            }
            System.out.println("Case #" + i + ": " + friends);
        }
    }
}
