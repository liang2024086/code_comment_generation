package methodEmbedding.Standing_Ovation.S.LYD1444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;

public class A {
    public static final String c = "Case #{0}: {1}\n";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/straw/topcoder/src/A.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("A.out"));
        int n = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < n; i++) {
            int ans = 0;
            int num = 0;
            String[] ss = reader.readLine().trim().split(" +");
            for (int j = 0; j < ss[1].length(); j++) {
                int curr = ss[1].charAt(j) - '0';
                if (curr > 0) {
                    if (num < j) {
                        ans += j - num;
                        num += j - num;

                    }
                    num += curr;
                }

            }
            writer.write(MessageFormat.format(c, (i + 1), ans));

        }
        reader.close();
        writer.close();
    }
}
