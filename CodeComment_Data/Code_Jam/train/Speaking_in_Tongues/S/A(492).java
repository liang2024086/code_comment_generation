package methodEmbedding.Speaking_in_Tongues.S.LYD394;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author LeongYan
 */
public class SpeakInTounges {
    public static void main(String[] args) {
        String n =  " abcdefghijklmnopqrstuvwxyz";
        String g1 = " ynficwlbkuomxsevzpdrjgthaq";
        String g2 = " ynficwlzkuomxsevbpdrjgthaq";
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        String[] inp = new String[t];
        for (int i = 0; i < t; i++) {
            inp[i] = s.nextLine();
        }
        for (int i = 0; i < t; i++) {
            String out = "";
            for (int j = 0; j < inp[i].length(); j++) {
                int a = g1.indexOf(inp[i].charAt(j));
                out = out + n.charAt(a);  
            }
            System.out.println("Case #" + (i + 1) + ": " + out);
        }
    }
}
