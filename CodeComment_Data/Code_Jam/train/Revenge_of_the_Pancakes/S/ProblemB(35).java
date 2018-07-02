package methodEmbedding.Revenge_of_the_Pancakes.S.LYD499;

import java.io.*;
import java.util.Collections;

/**
 * Created by andrei on 09.04.2016.
 */
public class ProblemB {

    public static void main( String[] args ) throws Exception {
        FileInputStream fis = new FileInputStream("/home/andrei/Desktop/input.in");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

        PrintWriter writer = new PrintWriter("/home/andrei/Desktop/output.out", "UTF-8");
        int t = Integer.valueOf(reader.readLine());
        for (int i = 1; i <= t; ++i) {
            String stack = reader.readLine();
            int signChanges = 0;
            int limit = stack.length() - 1;
            for (int j = 0; j < limit; ++j) {
                if (stack.charAt( j )  != stack.charAt( j + 1 )) {
                    signChanges++;
                }
            }
            if (stack.charAt( stack.length() - 1 ) == '-') {
                signChanges++;
            }
            writer.println("Case #" + i + ": " + signChanges);
            System.out.println("Case #" + i + ": " + signChanges);
        }
        writer.close();

    }
}
