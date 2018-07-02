package methodEmbedding.Speaking_in_Tongues.S.LYD272;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * User: rudy
 */
public class Tongues {
    public static void main(String[] args) throws FileNotFoundException {
        char [] map = new char[128];
        Arrays.fill(map, '#');
        map['y'] = 'a';
        map['e'] = 'o';
        map['q'] = 'z';

        map['z'] = 'q';
        map[' '] = ' ';
        for (char [][] input: Arrays.asList(
                new char[][]{
                        "ejp mysljylc kd kxveddknmc re jsicpdrysi".toCharArray(),
                        "our language is impossible to understand".toCharArray()
                },
                new char[][]{
                        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd".toCharArray(),
                        "there are twenty six factorial possibilities".toCharArray(),
                },
                new char[][]{
                        "de kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray(),
                        "so it is okay if you want to just give up".toCharArray()
                }
        )) {
            for (int f = 0; f < input[0].length; f++) {
                map[input[0][f]] = input[1][f];
            }
        }
        /*
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%c %c\n", c, map[c]);
        }
        int sum = 0;
        int sumZ = 0;
        for (int f = 'a'; f <= 'z'; f++) {
            sum += f;
            sumZ += map[f];
        }
        System.out.println(sum == sumZ);
        */
        Scanner scanner = new Scanner(new FileInputStream("A-small-attempt0.in"));
        PrintStream out = new PrintStream(new FileOutputStream("A-small.out"));
        int nTests = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < nTests; test++) {
            String input = scanner.nextLine();
            out.printf("Case #%d: ", test + 1);
            for (char ch: input.toCharArray())
                out.print(map[ch]);
            out.println();
        }
        out.close();
    }
}
