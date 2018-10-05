package methodEmbedding.Standing_Ovation.S.LYD755;

import java.io.*;
import java.util.*;
public class probA
{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File("inA.txt"))));
        int quant = Integer.parseInt(in.readLine());
        for (int a = 0; a < quant; a++) {
            StringTokenizer s1 = new StringTokenizer(in.readLine());
            int num = Integer.parseInt(s1.nextToken());
            int added = 0;
            int total = 0;
            String tm = s1.nextToken();
            for (int x = 0; x < num+1; x++) {
                if (total < x) {
                    //System.out.println(x + " " + total);
                    added += (x-total);
                    total = x;
                }
                total += tm.charAt(x)-'0';
                //System.out.println(total);
            }
            System.out.println("Case #" + (a+1) + ": " + added);
        }
    }
}
