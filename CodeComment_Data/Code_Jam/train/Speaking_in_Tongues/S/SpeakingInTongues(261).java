package methodEmbedding.Speaking_in_Tongues.S.LYD1514;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author langlv
 */
public class SpeakingInTongues {

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(new FileReader("C:\\A-small-attempt4.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\A-small-attempt4.out"));
        try {
            String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
            String s2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
            String s3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
            String e1 = "our language is impossible to understand";
            String e2 = "there are twenty six factorial possibilities";
            String e3 = "so it is okay if you want to just give up";

            HashMap<String, String> map = new HashMap<String, String>();

            for (int i = 0; i < s1.length(); i++) {
                map.put(String.valueOf(s1.charAt(i)), String.valueOf(e1.charAt(i)));
            }
            for (int i = 0; i < s2.length(); i++) {
                map.put(String.valueOf(s2.charAt(i)), String.valueOf(e2.charAt(i)));
            }
            for (int i = 0; i < s3.length(); i++) {
                map.put(String.valueOf(s3.charAt(i)), String.valueOf(e3.charAt(i)));
            }
            map.put("z", "q");
            map.put("q", "z");

            for (String k : map.keySet()) {
                System.out.println(k + " => " + map.get(k));
            }
            System.out.println(map.size());


            int ntest = Integer.parseInt(sc.nextLine());

            for (int test = 1; test <= ntest; ++test) {
                String s = sc.nextLine();

                String res = "";

                for (int i = 0; i < s.length(); i++) {
                    if (map.containsKey(String.valueOf(s.charAt(i)))) {
                        res += map.get(String.valueOf(s.charAt(i)));
                    } else {
                        res += String.valueOf(s.charAt(i));
                    }
                }


                pw.print("Case #" + test + ": ");
                pw.print(res);
                pw.println();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            pw.close();
            sc.close();
        }
    }
}
