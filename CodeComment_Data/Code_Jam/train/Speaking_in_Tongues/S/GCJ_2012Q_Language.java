package methodEmbedding.Speaking_in_Tongues.S.LYD1429;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mondodello
 */
public class GCJ_2012Q_Language {
    
    private static final Map<Character, Character> mappings = new HashMap<Character, Character>();
    static {
        String keySet1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
        String valSet1 = "our language is impossible to understand";

        String keySet2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
        String valSet2 = "there are twenty six factorial possibilities";

        String keySet3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String valSet3 = "so it is okay if you want to just give up";
        
        
        for (int i = 0 ; i < keySet1.length(); i++) {
            mappings.put(keySet1.charAt(i), valSet1.charAt(i));
        }

        for (int i = 0 ; i < keySet2.length(); i++) {
            mappings.put(keySet2.charAt(i), valSet2.charAt(i));
        }

        for (int i = 0 ; i < keySet3.length(); i++) {
            mappings.put(keySet3.charAt(i), valSet3.charAt(i));
        }
        mappings.put('q', 'z');
        mappings.put('z', 'q');

/*

        Set<Character> keys = mappings.keySet();
        Collection<Character> values = mappings.values();

        ArrayList<Character> sortedKeys = new ArrayList<Character>(keys);
        Collections.sort(sortedKeys);
        ArrayList<Character> sortedValues = new ArrayList<Character>(values);
        Collections.sort(sortedValues);

        System.out.println("mappings = " + mappings);
        System.out.println("size = " + mappings.size());

        System.out.println("sortedKeys = " + sortedKeys);
        System.out.println("sortedValues = " + sortedValues);
*/
    }
    
    public static void main(String[] args) throws IOException {
        String inputFile = "in.txt";
        String outputFile = "out.txt";

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        PrintWriter pw = new PrintWriter(new FileWriter(outputFile));

        int numOfTestCases = Integer.parseInt(br.readLine());

        for (int t = 0; t < numOfTestCases; t++) {
            String encryptedText = br.readLine();
            StringBuilder decryptedText = new StringBuilder(encryptedText.length());
            
            for (int i = 0 ; i < encryptedText.length(); i++) {
                decryptedText.append(mappings.get(encryptedText.charAt(i)));
            }

            System.out.println("Case #" + (t + 1) + ": " + decryptedText.toString());
            pw.println("Case #" + (t + 1) + ": " + decryptedText.toString());
        }

        pw.close();
        br.close();
    }
}
