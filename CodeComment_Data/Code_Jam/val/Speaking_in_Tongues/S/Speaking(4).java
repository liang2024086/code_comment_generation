package methodEmbedding.Speaking_in_Tongues.S.LYD1585;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Speaking {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt0.out")));
        char[] re = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a','q',};
        int t = Integer.parseInt(in.readLine());
        System.out.println(re.length);
        for (int q = 1; q <= t; q++) {
            char[] x = in.readLine().toCharArray();
            char[] y = new char[x.length];
            for (int i = 0; i < y.length; i++) {
                if(x[i]==' ')y[i]=x[i];
                else
                y[i] = re[x[i] - 'a'];
            }
            out.write("Case #"+q+": "+new String(y)+"\n");
        }
        out.close();
    }
}
