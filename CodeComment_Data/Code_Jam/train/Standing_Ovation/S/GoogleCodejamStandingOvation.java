package methodEmbedding.Standing_Ovation.S.LYD1217;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GoogleCodejamStandingOvation {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream(args[0]));
        int T = in.nextInt();
        for (int i = 1; i <= T; i++) {
            int Smax = in.nextInt();
            String[] peoplesSj = in.nextLine().trim().split("");
            int currentStandingPeoples = 0;
            int result = 0;
            for (int j = 0; j <= Smax; j++) {
                int peopleSj = Integer.parseInt(peoplesSj[j+1]);
                if (peopleSj > 0 && currentStandingPeoples < j) {
                    result += j - currentStandingPeoples;
                    currentStandingPeoples += result;
                }
                currentStandingPeoples += peopleSj;
            }
            System.out.println("Case #" + i + ": " + result);
        }
    }
}
