package methodEmbedding.Counting_Sheep.S.LYD870;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Throwable {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());
        int tn = Integer.parseInt(tokenizer.nextToken());
        for (int test = 1; test <= tn; test++) {
            tokenizer = new StringTokenizer(in.readLine());
            String strnum  = tokenizer.nextToken();
            Set sset = new LinkedHashSet<Character>();
            int elo = Integer.parseInt(strnum);
            int elo2 = elo;
            //char[] ppl = tokenizer.nextToken().toCharArray();
            int counter = 1;
            if(elo == 0) {
                out.print("Case #" + test + ": " + "INSOMNIA");
                if(test < tn) {
                    out.println();
                }
                continue;
            }
            while(true) {
                strnum = Integer.toString(elo2);
                char[] ppom =strnum.toCharArray();
                for (char kek : ppom) {
                    sset.add(kek);
                }
                //sset.addAll(Arrays.asList(ppom)); <-- causes duplicates lol
                if(sset.size() == 10) {
                    break;
                }
                counter++;
                elo2 = elo*counter;
            }


            out.print("Case #" + test + ": " + elo2);
            if(test < tn) {
                out.println();
            }
        }
        in.close();
        out.close();
    }
}
