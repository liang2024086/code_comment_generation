package methodEmbedding.Magic_Trick.S.LYD1207;


import java.io.*;
import java.util.*;
import java.math.*;


public class MagicTrick {
    public static void main(String args[]) throws Exception {
        BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader(new File("src/qualifiers2014/"
                + fin.readLine())));
        FileWriter out = new FileWriter(new File("src/qualifiers2014/MagicTrick.out"));

        int T = Integer.parseInt(in.readLine());
        for (int t = 1; t <= T; t++) {
            int row = Integer.parseInt(in.readLine());
            String s = "";
            int i;
            for (i = 0; i < row; i++) s = in.readLine();
            while (i++ < 4) in.readLine();
            StringTokenizer st = new StringTokenizer(s);
            ArrayList<Integer> poss = new ArrayList<Integer>();
            while (st.hasMoreTokens()) poss.add(Integer.parseInt(st.nextToken()));
            row = Integer.parseInt(in.readLine());
            for (i = 0; i < row; i++) s = in.readLine();
            while (i++ < 4) in.readLine();
            st = new StringTokenizer(s);
            ArrayList<Integer> stillposs = new ArrayList<Integer>();
            while (st.hasMoreTokens()) {
                int foo = Integer.parseInt(st.nextToken());
                if (poss.contains(foo)) stillposs.add(foo);
            }
            
            String ans;
            if (stillposs.size() == 0) ans = "Volunteer cheated!";
            else if (stillposs.size() > 1) ans = "Bad magician!";
            else ans = stillposs.get(0).toString();

            out.write(String.format("Case #%d: ", t));
            out.write(ans);
            out.write("\n");
        }

        fin.close();
        in.close();
        out.close();
    }
}
