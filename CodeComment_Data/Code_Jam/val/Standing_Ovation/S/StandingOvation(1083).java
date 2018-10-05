package methodEmbedding.Standing_Ovation.S.LYD1370;


import java.util.Scanner;

/**
 * Created by misanand on 4/11/15.
 */
public class StandingOvation {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int tt =1; tt <=T;tt++) {
            int sMax = scanner.nextInt();
            String list = scanner.next();
            int invited = 0;
            int total = 0;
            for (int i=0;i<list.length();i++) {
                int count = list.charAt(i) - '0';
                if (count == 0) continue;
                int req = 0;
                if (i > total) {
                    req = i-total;
                    invited+=req;
                }
                total+=count + req;
            }
            System.out.println("Case #"+tt+": "+invited);
        }
        scanner.close();
    }
}
