package methodEmbedding.Counting_Sheep.S.LYD445;

import java.io.*;
import java.util.Arrays;

public class CountingSheep {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bi.readLine());

        for (int i = 1; i <= t; i++) {
            int[] hasDigit = new int[10];
            int origin = Integer.parseInt(bi.readLine());
            if (origin == 0) {
                out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            int count = 0;
            int current;
            while (true) {
                current = origin * (count += 1);
                int _current = current;
                while (_current > 0) {
                    hasDigit[_current % 10] = 1;
                    _current = _current / 10;
                }
                if (Arrays.stream(hasDigit).noneMatch(d -> d == 0)) {
                    break;
                }
            }
            out.println("Case #" + i + ": " + current);
        }
        out.close();
    }
}
