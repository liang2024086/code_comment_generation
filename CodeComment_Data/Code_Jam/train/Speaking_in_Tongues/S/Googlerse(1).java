package methodEmbedding.Speaking_in_Tongues.S.LYD185;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Bhanu
 */

import java.util.*;

public class Googlerse {

public static void main(String arg[]) throws Exception
{
    java.io.BufferedReader bin = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
    int T  = Integer.parseInt(bin.readLine());
    char map[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    for(int i = 1 ; i <= T ; i++)
    {
        String buf = bin.readLine();
            char[] to= buf.toCharArray();
        for(int k =0 ; k < buf.length();k++)
        {
            if(buf.charAt(k) != ' '){
            int ind = buf.charAt(k) - 'a';
            to[k] = map[ind]; }
        }

            System.out.println("Case #"+i+": "+String.valueOf(to));
    }
}

}
