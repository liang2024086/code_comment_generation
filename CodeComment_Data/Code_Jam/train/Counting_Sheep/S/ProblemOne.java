package methodEmbedding.Counting_Sheep.S.LYD244;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

/**
 * @author vfedorenko on 08/04/16.
 */
public class ProblemOne {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/problem1/input.txt"))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
                Integer n = Integer.parseInt(reader.readLine());

                Set<Integer> numbers = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    String result = "INSOMNIA";

                    Integer t = Integer.parseInt(reader.readLine());

                    int initialT = t;
                    for (int j = 1; t != 0; j++) {
                        int temp = t;
                        while (temp > 0) {
                            numbers.add(temp % 10);
                            temp /= 10;
                        }

                        if (numbers.size() == 10) {
                            break;
                        }

                        t = initialT * j;
                        result = String.valueOf(t);
                    }

                    numbers.clear();
                    writer.write(format("Case #%d: %s\n", i + 1, result));
                }
            }
        }
    }

}
