package methodEmbedding.Revenge_of_the_Pancakes.S.LYD943;

import java.util.*;
import java.io.*; 
public class RevengePancakes
{
    public static void main(String args[])throws IOException {
        File inp = new File("D:/GCJ Files/2016 QR/B-small-attempt0.in");
        File outp = new File("D:/GCJ Files/2016 QR/B-small-attempt0.out");
        //File inp = new File("D:/GCJ Files/2016 QR/B-large.in");
        //File outp = new File("D:/GCJ Files/2016 QR/B-large.out");
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(inp);
        PrintWriter out = new PrintWriter(outp);
        int t = in.nextInt();
        in.nextLine();
        for(int i=1; i<=t; i++) {
            String seq = in.nextLine();
            int len = seq.length();
            char sq[] = seq.toCharArray();
            int plus = 0;
            for(int j=0; j<len; j++) {
                if(sq[j] == '+')
                    plus++;
            }
            int ans = 0;
            if(plus == len) {
                out.println("Case #"+i+": "+ans);
                //System.out.println("Case #"+i+": "+ans);
                continue;
            }
            while(plus != len) {
                int cntPlus = 0, cntMinus = 0, j = 0;
                while(sq[j] != '+') {
                    sq[j] = (char)(sq[j] - 2);
                    cntMinus++;
                    j++;
                    if(j == len)
                        break;
                }
                j = 0;
                while(cntMinus == 0 && sq[j] != '-') {
                    sq[j] = (char)(sq[j] + 2);
                    cntPlus++;
                    j++;
                    if(j == len)
                        break;
                }
                plus = plus + cntMinus - cntPlus;
                ans++;
            }
            out.println("Case #"+i+": "+ans);
            //System.out.println("Case #"+i+": "+ans);
        }
        out.close();
        in.close();
    }
}
