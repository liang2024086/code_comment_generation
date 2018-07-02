package methodEmbedding.Standing_Ovation.S.LYD1071;


import java.io.*;

/**
 * Created by shubham.srivastava on 12/04/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new FileWriter(new File("out.txt")));
        int T = Integer.parseInt(buf.readLine());
        for(int i = 1; i<=T;i++) {
            String s = buf.readLine();
            String a[] = s.split(" ");
            int maxS = Integer.parseInt(a[0]);

            String b = a[1];
            int con[] = new int[maxS+1];
            for(int j = 0;j<b.length();j++) {
                String temp = "";
                con[j] = Integer.parseInt((temp+b.charAt(j)));
            }

            int p[] = new int[b.length()];
            p[0] = con[0];
            int res = 0;

            for(int j = 1;j<=maxS;j++) {
                if(p[j-1]<j) {
                    int c = (j-p[j-1]);
                    p[j-1]+=c;
                    res+=c;
                }
                p[j] = p[j-1]+con[j];
            }
//            System.out.println("Case #"+i+": "+res);
            System.out.println(String.format("Case #%d: %d", i, res));

        }
    }
}
