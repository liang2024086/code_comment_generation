package methodEmbedding.Magic_Trick.S.LYD169;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.Set;

/**
 * @author  tasyrkin
 * @since   2014/04/12
 */
public class MagicTrick {

    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(br.readLine());
        int init = t;
        while (t-- > 0) {
            int row1 = Integer.parseInt(br.readLine());

            Set<Integer> firstRow = new HashSet<Integer>();

            for (int i = 0; i < 4; i++) {
                String[] parts = br.readLine().split("\\s+");
                if (i + 1 == row1) {
                    for (int j = 0; j < parts.length; j++) {
                        firstRow.add(Integer.parseInt(parts[j]));
                    }
                }
            }

            int row2 = Integer.parseInt(br.readLine());

            int found = -1;
            for (int i = 0; i < 4; i++) {
                String[] parts = br.readLine().split("\\s+");
                if (i + 1 == row2) {
                    for (int j = 0; j < parts.length; j++) {
                        int curr = Integer.parseInt(parts[j]);
                        if (firstRow.contains(curr)) {
                            if (found > 0) {
                                found = 100;
                            } else {
                                found = curr;
                            }
                        }
                    }
                }
            }

            String res;
            if (found == 100) {
                res = "Bad magician!";
            } else if (found < 0) {
                res = "Volunteer cheated!";
            } else {
                res = String.valueOf(found);
            }

            System.out.println("Case #" + (init - t) + ": " + res);
        }

    }

}
