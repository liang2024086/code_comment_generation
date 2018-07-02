package methodEmbedding.Cookie_Clicker_Alpha.S.LYD327;



import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class QualProblemB {


    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(new File("B-small-attempt0.in"));
        PrintStream ps = new PrintStream(new File("B-small-attempt0.out"));

        int T = in.nextInt();

        for(int tc = 1; tc <= T; tc++) {
            double r = 2.0;

            
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            
            
            double t = 0.0;
            double xT;
            
            while((c/r + x/(r+f)) < (xT = (x/r))) {
                t += c/r;
                r += f;
            }
            
            t += (x/r);
            
            ps.println(String.format("Case #%d: %.7f", tc, t));
        }
        
    }
    
}
