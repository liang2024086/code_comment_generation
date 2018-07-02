package methodEmbedding.Counting_Sheep.S.LYD61;


import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

/**
 * Created by popeye on 4/8/16.
 */
public class CountingSheep {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("/Users/popeye/workspaces/interviews/Algorithms/src/competitions/codejam/data/A-small-attempt0.in"));
        PrintWriter writer = new PrintWriter("/Users/popeye/workspaces/interviews/Algorithms/src/competitions/codejam/data/A-small-attempt0.out", "UTF-8");

        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            long N = sc.nextLong();

            if(N == 0) {
                writer.println("Case #" + (i + 1) + ": INSOMNIA");
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            } else {

                Map<Integer, Integer> map = new HashMap<>();
                for (int j = 0; j < 10; j++) {
                    map.put(j, 0);
                }

                int counter = 0;

                int multiplier = 1;
                do {
                    long current = N * multiplier;
                    multiplier++;
                    while (current > 0) {
                        if (map.get((int)current % 10) == 0) {
                            map.put((int)(current % 10), 1);
                            counter++;
                        }
                        current = current/10;
                    }
                    if (counter == 10) {
                        writer.println("Case #" + (i + 1) + ": " + N * (multiplier - 1));
                        System.out.println("Case #" + (i + 1) + ": " + N * (multiplier - 1));
                        break;
                    }
                } while (N > 0 && N < Integer.MAX_VALUE);

                if(counter != 10)
                    writer.println("Case #" + (i + 1) + ": INSOMNIA");
            }
        }

        writer.close();
        sc.close();
    }


}
