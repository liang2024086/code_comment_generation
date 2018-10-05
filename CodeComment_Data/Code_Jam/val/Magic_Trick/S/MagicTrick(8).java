package methodEmbedding.Magic_Trick.S.LYD153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException{
        List<String> answers = new ArrayList<String>();

        int round = Integer.parseInt(stdin.readLine());

        for (int i = 0; i < round; i++) {
            Set<Integer> cards1 = new HashSet<Integer>();
            Set<Integer> cards2 = new HashSet<Integer>();
            for (int j = 0; j < 2; j++) {
                int row = Integer.parseInt(stdin.readLine());
                for (int r = 0; r < 4; r++) {
                    String[] tmp = stdin.readLine().split(" ");
                    if (r == row - 1) {
                        for (String t : tmp) {
                            if (j == 0) {
                                cards1.add(Integer.parseInt(t));
                            } else {
                                cards2.add(Integer.parseInt(t));
                            }
                        }
                    }
                }
            }
            List<Integer> results = new ArrayList<Integer>();
            for (int card : cards1) {
                if (cards2.contains(card)) {
                    results.add(card);
                }
            }

            if (results.size() == 0) {
                answers.add("Case #" + (i + 1) + ": Volunteer cheated!");
            } else if (results.size() > 1) {
                answers.add("Case #" + (i + 1) + ": Bad magician!");
            } else {
                answers.add("Case #" + (i + 1) + ": " + results.get(0));
            }
        }

        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}
