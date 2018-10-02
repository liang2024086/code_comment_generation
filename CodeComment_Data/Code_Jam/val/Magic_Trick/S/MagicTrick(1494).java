package methodEmbedding.Magic_Trick.S.LYD1178;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class MagicTrick {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String line;
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        int cases = -1, row = -1, temp, count = 0, case_ind = 1;
        Set<Integer> possibles = new HashSet<Integer>(), valids = new HashSet<Integer>();
        while (true) {
            try {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                if (line.isEmpty()) {
                    continue;
                }
                if (cases < 0) {
                    cases = Integer.parseInt(line);
                } else if (count == 0) {
                    row = Integer.parseInt(line);
                    count = 4;
                } else if (row == 1) {
                    if (possibles.isEmpty()) {
                        for (String token : line.split("\\s+")) {
                            possibles.add(Integer.parseInt(token));
                        }
                    } else {
                        for (String token : line.split("\\s+")) {
                            temp = Integer.parseInt(token);
                            if (possibles.contains(temp)) {
                                valids.add(temp);
                            }
                        }
                        if (valids.isEmpty()) {
                            System.out.printf("\nCase #%d: Volunteer cheated!", case_ind);
                        } else if (valids.size() == 1) {
                            System.out.printf("\nCase #%d: %d", case_ind, valids.toArray()[0]);
                        } else {
                            System.out.printf("\nCase #%d: Bad magician!", case_ind);
                        }
                        valids.clear();
                        possibles.clear();
                        cases -= 1;
                        case_ind += 1;
                    }
                    count -= 1;
                    row -= 1;
                } else {
                    row -= 1;
                    count -= 1;
                }
            } catch (IOException e) {
                System.exit(1);
                return;
            }
        }
        System.out.println("\n");

    }

}
