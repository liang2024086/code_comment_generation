package methodEmbedding.Revenge_of_the_Pancakes.S.LYD528;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author FSOCIETY
 */
public class B {
    static final String FILENAME = "B-small-attempt0";
    static String IN = FILENAME + ".in";
    static String OUT = "sub-0.out";
    public static void main(String... juice) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new File(IN));
        BufferedWriter out = new BufferedWriter(new FileWriter(OUT));
                int t = scanner.nextInt();
          for (int i=0;i<t;i++) {
              String S = scanner.next();
              int M = 0;
              while (S.contains("-")) {
                  char p = S.charAt(0);
                  int fCount = 1;
                  for (int j=1; j<S.length();j++) {
                      boolean b = false;
                      b = p == S.charAt(j);
                      if (b) {
                          fCount++;
                      } else {
                          j = S.length();
                      }
                  }
                  String B = S.substring(fCount, S.length());
                  StringBuilder Sb = new StringBuilder();
                  for (int k=0; k<fCount; k++) {
                      Sb.append(S.charAt(k)=='-' ? '+' : '-');
                  }
                  S = Sb.toString() + B;
                  M++;
              }
              out.write("case #"+(i+1)+": "+M);
                out.newLine();
                out.flush();
          }
          scanner.close();
                out.close();
    }
}
