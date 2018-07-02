package methodEmbedding.Standing_Ovation.S.LYD920;

import java.io.*;
import java.util.*;
public class Test {

    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        //PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(new FileReader("A-small-attempt1.in"));
        FileWriter fw = new FileWriter("A-small-attempt1.out");
        BufferedWriter bw = new BufferedWriter(fw);
                //PrintWriter pw = new PrintWriter(new FileWriter("A-small-attempt0.out"));
        int ntest = sc.nextInt();

        for (int test = 1; test <= ntest; ++test) {
            int smax = sc.nextInt();
            String s = sc.next();
            char[] c = s.toCharArray();
            int n =c.length;
            int[] d = new int[n];
            int res = 0;
            d[0] = c[0] - '0';
            for (int i = 1; i < d.length; i++) {
                if(d[i-1] < i)
                    if(c[i]-'0' > 0)
                    {
                        int diff = i - d[i-1];
                        res += diff;
                        d[i] = d[i-1] + diff + c[i]-'0'; 
                    }
                    else
                    {
                        d[i] = d[i-1];
                    }
                else
                    d[i] =d[i-1] + c[i] - '0';
            }
            bw.write("Case #" + test + ": " + res + "\n");
        }
        bw.close();
    }
}
