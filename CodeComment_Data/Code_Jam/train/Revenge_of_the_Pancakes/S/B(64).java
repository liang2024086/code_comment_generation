package methodEmbedding.Revenge_of_the_Pancakes.S.LYD137;

import java.util.Scanner;

/**
 * Created by Benedek on 4/9/2016.
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=1; t<=T; t++) {
            String s = in.nextLine();
            while (s.equals(""))
                s = in.nextLine();
            int ans = 0;
            s = s.replace("+-", "+ -");
            s = s.replace("-+", "- +");
            int numberOfChanges = s.length() - s.replace(" ", "").length();

            ans += numberOfChanges;
            if (s.substring(s.length() - 1).equals("-")){
                ans++;
            }

            System.out.printf("Case #%d: ", t);
            System.out.println(ans);
        }
    }
}
