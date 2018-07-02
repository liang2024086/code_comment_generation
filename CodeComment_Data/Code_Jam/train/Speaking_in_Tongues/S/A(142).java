package methodEmbedding.Speaking_in_Tongues.S.LYD775;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

    public static void main(String args[]) throws Exception {
        final String PATH = "/home/goalboy/software installation/codejam-commandline-1.0-beta4/source/";
        final String FILE = "A-small-0";
        Scanner in = new Scanner(new File(PATH + FILE + ".in"));
        PrintWriter out = new PrintWriter(PATH + FILE + ".out");

        char map[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

        int test = in.nextInt();
        in.nextLine();
        for (int t = 1; t <= test; t++) {
            String line = in.nextLine();
            out.print("Case #" + t + ": ");
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    out.print(map[ch - 'a']);
                } else {
                    out.print(ch);
                }
            }
            out.println();
        }

        out.close();
    }
}
