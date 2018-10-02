package methodEmbedding.Counting_Sheep.S.LYD486;

import java.util.*;
import java.io.*; 
public class CountingSheep
{
    public static void main(String args[])throws IOException {
        File inp = new File("D:/GCJ Files/2016 QR/A-small-attempt0.in");
        File outp = new File("D:/GCJ Files/2016 QR/A-small-attempt0.out");
        //File inp = new File("D:/GCJ Files/2016 QR/A-large.in");
        //File outp = new File("D:/GCJ Files/2016 QR/A-large.out");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(inp);
        PrintWriter out = new PrintWriter(outp);
        long answer[] = new long[1000001];
        int t = 1000000;
        for(int i=1; i<=t; i++) {
            boolean digit[] = new boolean[10];
            long n = i;
            int cnt = 0, j = 1;
            long ans = n;
            while(cnt < 10) {
                ans = j*n;
                long temp = ans;
                while(temp > 0) {
                    int mod = (int)(temp % 10);
                    if(!digit[mod]) {
                        digit[mod] = true;
                        cnt++;
                    }
                    temp = temp / 10;
                }
                j++;
            }
            answer[i] = ans;           
        }
        t = in.nextInt();
        for(int i=1; i<=t; i++) {
            int n = in.nextInt();
            if(n == 0) {
                out.println("Case #"+i+": INSOMNIA");
                continue;
            }
            long ans = answer[n];
            out.println("Case #"+i+": "+ans);
            //System.out.println("Case #"+i+": "+ans);
        }
        out.close();
        in.close();
    }
}
