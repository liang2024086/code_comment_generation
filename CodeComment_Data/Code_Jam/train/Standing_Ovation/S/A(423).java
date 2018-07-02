package methodEmbedding.Standing_Ovation.S.LYD1256;

import java.io.File;
import java.util.Scanner;


public class A {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File(args[0]));
        
        int T = in.nextInt();

        in.nextLine();
        for (int i = 0; i < T; i++) {
            String[] tmp = in.nextLine().split(" ");
            int S_max = Integer.parseInt(tmp[0]);
            String audience = tmp[1];
            
            // Now solve the problem for this test case
            int currentStandUp = 0;
            int friends = 0;
            
            for (int j = 0; j <= S_max; j++) {
                if (j <= currentStandUp) {
                    currentStandUp += audience.charAt(j) - '0'; 
                } else if (audience.charAt(j) > '0') {
                    // try to activate by invite more friends
                    friends += j - currentStandUp;
                    currentStandUp += (friends + (audience.charAt(j) - '0'));
                }
            }
            System.out.println("Case #" + String.valueOf(i + 1) +": " + String.valueOf(friends));
        }
    }

}
