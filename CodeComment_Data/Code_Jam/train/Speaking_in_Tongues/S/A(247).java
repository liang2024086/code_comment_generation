package methodEmbedding.Speaking_in_Tongues.S.LYD315;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class A {

    public static void main(String[] args) throws IOException {
        char[] ar = new char[26];
        ar[0] = 'y';
        ar[1] = 'h';
        ar[2] = 'e';
        ar[3] = 's';
        ar[4] = 'o';
        ar[5] = 'c';
        ar[6] = 'v';
        ar[7] = 'x';
        ar[8] = 'd';
        ar[9] = 'u';
        ar[10] = 'i';
        ar[11] = 'g';
        ar[12] = 'l';
        ar[13] = 'b';
        ar[14] = 'k';
        ar[15] = 'r';
        ar[16] = 'z';
        ar[17] = 't';
        ar[18] = 'n';
        ar[19] = 'w';
        ar[20] = 'j';
        ar[21] = 'p';
        ar[22] = 'f';
        ar[23] = 'm';
        ar[24] = 'a';
        ar[25] = 'q';
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter("a.out");
        StringBuilder sb;
        int n = Integer.parseInt(in.readLine());
        String s;
        for (int i = 1; i <= n; i++) {
            s=in.readLine().trim();
            sb=new StringBuilder(s.length());
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)==' ')
                    sb.append(' ');
                else
                    sb.append(ar[(int)(s.charAt(j)-'a')]);
            }
            out.append("Case #"+i+": "+sb+"\n");
        }
        out.close();
    }
}
