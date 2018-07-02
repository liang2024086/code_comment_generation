package methodEmbedding.Speaking_in_Tongues.S.LYD1576;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class GCJ1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        String e = "abcdefghijklmnopqrstuvwxyz";
        String g = "ynficwlbkuomxsevzpdrjgthaq";
        for(int i = 0; i < T; i++)
        {
            String l = scan.nextLine();
            String r = "";
            for(int j = 0; j < l.length(); j++)
            {
                char c = l.charAt(j);
                if(c != ' ')
                {
                    int idx = g.indexOf(c);
                    r += e.charAt(idx);
                }
                else
                    r += ' ';
            }
            System.out.println("Case #"+(i+1)+": "+r);
        }
    }
}
