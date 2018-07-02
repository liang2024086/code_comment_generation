package methodEmbedding.Standing_Ovation.S.LYD604;

import java.util.*;
import java.io.*;

public class CodeJamOvation{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int ctr = 0;
            int add = 0;
            for(int j = 0; j <= n; j++){
                int d = s.charAt(j) - '0';
                if(ctr < j){
                    add += (j-ctr);
                    ctr = j;
                }
                ctr += d;
            }
            out.append("Case #" + i + ": " + add + "\n");
        }
        System.out.print(out);
    }
}
