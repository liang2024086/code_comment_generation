package methodEmbedding.Revenge_of_the_Pancakes.S.LYD901;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mkg
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class ProbB {

    private static final String INPUT = "C:\\Users\\mkg\\Desktop\\Code Jam Qualification Round 2016\\B-small-attempt0.in";
    private static final String OUTPUT = "C:\\Users\\mkg\\Desktop\\Code Jam Qualification Round 2016\\B-small-attempt0.out";

    public static void main(String[] args) {
        FileInputStream instream = null;
        PrintStream ostream = null;
        try {
            instream = new FileInputStream(INPUT);
            System.setIn(instream);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ostream = new PrintStream(new FileOutputStream(OUTPUT));
            System.setOut(ostream);
        } catch (Exception e) {
            System.out.println(e);
        }
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);
        int Test = cin.nextInt(), Res;
        StringBuffer str;
        for (int kase = 0; kase < Test; kase++) {
            str = new StringBuffer();
            str.append(cin.next());
            Res = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == '-') {
                    Res += 1;
                    for (int j = 0; j < i; j++) {
                        if (str.charAt(j) == '-') {
                            str.setCharAt(j, '+');
                        } else {
                            str.setCharAt(j, '-');
                        }
                    }
                }
            }
            cout.println("Case #" + (kase + 1) + ": " + Res);
        }
        cin.close();
        cout.close();
    }
}
