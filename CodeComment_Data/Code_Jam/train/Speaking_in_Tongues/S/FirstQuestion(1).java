package methodEmbedding.Speaking_in_Tongues.S.LYD1377;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author karim
 */
public class FirstQuestion {

    static Map<Character, Character> googlereseToEnglishMap = new HashMap<Character, Character>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        String googlereseHint = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qee";
        String itsEnglishTranslation = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zoo";
        for (int index = 0; index < googlereseHint.length(); index++) {
           
            googlereseToEnglishMap.put(googlereseHint.charAt(index), itsEnglishTranslation.charAt(index));
        }

         googlereseToEnglishMap.put('z', 'q');
        googlereseToEnglishMap.put('q', 'z');
         BufferedWriter out = new BufferedWriter(new FileWriter("output.out"));
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt7.in"));
        int numOfcases = Integer.parseInt(in.readLine());
        for (int caseNum = 1; caseNum <= numOfcases; caseNum++) {
            String input = in.readLine();
            StringBuilder output = new StringBuilder();
            for (int letterIndex = 0; letterIndex < input.length(); letterIndex++) {
                output = output.append(googlereseToEnglishMap.get(input.charAt(letterIndex)) != null ? googlereseToEnglishMap.get(input.charAt(letterIndex)) : input.charAt(letterIndex) );
            }

            out.write("Case #" + caseNum + ": " + output);
            out.newLine();

        }
        //out.flush();
        out.close();
        in.close();
    }
}
