package methodEmbedding.Revenge_of_the_Pancakes.S.LYD519;


import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int testCase = 1; testCase <= T; ++testCase) {
            final String line = sc.nextLine();
            int ngroups = 0;
            char last = '.';
            for (char c: line.toCharArray()) {
                if (c != last) {
                    ++ngroups;
                    last = c;
                }
            }
            if (last == '+') {
                --ngroups;
            }
            System.out.printf("Case #%d: %d\n", testCase, ngroups);
        }
    }
}
