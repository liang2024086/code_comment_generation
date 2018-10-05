package methodEmbedding.Speaking_in_Tongues.S.LYD379;


import java.io.*;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author ATe
 */
public class Main {

    static final String FILE = "A-small-attempt1";
    static final String INPUT = FILE + ".in";
    static final String OUTPUT = FILE + ".out";
    //
    static final String MAPPING = "ynficwlbkuomxsevzpdrjgthaq";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int T, X;
        String G, S;

        PrintWriter pw;
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT))) {
            pw = new PrintWriter(OUTPUT);
            T = Integer.parseInt(br.readLine());
            for (X = 1; X <= T; X++) {
                G = br.readLine();
                S = "";
                for (int i = 0; i < G.length(); i++) {
                    if (G.charAt(i) == ' ') {
                        S += ' ';
                    } else {
                        for (int j = 0; j < 26; j++) {
                            if (MAPPING.charAt(j) == G.charAt(i)) {
                                S += (char) ('a' + j);
                            }
                        }
                    }
                }
                System.out.println("Case #" + X + ": " + S);
                pw.println("Case #" + X + ": " + S);


            }
        }
        pw.close();
    }
}
