package methodEmbedding.Magic_Trick.S.LYD1756;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String name = "A-small-attempt1";
        String path = "";

        Locale.setDefault(Locale.US);

        PrintWriter out = new PrintWriter(path + name + ".out");
        Scanner in = new Scanner(new File(path + name + ".in"));
//		Scanner in = new Scanner(System.in);
//		PrintWriter out = new PrintWriter(System.out);

        int testCases = in.nextInt();
        for (int testCase = 1; testCase <= testCases; testCase++) {
            int row1 = in.nextInt();
            int [][]a=new int[4][4];
            for(int i=0;i<4;i++)for(int j=0;j<4;j++)a[i][j]=in.nextInt();
            int row2 = in.nextInt();
            int [][]b=new int[4][4];
            for(int i=0;i<4;i++)for(int j=0;j<4;j++)b[i][j]=in.nextInt();
            row1--;
            row2--;
            Set<Integer> numbs = new HashSet<>();
            for(int i=0;i<4;i++) {
                for(int j=0;j<4;j++) {
                    if (a[row1][i]==b[row2][j]) {
                        numbs.add(b[row2][j]);
                    }
                }
            }
            String res = "";
            if (numbs.size()>1) {
                res="Bad magician!";
            } else if (numbs.size()==0) {
                res = "Volunteer cheated!";
            } else {
                res = ""+numbs.iterator().next();
            }

            out.println(String.format("Case #%d: %s", testCase, res));

            out.flush();
        }

        out.close();
        in.close();
    }
}
