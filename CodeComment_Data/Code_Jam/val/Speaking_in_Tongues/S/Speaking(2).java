package methodEmbedding.Speaking_in_Tongues.S.LYD1172;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aalopez
 */
public class Speaking {

    public static void main(String[] args) {
        String input = "A-small-attempt0";

        Path pathin = FileSystems.getDefault().getPath(input + ".in");
        Path pathout = FileSystems.getDefault().getPath(input + ".out");
        
        //map english letters to Googlerese
        char[][] chars = new char[][]{
            {'a', 'y'}, {'b', 'n'}, {'c', 'f'}, {'d', 'i'}, {'e', 'c'}, {'f', 'w'}, {'g', 'l'},
            {'h', 'b'}, {'i', 'k'}, {'j', 'u'}, {'k', 'o'}, {'l', 'm'}, {'m', 'x'}, {'n', 's'},
            {'o', 'e'}, {'p', 'v'}, {'q', 'z'}, {'r', 'p'}, {'s', 'd'}, {'t', 'r'}, {'u', 'j'},
            {'v', 'g'}, {'w', 't'}, {'x', 'h'}, {'y', 'a'}, {'z', 'q'}, {' ', ' '}
        };
        
        //map Googlerese to english letters
        Map<Character,Character> map = new HashMap<>();
        for(int i  = 0; i< chars.length; i++)
        {
            map.put(chars[i][1], chars[i][0]);
        }

        try (PrintWriter pout = new PrintWriter(Files.newOutputStream(pathout, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE))) {
            List<String> lines = Files.readAllLines(pathin, Charset.forName("UTF-8"));

            int countLines = lines.size();
            StringBuffer strb = null;
            String str = null;
            char letter = ' ';
            for (int i = 1; i < countLines; i++) {
                strb = new StringBuffer();
                letter = ' ';
                str = lines.get(i);
                for (int j = 0; j < str.length(); j++) {
                    letter = str.charAt(j);
                    strb.append(map.get(letter));
                }
                pout.printf("Case #%d: %s\n", i, strb.toString());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
