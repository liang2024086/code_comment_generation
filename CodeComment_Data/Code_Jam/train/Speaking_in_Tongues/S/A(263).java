package methodEmbedding.Speaking_in_Tongues.S.LYD1152;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("file.in"));
        PrintStream out = new PrintStream(new FileOutputStream("file.out"));

        Map<Character, Character> mapping = new HashMap<Character, Character>();

        boolean[] allChar = new boolean[26];

        for (int i = 0; i < 26; i++) {
            allChar[i] = false;
        }

        String[] english = new String[] {
                "our language is impossible to understand",
                "there are twenty six factorial possibilities",
                "so it is okay if you want to just give up", "a zoo" };

        String[] googlerese = new String[] {
                "ejp mysljylc kd kxveddknmc re jsicpdrysi",
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
                "de kr kd eoya kw aej tysr re ujdr lkgc jv", "y qee" };

        for (int i = 0; i < english.length; i++) {
            for (int j = 0, l = english[i].length(); j < l; j++) {
                if (english[i].charAt(j) != ' ') {
                    mapping.put(googlerese[i].charAt(j),english[i].charAt(j));
                    allChar[english[i].charAt(j) - 'a'] = true;

                }
            }
        }

        for (char i = 'a'; i <= 'z' && mapping.size() < 26; i++) {
            if (mapping.get(i) == null) {
                for (int j = 0; j < 26 && mapping.size() < 26; j++) {
                    if (!allChar[j]) {
                        mapping.put(i, ((char) ('a' + j)));
                    }
                }
            }

        }

        int nLines = Integer.parseInt(in.readLine());

        String s;

        for (int i = 1; i <= nLines; i++) {
            s = in.readLine();

            StringBuffer result = new StringBuffer();

            for (int j = 0, l = s.length(); j < l; j++) {

                if (s.charAt(j) == ' ') {
                    result.append(' ');
                } else {
                    result.append(mapping.get(s.charAt(j)));
                }
            }

            out.println("Case #" + i + ": " + result);
        }

        in.close();
        out.close();

    }
}
