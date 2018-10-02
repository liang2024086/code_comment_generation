package methodEmbedding.Counting_Sheep.S.LYD266;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lnc432 on 4/8/16.
 */
public class CountingSheep {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        int t = reader.nextInt();

        String[] results = new String[t];

        for(int i=1; i <= t; i++) {

            int num = reader.nextInt();

            if( num == 0) {
                results[i-1] = "Case #" + i + ": INSOMNIA";
            } else {
                boolean complete = false;
                Set<Integer> set = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
                int round = 1;
                while(!complete) {
                    Set<Integer> subSets = new HashSet<>();
                    Arrays.asList((""+ (round * num)).split("")).stream().forEach( element -> subSets.add(element.charAt(0)-'0'));

                    set.removeAll(subSets);

                    if( set.isEmpty()) {
                        results[i-1] = "Case #" + i + ": " + (round * num);
                        complete=true;
                    }

                    round++;
                }
            }
        }

        for( String res : results) {
            System.out.println(res);
        }
    }
}

