package methodEmbedding.Counting_Sheep.S.LYD142;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dr = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dc = {0, 1, 0, -1, 1, 1, -1, -1};

    public static void main(String[] args) throws Exception{
        int T = Integer.parseInt(br.readLine());
        int cases = 0;
        while(T-- != 0){
            int N = Integer.parseInt(br.readLine());
            pw.format("Case #%d: ", ++cases);
            if(N == 0){
                pw.print("INSOMNIA\n");
                continue;
            }

            HashSet<Integer> hs = new HashSet<Integer>();
            for(int i = 0; i < 10; i++){
                hs.add(i);
            }

            long total = 0;
            while(hs.size() > 0){
                total += N;
                String str = String.valueOf(total);
                for(int i = 0; i < str.length(); i++){
                    int c = str.charAt(i) - '0';
                    if(hs.contains(c)){
                        hs.remove(c);
                    }
                }
            }
            pw.print(total + "\n");
        }

        pw.close();
        br.close();
    }
}
