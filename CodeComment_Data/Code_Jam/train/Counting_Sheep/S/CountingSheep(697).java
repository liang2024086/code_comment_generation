package methodEmbedding.Counting_Sheep.S.LYD1675;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.max;
import static java.lang.Integer.parseInt;

public class CountingSheep {

    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("A-small-attempt0.out")))) {
            int tests = parseInt(in.readLine().trim());
            for (int t = 0; t < tests; t++) {
                int n = parseInt(in.readLine().trim());
                long sum = 0;
                Set<Character> set = new HashSet<>();
                Long answer = null;
                for (int i = 1; i <= max(100, n); i++) {
                    sum += n;
                    String ssum = sum + "";
                    for (int j = 0; j < ssum.length(); j++) {
                        set.add(ssum.charAt(j));
                    }
                    if (set.size() == 10) {
                        answer = sum;
                        break;
                    }
                }
                out.write("Case #" + (t + 1) + ": " + (answer != null ? answer : "INSOMNIA"));
                out.newLine();
            }
        }
    }
}
