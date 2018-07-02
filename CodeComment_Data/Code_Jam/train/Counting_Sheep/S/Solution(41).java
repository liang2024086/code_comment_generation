package methodEmbedding.Counting_Sheep.S.LYD509;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by d6831 on 31/03/16.
 */
public class Solution {


    public static void main(String[] args) throws FileNotFoundException {

        String input = args[0];

        Scanner scanner = new Scanner(new FileInputStream(input));

        final int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {

            final int N = scanner.nextInt();

            if (N == 0) {
                System.out.println("Case #" + i + ": " + "INSOMNIA");
            } else {

                List<Integer> digits = new ArrayList<Integer>(10);
                digits.add(0);
                digits.add(1);
                digits.add(2);
                digits.add(3);
                digits.add(4);
                digits.add(5);
                digits.add(6);
                digits.add(7);
                digits.add(8);
                digits.add(9);

                int j = 1;
                int T;
                do {
                    T = j * N;

                    String tS = "" + T;

                    for (int k = 0; k < tS.length(); k++) {
                        digits.remove(Integer.valueOf(tS.substring(k, k + 1)));
                    }

                    j++;
                } while (digits.size() > 0);

                System.out.println("Case #" + i + ": " + T);
            }


        }

    }
}
