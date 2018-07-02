package methodEmbedding.Revenge_of_the_Pancakes.S.LYD532;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class B_RevengeOfThePancakes {
    private static final Logger log = LoggerFactory.getLogger(B_RevengeOfThePancakes.class);

    public static void main (String[] args) throws Exception {
        InputStream in = args.length > 0 ? new BufferedInputStream(new FileInputStream(args[0])) : System.in;
        PrintStream out = args.length > 1 ? new PrintStream(new FileOutputStream(args[1])) : System.out;
        Scanner sc = new Scanner(in);
        int T = parseInt(sc.next());

        for (int t = 1; t <= T; t++) {
            char[] stack = sc.next().toCharArray();
            int numFlip = 0;
            for(int i=0; i<stack.length; i++) {
                char p = stack[i];
                if (i>0) {
                    char prev = stack[i-1];
                    if (prev != p) numFlip++;
                }
            }
            if (stack[stack.length-1] == '-') numFlip++;
            out.println("Case #" + t + ": " + numFlip);
        }
    }
}
