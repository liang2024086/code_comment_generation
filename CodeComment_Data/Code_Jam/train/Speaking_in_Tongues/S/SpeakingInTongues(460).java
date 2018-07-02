package methodEmbedding.Speaking_in_Tongues.S.LYD789;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author topik
 */
public class SpeakingInTongues
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final char[] map = new char['z' + 1];
        final String[][] examples = new String[][] {
            {"y qee", "a zoo"},
            {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "our language is impossible to understand"},
            {"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "there are twenty six factorial possibilities"},
            {"de kr kd eoya kw aej tysr re ujdr lkgc jv", "so it is okay if you want to just give up"}
        };
        
        final Set<Character> notMapped = new HashSet<Character>();
        for( char c = 'a'; c <= 'z'; c++ )
        {
            notMapped.add(c);
        }        
        
        for( String[] example : examples )
        {
            for( int i=0; i < example[0].length(); i++ )
            {
                map[example[0].charAt(i)] = example[1].charAt(i);
                notMapped.remove( Character.valueOf(example[1].charAt(i)) );
            }
        }
        
        map['z'] = 'q';
        
        final Scanner scanner = new Scanner(System.in);
        final int testCases = scanner.nextInt();
        scanner.nextLine();
        for( int tc=1; tc <= testCases; tc++ )
        {
            System.out.print("Case #" + tc + ": ");
            final String line = scanner.nextLine();
            for( int i=0; i < line.length(); i++ )
            {
                System.out.print( map[line.charAt(i)] );
            }
            System.out.println();
        }
    }
}
