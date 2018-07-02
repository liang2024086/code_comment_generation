package methodEmbedding.Speaking_in_Tongues.S.LYD1319;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Character;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInTounge {
    static Map<Character, Character> charMap = new HashMap<Character, Character>();

    // 'a' -> 'y', 'o' -> 'e', and 'z' -> 'q'
    static {
        charMap.put('y', 'a');
        charMap.put('e', 'o');
        charMap.put('q', 'z');
        charMap.put('z', 'q');
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] input = new String[] {
            "ejp mysljylc kd kxveddknmc re jsicpdrysi",
            "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
            "de kr kd eoya kw aej tysr re ujdr lkgc jv" };
        String output[] = new String[] {
            "our language is impossible to understand",
            "there are twenty six factorial possibilities",
            "so it is okay if you want to just give up" };
        for ( int i = 0; i < input.length; i++ ) {
            String in = input[i];
            String out = output[i];
            for ( int j = 0; j < in.length(); j++ ) {
                char c = in.charAt(j);
                char mc = out.charAt(j);
                charMap.put(c, mc);
            }
        }
        // Collection<Character> values = charMap.values();
        // Collection<Character> keys = charMap.keySet();
        // Character k = null;
        // Character v = null;
        // for ( int i = 97; i < 97 + 26; i++ ) {
        //
        // if ( v==null &&!values.contains((char) i) ) {
        // v = (char) i;
        // }
        // if(k == null && !keys.contains((char)i)){
        // k = (char)i;
        // }
        // if(k!= null && v != null){
        // break;
        // }
        // }

        try {
            BufferedReader inputReader = new BufferedReader(new FileReader(
                "input"));
            String line = inputReader.readLine();
            int number = Integer.parseInt(line);
            for ( int i = 0; i < number; i++ ) {
                String result ="Case #" + (i+1) + ": ";
                line = inputReader.readLine();
                for ( int j = 0; j < line.length(); j++ ) {
                    result+= charMap.get(line.charAt(j)); 
                }
                System.out.println(result);
            }
        } catch ( FileNotFoundException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch ( IOException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
