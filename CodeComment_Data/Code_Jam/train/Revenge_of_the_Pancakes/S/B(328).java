package methodEmbedding.Revenge_of_the_Pancakes.S.LYD714;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class B {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/magdi/Development/per/codejam/src/com/company/B-small-attempt0.in"));
        PrintWriter printWriter = new PrintWriter(new File("/Users/magdi/Development/per/codejam/src/com/company/b_out.txt"));
        int t = scan.nextInt();
        for (int tt = 1; tt <= t; tt++) {
            String s = scan.next();
            int steps = 0 ;
            for(int i = s.length()-1 ; i >= 0 ; i--){
                char c = s.charAt(i);
                if(c == '+' && steps%2 == 0 || c == '-' && steps%2 == 1)
                    continue;
                steps++;
            }
            printWriter.append(String.format("Case #%d: %d\n",tt,steps));
        }
        printWriter.flush();
        printWriter.close();
    }
}
