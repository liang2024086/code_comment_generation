package methodEmbedding.Speaking_in_Tongues.S.LYD632;


import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A_Speaking_in_Tongues {

    private static boolean SMALL = true;
    private static String PROBLEM = "A";
    
    private static final char[] to   = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File(String.format("%s-%s.in", PROBLEM, (SMALL ? "small" : "large"))));
            PrintWriter pw = new PrintWriter(new File(String.format("%s-%s.out", PROBLEM, (SMALL ? "small" : "large"))));

            int NUM_CASES = scan.nextInt();
            scan.nextLine();
            System.out.println(String.format("%d test cases:", NUM_CASES));
            long start = System.currentTimeMillis(), t1, left;
            for (int CASE = 1; CASE <= NUM_CASES; ++CASE) {
                t1 = System.currentTimeMillis();
                System.out.print(String.format("%d.[%s] ", CASE, new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(t1))));

                String line = scan.nextLine();
                char[] cvt = new char[line.length()];
                for (int i = 0; i < cvt.length; ++i) {
                    if (line.charAt(i) == ' ') {
                        cvt[i] = ' ';
                    } else {
                        cvt[i] = to[line.charAt(i) - 'a'];
                    }
                }

                String res = String.format("%s", String.valueOf(cvt));
                pw.println(String.format("Case #%d: %s", CASE, res));
                left = (System.currentTimeMillis() - start) * (NUM_CASES - CASE) / CASE;
                System.out.println(String.format("%s (%dms, ~%dms left)", res, (System.currentTimeMillis() - t1), left));
            }
            pw.close();
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
