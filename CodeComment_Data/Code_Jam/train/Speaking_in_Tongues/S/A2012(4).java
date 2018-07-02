package methodEmbedding.Speaking_in_Tongues.S.LYD1157;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class A2012 {
    
    public static void main(String[] args) throws FileNotFoundException {      
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("ejp mysljylc kd kxveddknmc re jsicpdrysi", "our language is impossible to understand");
        dictionary.put("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "there are twenty six factorial possibilities");
        dictionary.put("de kr kd eoya kw aej tysr re ujdr lkgc jv", "so it is okay if you want to just give up");
        
        HashMap<Character, Character> letters = new HashMap<Character, Character>(29);
        
        for (Iterator<Map.Entry<String, String>> it = dictionary.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            for (int i = 0; i < entry.getKey().length(); i++) {
                letters.put(entry.getKey().charAt(i), entry.getValue().charAt(i));
            }
        }
        letters.put('q', 'z');
        letters.put('z', 'q');
        
        Scanner scanner = new Scanner(new File("C:/docs/codejam/2012/A-small-attempt0.in"));
        PrintWriter output = new PrintWriter(new File("C:/docs/codejam/2012/A_small_out.txt"));
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String goog = scanner.nextLine();
            StringBuilder builder = new StringBuilder(goog.length());
            for (int j = 0; j < goog.length(); j++) {
                builder.append(letters.get(goog.charAt(j)));
            }
            String eng = builder.toString();
            System.out.println(goog + " --> " + eng);
            output.println("Case #" + (i + 1) + ": " + eng);
        }
        scanner.close();
        output.close();
    }

}
