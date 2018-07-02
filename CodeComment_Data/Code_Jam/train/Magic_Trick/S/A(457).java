package methodEmbedding.Magic_Trick.S.LYD1578;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saveln
 * Date: 12.04.14
 * Time: 23:19
 */
public class A {
    public static void main(String[] args) throws FileNotFoundException {
        int T = 0;
        Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
        int f, s, cur;
        T = scanner.nextInt();
        PrintWriter out = new PrintWriter(new File("out.txt"));
        for (int i = 1; i <= T; i++) {
            int []m = new int[17];
            f = scanner.nextInt();
            for (int j = 1; j <= 4; j++) {
                for(int k = 0; k < 4; k++) {
                    cur = scanner.nextInt();
                    if(j == f){
                        m[cur] = 1;
                    }
                }
            }
            f = scanner.nextInt();
            int res = 0, rr = -1;
            for (int j = 1; j <= 4; j++) {
                for(int k = 0; k < 4; k++) {
                    cur = scanner.nextInt();
                    if(j == f && m[cur] == 1){
                        res++;
                        rr = cur;
                    }
                }
            }
            String r = res == 0 ? "Volunteer cheated!" : (res == 1 ? Integer.toString(rr) : "Bad magician!");
            out.write(String.format("Case #%d: %s\n", i, r));
        }
        out.close();
    }
}
