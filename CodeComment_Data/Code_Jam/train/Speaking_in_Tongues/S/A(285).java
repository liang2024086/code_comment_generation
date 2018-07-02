package methodEmbedding.Speaking_in_Tongues.S.LYD1275;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Mostafa
 */
public class A {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("A.in"));
        PrintWriter out = new PrintWriter(new FileWriter("A.out"));
//
        char [] ch = new char[26];
        ch[0] = 'y';
        ch[1] = 'h';
        ch[2] = 'e';
        ch[3] = 's';
        ch[4] = 'o';
        ch[5] = 'c';
        ch[6] = 'v';
        ch[7] = 'x';
        ch[8] = 'd';
        ch[9] = 'u';
        ch[10] = 'i';
        ch[11] = 'g';
        ch[12] = 'l';
        ch[13] = 'b';
        ch[14] = 'k';
        ch[15] = 'r';
        ch[16] = 'z';
        ch[17] = 't';
        ch[18] = 'n';
        ch[19] = 'w';
        ch[20] = 'j';
        ch[21] = 'p';
        ch[22] = 'f';
        ch[23] = 'm';
        ch[24] = 'a';
        ch[25] = 'q';

        int n = Integer.parseInt(in.readLine());
        StringBuilder ot;
        String s;
        for (int i = 0; i < n; i++) {
            ot = new StringBuilder();
            ot.append("Case #").append(i+1).append(": ");
            s = in.readLine();
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)==' ')ot.append(' ');
                else
                    ot.append(ch[s.charAt(j)-'a']);
            }
            out.println(ot.toString());
        }
        out.close();
    }

}
