package methodEmbedding.Counting_Sheep.S.LYD555;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QRA {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("QRA.txt");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                writer.println("Case #" + (i + 1) + ": INSOMNIA");
                continue;
            }
            Set<Character> num = new HashSet<>();
            int k = 1;
            int m = n;
            while (true) {
                char[] chars = String.valueOf(m).toCharArray();
                for (char c : chars) {
                    num.add(c);
                }
                if (num.size() >= 10) {
                    writer.println("Case #" + (i + 1) + ": " + m);
                    break;
                }
                k++;
                m = k * n;
            }
        }
        writer.flush();
        writer.close();
    }

}
