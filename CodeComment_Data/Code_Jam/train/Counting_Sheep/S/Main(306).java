package methodEmbedding.Counting_Sheep.S.LYD1256;


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        String output = "";
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            List<Boolean> list=new ArrayList<>(Arrays.asList(new Boolean[10]));
            Collections.fill(list, Boolean.FALSE);
            if (n == 0) {
                output += "Case #"+i+": INSOMNIA\n";
            } else {
                int j;
                outer: for (j = 1; j <= 200; j++) {
                    int num = j*n;
                    while (num > 0) {
                        int d = num / 10;
                        int k = num - d * 10;
                        num = d;
                        list.set(k, Boolean.TRUE);
                        if(!list.contains(Boolean.FALSE))
                            break outer;
                    }
                }
                output += "Case #"+i+": "+j*n+"\n";
            }
        }
        System.out.println(output);
    }
}
