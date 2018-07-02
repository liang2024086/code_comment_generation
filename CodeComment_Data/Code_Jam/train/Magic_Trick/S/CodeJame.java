package methodEmbedding.Magic_Trick.S.LYD373;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;

public class CodeJame {

    public static void main(String[] args) throws IOException {
        int t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        t = Integer.parseInt(br.readLine());
        int count = t;
        String row1[] = null;
        String row2[] = null;
        int row;
        while (t-- > 0) {
            row = Integer.parseInt(br.readLine());
            for (int i = 1; i <= 4; i++) {
                String str;
                str = br.readLine();
                if (i == row) {
                    row1 = str.split(" ");
                }
            }
            row = Integer.parseInt(br.readLine());
            for (int i = 1; i <= 4; i++) {
                String str;
                str = br.readLine();
                if (i == row) {
                    row2 = str.split(" ");
                }
            }
            HashSet<String> map = new HashSet<>();
            row = 0;
            String ans = null;
            map.addAll(Arrays.asList(row1));
            for (String i : row2) {
                if (map.contains(i)) {
                    ans = i;
                    row++;
                }
            }
            if (row == 0) {
                pw.println("Case #" + (count - t) + ": Volunteer cheated!");
            } else if (row == 1) {
                pw.println("Case #" + (count - t) + ": "+ans);
            } else {
                pw.println("Case #" + (count - t) + ": Bad magician!");
            }
        }
        pw.flush();
        pw.close();
    }

}
