package methodEmbedding.Speaking_in_Tongues.S.LYD930;

import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //PrintWriter pw = new PrintWriter(System.out);
        //Scanner sc = new Scanner(new FileReader("A.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("A.out"));

        String alph = "yhesocvxduiglbkrztnwjpfmaq";
        final int A = 97;
        int N = Integer.parseInt(sc.nextLine());

        for(int test = 1; test <= N; test++) {
            pw.print("Case #" + test + ": ");
            String in = sc.nextLine();
            for(int i = 0; i < in.length(); i++) {
                if(in.charAt(i) >= 'a' && in.charAt(i) <= 'z') {
                    pw.print(alph.charAt(in.charAt(i) - A));
                } else {
                    pw.print(in.charAt(i));
                }
            }
            pw.println();
        }

        pw.close();
        sc.close();
    }

//    public static void main(String[] args) {
//        String pattern1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi" +
//                          "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" +
//                          "de kr kd eoya kw aej tysr re ujdr lkgc jv";
//        String pattern2 = "our language is impossible to understand" +
//                          "there are twenty six factorial possibilities" +
//                          "so it is okay if you want to just give up";
//        char[] alph = new char[26];
//        final int A = 97;
//        for(int i = 0; i < pattern1.length(); i++) {
//            if(pattern1.charAt(i) >= 'a' && pattern1.charAt(i) <= 'z') {
//                alph[pattern1.charAt(i) - A] = pattern2.charAt(i);
//            }
//        }
//        for(int i = 0; i < alph.length; i++) {
//            System.out.println((char)(i + A) + "  " + alph[i]);
//            //System.out.println(alph[i]);
//        }
////        alph[(int)'a' - A] = 'y';
////        alph[(int)'z' - A] = 'q';
////        alph[(int)'q' - A] = 'z';
////        for(int i = 0; i < alph.length; i++) {
////            System.out.print(alph[i]);
////        }
//    }
}
