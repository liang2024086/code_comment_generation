package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1168;


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

            //char[] ppl = tokenizer.nextToken().toCharArray();
            int counter = 0;

            strnum = new StringBuilder(strnum).reverse().toString();
            char[] chr = strnum.toCharArray();

            int rs = strnum.length();

            char st = '+';
            for(int i =0; i< rs; ++i) {
                if(chr[i] != st) {
                   // out.print(chr[i] + " " + st + " ");
                    counter ++;
                    st= chr[i];
                }

            }

//            if(counter > 0 && chr[rs-1]=='+') {
//                counter--;
//            }
            out.print("Case #" + test + ": " + counter);
            if(test < tn) {
                out.println();
            }
        }
        in.close();
        out.close();
    }
}
