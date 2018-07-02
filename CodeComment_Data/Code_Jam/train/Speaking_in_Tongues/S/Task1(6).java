package methodEmbedding.Speaking_in_Tongues.S.LYD1299;


import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Yuri
 * Date: 14.04.12
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
public class Task1 {
    static final String[] googlerese = {
            "ejp mysljylc kd kxveddknmc re jsicpdrysi",
            "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
            "de kr kd eoya kw aej tysr re ujdr lkgc jv"};

    static final String[] english = {
            "our language is impossible to understand",
            "there are twenty six factorial possibilities",
            "so it is okay if you want to just give up"
    };

    public static void main(String[] args) throws Exception {
        char[] library = new char[30];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < googlerese[i].length(); j++) {
                if (googlerese[i].charAt(j) != ' ') {
                    library[(int)(googlerese[i].charAt(j) - 'a')] = english[i].charAt(j);
                }
            }
        }
        library[(int) ('q' - 'a')] = 'z';
        library[(int) ('z' - 'a')] = 'q';

        Scanner scanner = new Scanner(new FileInputStream("task11.txt"));
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            StringBuilder translated = new StringBuilder();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (c == ' ') {
                    translated.append(c);
                    continue;
                }
                translated.append(library[c - 'a']);
            }
            System.out.println("Case #" + (i + 1) + ": " + translated);
        }
    }
}
