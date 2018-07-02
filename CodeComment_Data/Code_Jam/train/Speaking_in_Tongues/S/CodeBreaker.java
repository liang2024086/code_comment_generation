package methodEmbedding.Speaking_in_Tongues.S.LYD955;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fedez
 */
public class CodeBreaker
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<String> in, xlate;
        int i;
        char[] abc;
        char[] xabc;
        char[] tmpCharArray;

        in = new ArrayList<String>();
        in.add("ejp mysljylc kd kxveddknmc re jsicpdrysi");
        in.add("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd");
        in.add("de kr kd eoya kw aej tysr re ujdr lkgc jv");

        xlate = new ArrayList<String>();
        xlate.add("our language is impossible to understand");
        xlate.add("there are twenty six factorial possibilities");
        xlate.add("so it is okay if you want to just give up");

        abc = new char[128];
        xabc = new char[128];
        for (i = 0; i < 128; i++)
        {
            abc[i] = (char) i;
            //System.out.println("" + abc[i]);
        }
        xabc['a'] = 'y';
        xabc['o'] = 'e';
        xabc['z'] = 'q';
        xabc['q'] = 'z'; //only z is not mapped

        String line = in.get(0);
        String xline = xlate.get(0);
        for (i = 0; i < line.length(); i++)
        {
            xabc[xline.charAt(i)] = line.charAt(i);
        }

        line = in.get(1);
        xline = xlate.get(1);
        for (i = 0; i < line.length(); i++)
        {
            xabc[xline.charAt(i)] = line.charAt(i);
        }

        line = in.get(2);
        xline = xlate.get(2);
        for (i = 0; i < line.length(); i++)
        {
            xabc[xline.charAt(i)] = line.charAt(i);
        }

        String map = "";
        String xmap = "";
        for ( i = 97; i < 97 + 26; i ++)
        {
            map +=  abc[i];
            xmap +=  xabc[i];
            if ( xabc[i] == '\0' )
            {
                System.out.println("EMPTY: " + abc[i]);
            }
            else
            {
                System.out.println("" + abc[i] + "=>" + xabc[i]);
            }
        }
        System.out.println(" Map\n" + map);
        System.out.println("XMap\n" + xmap);
        tmpCharArray = xmap.toCharArray();
        Arrays.sort(tmpCharArray);
        System.out.println("XMap\n" + new String(tmpCharArray));
    }
}
