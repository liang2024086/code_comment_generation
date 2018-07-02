package methodEmbedding.Speaking_in_Tongues.S.LYD1634;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author g
 */
public class Google2012a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // learn mappings
            HashMap<Character,Character> translate = new HashMap<>();
            String[] g = new String[4];
            String[] e = new String[4];
            g[0] = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
            g[1] = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
            g[2] = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
            g[3] = "y qee";
            e[0] = "our language is impossible to understand";
            e[1] = "there are twenty six factorial possibilities";
            e[2] = "so it is okay if you want to just give up";
            e[3] = "a zoo";
            for (int i=0; i<4; i++) {
                for (int j=0; j<g[i].length(); j++) {
                    translate.put(g[i].charAt(j), e[i].charAt(j));
                }
            }
            
            HashSet<Character> ee = new HashSet<>();
            HashSet<Character> gg = new HashSet<>();
            for (Character c : translate.keySet()) {
                System.out.println(translate.get(c));
                gg.add(c);
                ee.add(translate.get(c));
            }            
            
            char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                              'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
                              'u', 'v', 'w', 'x', 'y', 'z', ' '};
                        
            for (int i=0; i<english.length; i++)
                if (!gg.contains(english[i])) {
                    System.out.println("Missing gg:" + english[i]);
                }
            for (int i=0; i<english.length; i++)
                if (!ee.contains(english[i])) {
                    System.out.println("Missing ee:" + english[i]);
                }
            
            translate.put('z', 'q');
            System.out.println("length: " + translate.size());
            
            //*
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            int numCases = Integer.parseInt(reader.readLine());
            for (int i=0; i<numCases; i++) {
                line = reader.readLine();
                StringBuilder result = new StringBuilder();
                for (int j=0; j<line.length(); j++) {
                    char t = translate.get(line.charAt(j));
                    result.append(t);
                }
                System.out.println("Case #" + (i+1) + ": " + result.toString());
            }//*/
        } catch (Exception ex) {
            Logger.getLogger(Google2012a.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
