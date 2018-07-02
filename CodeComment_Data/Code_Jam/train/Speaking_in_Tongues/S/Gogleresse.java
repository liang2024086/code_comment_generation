package methodEmbedding.Speaking_in_Tongues.S.LYD1006;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Gogleresse {

    public static void main(String[] args) throws Exception {
        String[] back = {
            "ejp mysljylc kd kxveddknmc re jsicpdrysi",
            "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
            "de kr kd eoya kw aej tysr re ujdr lkgc jv"
        };
        
        String[] straight = {
            "our language is impossible to understand",
            "there are twenty six factorial possibilities",
            "so it is okay if you want to just give up"
        };
        
        Map<Character, Character> mapping = new HashMap<Character, Character>();
        
        Set<Character> chars1 = new HashSet<Character>();
        Set<Character> chars2 = new HashSet<Character>();
        
        for (char c = 'a'; c <= 'z'; c++) {
            chars1.add(c);
            chars2.add(c);
        }
        
        for (int i = 0; i < 3; i++) {
            String str = straight[i];
            String bck = back[i];
            for (int j = 0; j < str.length(); j++) {
                mapping.put(bck.charAt(j), str.charAt(j));
                chars1.remove(bck.charAt(j));
                chars2.remove(str.charAt(j));
            }
        }
        
        int kot = mapping.size();

        char c1 = chars1.iterator().next();
        char c2 = chars2.iterator().next();
        
        mapping.put('q', 'z');
        mapping.put('z', 'q');
        
        BufferedReader reader = new BufferedReader(new FileReader("input4.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output1.txt"));
        int cases = Integer.parseInt(reader.readLine());
        
        for (int cs = 1; cs <= cases; cs++) {
            String bck = reader.readLine();
            String str = "";
            for (int i = 0; i < bck.length(); i++) {
                str += mapping.get(bck.charAt(i));
            }
                    
            writer.write("Case #" + cs + ": " + str + "\r\n");
        }
        
        writer.close();
    }
}
