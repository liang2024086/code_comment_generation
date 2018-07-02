package methodEmbedding.Standing_Ovation.S.LYD16;

import java.util.Scanner;

public class A {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int k = 1; k <= t; k++) {
            String[] ss = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ss[0]);
            String s = ss[1];

            int curr = s.charAt(0) - '0';
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                {
                    if (s.charAt(i) != '0' && curr < i) {
                        ans += (i - curr);
                        //System.out.println(i + " adding " + (i - curr));
                        curr += (i - curr);
                    }

                    curr += (s.charAt(i) - '0');
                }
            }

            System.out.println("Case #" + k + ": " + ans);
        }
    }

}
