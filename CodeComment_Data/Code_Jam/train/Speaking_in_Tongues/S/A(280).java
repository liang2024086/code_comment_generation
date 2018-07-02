package methodEmbedding.Speaking_in_Tongues.S.LYD387;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A {

    public static void main(String[] args) throws Exception {
        
        String s[] = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
        String m[] = {"our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up"
        };


        HashMap<Character, Character> h = new HashMap<Character, Character>();
        h.put('z', 'q');
        h.put('q', 'z');
        for (int i = 0; i < 3; i++) {
            String st=s[i];
            String mt=m[i];
            for (int j = 0; j < mt.length(); j++) {
                h.put(st.charAt(j), mt.charAt(j));
            }
        }
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt1.out")));
        int t = Integer.parseInt(in.readLine());
        for (int q = 1; q <= t; q++) {
          String st=in.readLine();
          
            out.write("Case #"+q+": ");
            for (int i = 0; i <st.length(); i++) {
                out.write(h.get(st.charAt(i)));
            }
        out.write("\n");

        }
        out.close();

    }
}

