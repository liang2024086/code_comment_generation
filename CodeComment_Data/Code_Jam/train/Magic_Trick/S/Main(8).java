package methodEmbedding.Magic_Trick.S.LYD1550;

import java.io.*;
import java.math.BigInteger;

/**
 * Created by Aditya on 3/31/14.
 */

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader in = new BufferedReader(new FileReader(new File("G:/A-small-attempt2.in")));
        PrintWriter  out = new PrintWriter(new File("G:/out.txt"));
        int T = Integer.parseInt(in.readLine());
        int index = 1;
        while(T-- > 0) {

            int row1 = Integer.parseInt(in.readLine());
            int[][] a = new int[4][4];
            for(int i = 0; i < 4; i++) {
                String[] s = in.readLine().split(" ");
                for(int j = 0; j < 4; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            int row2 = Integer.parseInt(in.readLine());
            int[][] b = new int[4][4];
            for(int i = 0; i < 4; i++) {
                String[] s = in.readLine().split(" ");
                for(int j = 0; j < 4; j++) {
                    b[i][j] = Integer.parseInt(s[j]);
                }
            }
            int match = 0, ans = 0;
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                if(a[row1-1][i] == b[row2-1][j]) {
                    ++match;
                    ans = a[row1-1][i];
                }
            }
            }
            if(match == 1)
                out.println("Case #" + index + ": " + ans);
            else if(match > 1)
                out.println("Case #" + index + ": " + "Bad magician!");
            else if(match == 0)
                out.println("Case #" + index + ": " + "Volunteer cheated!");
            out.flush();
            ++index;
        }
        out.close();
    }
}
