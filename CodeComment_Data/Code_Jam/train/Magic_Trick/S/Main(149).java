package methodEmbedding.Magic_Trick.S.LYD1117;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
                PrintWriter out = new PrintWriter("A-small-attempt0.out"))
        {
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            int t = Integer.parseInt(tokens.nextToken());
            for (int tt = 1; tt <= t; tt++) {
                tokens = new StringTokenizer(in.readLine());
                int q = Integer.parseInt(tokens.nextToken());
                Set<Integer> set1 = new HashSet<>();
                for (int i = 1; i < 5; i++) {
                    tokens = new StringTokenizer(in.readLine());
                    if (i == q) {
                        for (int j = 0; j < 4; j++) {
                            set1.add(Integer.parseInt(tokens.nextToken()));
                        }
                    }
                }
                tokens = new StringTokenizer(in.readLine());
                q = Integer.parseInt(tokens.nextToken());
                Set<Integer> set2 = new HashSet<>();
                for (int i = 1; i < 5; i++) {
                    tokens = new StringTokenizer(in.readLine());
                    if (i == q) {
                        for (int j = 0; j < 4; j++) {
                            set2.add(Integer.parseInt(tokens.nextToken()));
                        }
                    }
                }
                set1.retainAll(set2);
                out.print("Case #" + tt + ": ");
                if (set1.size() > 1) {
                    out.println("Bad magician!");
                } else if (set1.size() == 0) {
                    out.println("Volunteer cheated!");
                } else {
                    out.println(set1.iterator().next());
                }
            }
        }
    }
}
