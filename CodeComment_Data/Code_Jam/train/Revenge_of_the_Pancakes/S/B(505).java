package methodEmbedding.Revenge_of_the_Pancakes.S.LYD95;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by chen on 4/9/16.
 */
public class B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("B.in"));
        PrintWriter out = new PrintWriter(new FileWriter("B.out"));

        int T = Integer.parseInt(in.readLine());

        for (int k = 1; k <= T; k ++) {
            String st = in.readLine();

            int count = 0;
            for (int i = 0; i < st.length() - 1; i ++) {
                if (st.charAt(i) != st.charAt(i + 1)) {
                    count += 1;
                }
            }

            if (st.charAt(st.length() - 1) == '-') {
                count += 1;
            }

            out.printf("Case #%d: %d\n", k, count);
        }

        in.close();
        out.close();
    }
}
