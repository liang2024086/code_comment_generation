package methodEmbedding.Magic_Trick.S.LYD406;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CJ1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("i1.txt"));
        PrintWriter w = new PrintWriter(new File("o1.txt"));
        int n = sc.nextInt();
        int m = n;
        while (n > 0) {
            int row1 = sc.nextInt();
            Set<String> row1s = new HashSet<String>();
            for (int i = 0; i <= 4; i++) {
                String r = sc.nextLine();
                if (row1 == i) {
                    for (String s : r.split(" ")) {
                        row1s.add(s);
                    }
                }
            }
            int row2 = sc.nextInt();
            Set<String> row2s = new HashSet<String>();
            for (int i = 0; i <= 4; i++) {
                String r = sc.nextLine();
                if (row2 == i) {
                    row2s.addAll(Arrays.asList(r.split(" ")));
                }
            }
            List<String> intersection = new ArrayList<String>(row2s);
            intersection.retainAll(row1s);
            int sz = intersection.size();
            if (sz == 1) {
                w.write("Case #" + (m - n + 1) + ": " + intersection.get(0) + "\n");
            } else if (sz == 0) {
                w.write("Case #" + (m - n + 1) + ": Volunteer cheated!\n");
            } else {
                w.write("Case #" + (m - n + 1) + ": Bad magician!\n");
            }
            n--;
        }
        w.close();
    }
}
