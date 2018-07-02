package methodEmbedding.Speaking_in_Tongues.S.LYD1366;


import java.io.*;
import java.util.*;

public class GoogleWords {

    static String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi\n" +
            "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\n" +
            "de kr kd eoya kw aej tysr re ujdr lkgc jv";
    
    static String s2 = "our language is impossible to understand\n" +
            "there are twenty six factorial possibilities\n" +
            "so it is okay if you want to just give up";
    
    public static void main(String[] args) throws IOException {
        
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        Map<Character, Character> m = new HashMap<Character, Character>();
        for (int i = 0; i < chars.length; i++) {
            m.put(chars[i], chars1[i]);
        }

        if (!m.containsKey('z'))
            m.put('z', 'q');
        if (!m.containsKey('a'))
            m.put('a', 'y');
        if (!m.containsKey('q'))
            m.put('q', 'z');

        for (char letter = 'a'; letter <= 'z'; letter++)
            System.out.print(letter);

        Scanner scanner = new Scanner(new File("D:\\MyPr\\TopCoder\\practice\\src\\codejam\\A-small-attempt1.in"));
        Writer writer = new OutputStreamWriter(new FileOutputStream("D:\\MyPr\\TopCoder\\practice\\src\\codejam\\A-small-attempt.out"));
        Integer n = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println();
            String l = scanner.nextLine();
            char[] out = new char[l.length()];
            for (int j = 0; j < l.length(); j++) {
                System.out.print(l.charAt(j));
                out[j] = m.get(l.charAt(j));
            }
            writer.write("Case #" + i + ": " + String.valueOf(out));
            writer.write(System.getProperty("line.separator"));
        }

        writer.close();



    }
}
