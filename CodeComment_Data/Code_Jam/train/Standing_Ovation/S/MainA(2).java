package methodEmbedding.Standing_Ovation.S.LYD734;

import java.util.Scanner;

public class MainA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int t = 1; t <= T; t++) {
            sc.next();
            String nums = sc.next();
            int count = 0, sp = 0;
            for (int i=0;i<nums.length();i++) {
                int n = nums.charAt(i) - '0';
                if (i<=sp){
                    sp += n;
                } else if (n>0) {
                    int add = i - sp;
                    count += add;
                    sp+=add+n;
                }
            }
            System.out.println("Case #" + t + ": " + count);
        }
    }
}
