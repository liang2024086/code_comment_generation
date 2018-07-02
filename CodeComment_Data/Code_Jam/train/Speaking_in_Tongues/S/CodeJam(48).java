package methodEmbedding.Speaking_in_Tongues.S.LYD1654;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader fin = null;
        FileWriter fout = null;
        try {
            char[] con = new char[255];
            con['a'] = 'y';   con['b'] = 'h';   con['c'] = 'e';   con['d'] = 's';
            con['e'] = 'o';   con['f'] = 'c';   con['g'] = 'v';   con['h'] = 'x';
            con['i'] = 'd';   con['j'] = 'u';   con['k'] = 'i';   con['l'] = 'g';
            con['m'] = 'l';   con['n'] = 'b';   con['o'] = 'k';   con['p'] = 'r';
            con['q'] = 'z';   con['r'] = 't';   con['s'] = 'n';   con['t'] = 'w';
            con['u'] = 'j';   con['v'] = 'p';   con['w'] = 'f';   con['x'] = 'm';
            con['y'] = 'a';   con['z'] = 'q';   con[' '] = ' ';
            fin = new FileReader("input.txt");
            fout = new FileWriter("Output.txt");
            BufferedWriter out = new BufferedWriter(fout);
            BufferedReader in = new BufferedReader(fin);
            int t;
            t = Integer.parseInt(in.readLine());
            int j = 0;
            while (t > j) {
                String s;
                StringBuilder k = new StringBuilder();
                s = in.readLine();
                
                for (int i = 0; i < s.length(); i++) {
                    k.append(con[s.charAt(i)]);
                }
                out.write("Case #" + (j + 1) + ": " + k.toString() + "\n");
                out.flush();
                j ++;
            }
        } catch (IOException ex) {
            Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fin.close();
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
}
