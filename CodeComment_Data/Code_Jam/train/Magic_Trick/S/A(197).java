package methodEmbedding.Magic_Trick.S.LYD834;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) throws Throwable {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("/Users/jk/A.in"))) {
            int numCases = Integer.parseInt(reader.readLine());

            for (int c = 1; c <= numCases; c++) {
                Set<Integer> ints1 = null;
                int line = Integer.parseInt(reader.readLine());
                for (int m = 1; m <= 4; m++) {
                    String s = reader.readLine();
                    if (m == line) {
                        ints1 = Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
                    }
                }
                Set<Integer> ints2 = null;
                line = Integer.parseInt(reader.readLine());
                for (int m = 1; m <= 4; m++) {
                    String s = reader.readLine();
                    if (m == line) {
                        ints2 = Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
                    }
                }
                ints1.retainAll(ints2);
                if (ints1 == null || ints2 == null) {
                    System.out.println("Case #" + c + ": Volunteer cheated!");
                } else {
                    switch (ints1.size()) {
                    case 0:
                        System.out.println("Case #" + c + ": Volunteer cheated!");
                        break;
                    case 1:
                        System.out.println("Case #" + c + ": " + ints1.iterator().next());
                        break;
                    default:
                        System.out.println("Case #" + c + ": Bad magician!");
                        break;
                    }
                }
            }
        }
    }
}
