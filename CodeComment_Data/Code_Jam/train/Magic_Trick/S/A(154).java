package methodEmbedding.Magic_Trick.S.LYD1831;

import java.util.*;
import java.io.*;

public class A {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("A.out"));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            pw.print("Case #" + (i + 1) + ": ");

            String result = "";
            List<Integer> p = new ArrayList<Integer>();

            int r = Integer.parseInt(br.readLine());
            for (int j = 1; j <= 4; j++) {
                StringTokenizer tok = new StringTokenizer(br.readLine());
                for (int k = 1; k <= 4; k++) {
                    String tok_ = tok.nextToken();
                    int num = Integer.parseInt(tok_);
                    if (j == r) {
                        p.add(num);
                    }
                }
            }

            boolean done = false;
            r = Integer.parseInt(br.readLine());
            for (int j = 1; j <= 4; j++) {
                StringTokenizer tok = new StringTokenizer(br.readLine());
                for (int k = 1; k <= 4; k++) {
                    String tok_ = tok.nextToken();
                    int num = Integer.parseInt(tok_);
                    if (j == r) {
                        if (p.contains(num)) {
                            if (result.equals("")) {
                                result = Integer.toString(num);
                            } else {
                                if (!done) {
                                    pw.println("Bad magician!");
                                    done = true;
                                }
                            }
                        }
                    }
                }
            }

            if (!done) {
                if (result.equals("")) {
                    pw.println("Volunteer cheated!");
                } else {
                    pw.println(result);
                }
            }
        }

        pw.flush();
    }
}
