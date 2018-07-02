package methodEmbedding.Speaking_in_Tongues.S.LYD129;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class ReverseWords {

    static private char[] map = new char[256];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        map[(int) 'a'] = 'y';
        map[(int) 'b'] = 'h';
        map[(int) 'c'] = 'e';
        map[(int) 'd'] = 's';
        map[(int) 'e'] = 'o';
        map[(int) 'f'] = 'c';
        map[(int) 'g'] = 'v';
        map[(int) 'h'] = 'x';
        map[(int) 'i'] = 'd';
        map[(int) 'j'] = 'u';
        map[(int) 'k'] = 'i';
        map[(int) 'l'] = 'g';
        map[(int) 'm'] = 'l';
        map[(int) 'n'] = 'b';
        map[(int) 'o'] = 'k';
        map[(int) 'p'] = 'r';
        map[(int) 'q'] = 'z';
        map[(int) 'r'] = 't';
        map[(int) 's'] = 'n';
        map[(int) 't'] = 'w';
        map[(int) 'u'] = 'j';
        map[(int) 'v'] = 'p';
        map[(int) 'w'] = 'f';
        map[(int) 'x'] = 'm';
        map[(int) 'y'] = 'a';
        map[(int) 'z'] = 'q';
        map[(int) ' ']= ' ';

        // TODO code application logic here
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("A-large-practice.in")));
            StringBuffer sb = new StringBuffer();
            String strLine;

            String strNum = r.readLine();
            int intNum = 1;
            while ((strLine = r.readLine()) != null) {

                if (strLine.trim().length() != 0) {
                    System.out.print("Case #" + intNum + ": ");
                    intNum++;
                    for (int i = 0; i < strLine.length(); i++) {
                        System.out.print(map[strLine.charAt(i)]);
                    }
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
