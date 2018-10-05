package methodEmbedding.Cookie_Clicker_Alpha.S.LYD737;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        for(int i = 1; i <= n; i++) {
            double c = s.nextDouble();
            double f = s.nextDouble();
            double x = s.nextDouble();
           
            double time = 0.0;
            double cookiesPerSec = 2.0;

            while(true) {
                double timeWithoutFactory = time + x / cookiesPerSec;
                double timeUntilFactory = time + c / cookiesPerSec;
                double timeWithFactory = timeUntilFactory + x / (cookiesPerSec + f);
                if(timeWithFactory <= timeWithoutFactory) {
                    time = timeUntilFactory;
                    cookiesPerSec += f;
                } else {
                    time = timeWithoutFactory;
                    break;
                }
            }

            System.out.println("Case #" + i + ": " + time);
        }
    }
}

