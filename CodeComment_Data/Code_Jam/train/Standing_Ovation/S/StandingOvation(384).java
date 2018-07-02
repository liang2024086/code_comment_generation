package methodEmbedding.Standing_Ovation.S.LYD1813;



import java.util.Scanner;

/**
 * Time Complexity :
 * Space Complexity:
 */

public class StandingOvation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            String s = in.next();
            long already = 0;
            long invitation = 0;
            for(int j = 0; j <= m; j++) {
                long have = Integer.parseInt(String.valueOf(s.charAt(j)));
                if(have == 0) continue;
                if(already < j){
                    invitation += j - already;
                    already += have + j - already;
                }
                else {
                    already += have;
                }
            }
            System.out.println("Case #" + (i+1) + ": " + invitation);
        }
    }
}
