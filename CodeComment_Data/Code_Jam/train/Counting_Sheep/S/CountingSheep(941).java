package methodEmbedding.Counting_Sheep.S.LYD1045;


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by nitin.s on 09/04/16.
 */
public class CountingSheep {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("in.txt"));
        PrintWriter out = new PrintWriter(new FileWriter(new File("out.txt")));
        int T = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= T; ++t) {
            int N = in.nextInt();
            if(N == 0) {
                sb.append("Case #" + t + ": " + "INSOMNIA\n");
                continue;
            }
            Set<Integer> digits = new HashSet<Integer>();
            int cnt = 1;
            int answer = N;
            while(true) {
                int num = N * cnt;
                if(num == 0) {
                    digits.add(0);
                } else {
                    while (num != 0) {
                        digits.add(num % 10);
                        num /= 10;
                    }
                }
                if(digits.size() == 10) {
                    break;
                }
                ++cnt;
                answer = N * cnt;
            }
            sb.append("Case #" + t + ": " + answer + "\n");
        }
        out.write(sb.toString());
        out.close();
    }
}
