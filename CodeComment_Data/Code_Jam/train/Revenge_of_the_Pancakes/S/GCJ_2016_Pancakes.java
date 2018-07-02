package methodEmbedding.Revenge_of_the_Pancakes.S.LYD196;

import java.util.Scanner;

public class GCJ_2016_Pancakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        sc.nextLine();

        int i = 1;
        String str;

        while (i <= t) {
            str = sc.nextLine();
            long count = 0;

            boolean minusSeq = false;
            if (str.charAt(0) == '-') {
                count = 1;
                minusSeq = true;
            }

            for (int k = 1; k < str.length(); k++) {
                if (str.charAt(k) == '-') {
                    if (!minusSeq) {
                        minusSeq = true;
                        count += 2;
                    }
                }else{
                    minusSeq = false;
                }
            }
            System.out.println("Case #" + i + ": " + count);
            i++;
        }
    }
}
